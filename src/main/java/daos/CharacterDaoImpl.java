package daos;

import com.querydsl.jpa.JPQLQuery;
import com.querydsl.jpa.impl.JPAQuery;
import model.Character;
import model.QCharacter;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.ArrayList;
import java.util.List;

public class CharacterDaoImpl implements CharacterDAO {

    @Override
    public List<Character> findCharactersByName(String name) {
        EntityManager em = null;
        List<Character> characters = new ArrayList<>();

        try {
            em = emf.createEntityManager();
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            QCharacter character = QCharacter.character;
            JPQLQuery<Character> query = new JPAQuery<>(em);
            characters = query.from(character)
                    .where(character.name.eq(name))
                    .fetch();
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
        return characters;
    }

    @Override
    public String getEntityName() {
        return Character.class.getSimpleName();
    }

    @Override
    public Class<Character> getEntityClass() {
        return Character.class;
    }

}
