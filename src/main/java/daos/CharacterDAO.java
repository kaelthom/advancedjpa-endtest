package daos;

import daos.GenericDao;
import model.Character;

import java.util.List;

public interface CharacterDAO extends GenericDao<Character, Long> {
    List<Character> findCharactersByName(String name);
}
