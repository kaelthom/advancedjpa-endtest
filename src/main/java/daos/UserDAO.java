package daos;

import model.User;

public interface UserDAO extends GenericDao<User, Long> {

    User findUsersByEmail(String email);
}
