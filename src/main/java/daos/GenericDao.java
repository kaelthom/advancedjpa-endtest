package daos;

import java.util.List;

public interface GenericDao<T, K> {

    List<T> findAll();

    T findOne(K id);

    void update(T entity);

    void delete(T entity);

    void deleteByKey(K id);

    void create(T entity);

}
