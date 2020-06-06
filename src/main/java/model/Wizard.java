package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Wizard extends Character {
    private int magic;

    public Wizard() {
    }

    public Wizard(String name, User user) {
        super(name, user);
    }
}
