import daos.*;
import model.Character;
import model.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = EMFSingleton.getInstance();

        UserDAO userDAO = new UserDaoImpl();
        userDAO.create(new User("user1@gmail.com", "user1"));

        CharacterDAO characterDAO = new CharacterDaoImpl();

        User user1 = userDAO.findUsersByEmail("user1@gmail.com");
        if (user1 != null) {
            characterDAO.create(new Orc("orcOfUser1", user1));
        } else {
            System.out.println("pb. user1 is null");
        }


        List<Character> orcOfUser1 = characterDAO.findCharactersByName("orcOfUser1");

        orcOfUser1.get(0).setHealth(10);
        characterDAO.update(orcOfUser1.get(0));
        if (!orcOfUser1.isEmpty()) {
            Character orc = orcOfUser1.get(0);
            Item item1 = new Item(new LevelElementId("item1", 2), 10, Color.BLUE);
            EntityManager em = EMFSingleton.getInstance().createEntityManager();
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            em.persist(item1);
            transaction.commit();
            em.close();

            em = EMFSingleton.getInstance().createEntityManager();
            em.close();
            characterDAO.update(orc);

            em = EMFSingleton.getInstance().createEntityManager();
            Item item2 = em.find(Item.class, new LevelElementId("item1", 2));
            item2.getCharacters().add(orc);
            transaction = em.getTransaction();
            transaction.begin();
            em.persist(item2);
            transaction.commit();
            em.close();

        }

        emf.close();

    }
}
