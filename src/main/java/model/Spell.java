package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Spell extends LevelElement {
    private int cost;
    private int damage;

    public Spell(LevelElementId id, int cost, int damage) {
        super(id);
        this.cost = cost;
        this.damage = damage;
    }
}
