package daos;

import model.User;

public interface UserDAO extends GenericDaoImpl<User, Long> {

    User findUsersByEmail(String email);
}
