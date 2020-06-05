package daos;

import com.querydsl.jpa.JPQLQuery;
import com.querydsl.jpa.impl.JPAQuery;
import model.QUser;
import model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class UserDAOImpl implements UserDAO {
    @Override
    public String getEntityName() {
        return User.class.getSimpleName();
    }

    @Override
    public Class<User> getEntityClass() {
        return User.class;
    }

    @Override
    public User findUsersByEmail(String email) {
        EntityManager em = null;
        User user = null;

        try {
            em = emf.createEntityManager();
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            QUser qUser = QUser.user;
            JPQLQuery<User> query = new JPAQuery<>(em);
            List<User> users = query.from(qUser)
                    .where(qUser.email.eq(email))
                    .fetch();
            if (users.isEmpty()) {
                System.out.println("no users found with email : " + email);
            } else if (users.size() == 1) {
                user = users.get(0);
            } else {
                System.out.println("multiple users with email " + email + ", duplicates, taking the first one");
                user = users.get(0);
            }
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
        return user;
    }

}
