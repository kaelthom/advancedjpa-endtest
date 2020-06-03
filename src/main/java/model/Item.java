package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Item extends LevelElement {
    private int durability;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(joinColumns = {
            @JoinColumn(name = "NAME"),
            @JoinColumn(name = "LEVEL")},
            inverseJoinColumns = @JoinColumn(name = "CHARACTERS"))
    private List<Character> characters = new ArrayList<>();

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
