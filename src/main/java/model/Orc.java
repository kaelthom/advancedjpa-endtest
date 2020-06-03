package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Orc extends Character {
    private int rage;

    public Orc() {
    }

    public Orc(String name, User user) {
        super(name, user);
    }
}
