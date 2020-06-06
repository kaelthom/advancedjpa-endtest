import daos.*;
import model.Character;
import model.*;

import javax.persistence.EntityManagerFactory;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = EMFSingleton.getInstance();
        UserDaoImpl userDAO = new UserDaoImpl();
        CharacterDAO characterDAO = new CharacterDaoImpl();
        LevelElementDao levelElementDao = new LevelElementDaoImpl();

        userDAO.create(new User("user1@gmail.com", "user1"));


        User user1 = userDAO.findUsersByEmail("user1@gmail.com");
        if (user1 != null) {
            characterDAO.create(new Orc("orcOfUser1", user1));
        } else {
            System.out.println("pb. user1 is null");
        }


        List<Character> orcOfUser1 = characterDAO.findCharactersByName("orcOfUser1");

        Item item1 = new Item(new LevelElementId("item1", 10), 10, Color.BLUE);
        levelElementDao.create(item1);
        item1 = (Item) levelElementDao.findOne(new LevelElementId("item1", 10));
        if (!orcOfUser1.isEmpty()) {
            Character orc = orcOfUser1.get(0);
            orc.setHealth(10);
            characterDAO.update(orc);
            item1.getCharacters().clear();
            item1.getCharacters().add(orc);
            levelElementDao.update(item1);
        }

        levelElementDao.create(new Spell(new LevelElementId("spell1", 2), 30, 20));

        Item item2 = new Item(new LevelElementId("item2", 10), 10, Color.BLUE);
        levelElementDao.create(item2);
        item2 = (Item) levelElementDao.findOne(new LevelElementId("item2", 10));
        characterDAO.create(new Wizard("wizardOfUser1", user1));
        List<Character> wizardsOfUser1 = characterDAO.findCharactersByName("wizardOfUser1");
        if (!wizardsOfUser1.isEmpty()) {
            Character wizardOfUser1 = wizardsOfUser1.get(0);
            item1.getCharacters().clear();
            item2.getCharacters().add(wizardOfUser1);
            levelElementDao.update(item2);
            item1.getCharacters().clear();
            item1.getCharacters().add(wizardOfUser1);
            levelElementDao.update(item1);
        }
        emf.close();

    }
}
