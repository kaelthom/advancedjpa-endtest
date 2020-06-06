package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Item extends LevelElement {
    private int durability;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(joinColumns = {
            @JoinColumn(name = "LEVEL"),
            @JoinColumn(name = "NAME")},
            inverseJoinColumns = @JoinColumn(name = "CHARACTER_ID"))
    private Set<Character> characters = new HashSet<>();

    @Enumerated(EnumType.STRING)
    private Color color;

    public Item() {
    }

    public Item(LevelElementId id) {
        super(id);
    }

    public Item(LevelElementId id, int durability, Color color) {
        super(id);
        this.durability = durability;
        this.color = color;
    }


}
