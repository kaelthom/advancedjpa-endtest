package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

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
    @ManyToMany(mappedBy = "characters")
    private List<Item> items;
    @ManyToOne
    private User user;

    public Character() {
    }

    public Character(String name, User user) {
        this.name = name;
        this.user = user;
    }
}
