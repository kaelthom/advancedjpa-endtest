package daos;

import model.User;

public interface UserDao extends GenericDao<User, Long> {

    User findUsersByEmail(String email);
}
