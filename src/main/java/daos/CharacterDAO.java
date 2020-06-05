package daos;

import model.Character;

import java.util.List;

public interface CharacterDAO extends GenericDaoImpl<Character, Long> {
    List<Character> findCharactersByName(String name);
}
