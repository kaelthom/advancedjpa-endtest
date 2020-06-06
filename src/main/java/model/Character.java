package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "CHARACTER_TABLE")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private int health;
    private int strength;
    private int level;
    @ManyToMany(mappedBy = "characters", fetch = FetchType.LAZY)
    private Set<Item> items;
    @ManyToOne
    private User user;

    public Character() {
    }

    public Character(String name, User user) {
        this.name = name;
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Character)) return false;
        Character character = (Character) o;
        return getId() == character.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
