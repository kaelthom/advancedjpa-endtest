package model;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class LevelElementId implements Serializable {
    private String name;
    private int level;

    public LevelElementId() {
    }

    public LevelElementId(String name, int level) {
        this.name = name;
        this.level = level;
    }
}
