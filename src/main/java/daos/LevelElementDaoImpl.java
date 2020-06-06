package daos;

import model.LevelElement;

public class LevelElementDaoImpl implements LevelElementDao {
    @Override
    public String getEntityName() {
        return LevelElement.class.getSimpleName();
    }

    @Override
    public Class<LevelElement> getEntityClass() {
        return LevelElement.class;
    }
}
