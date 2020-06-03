package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "LEVEL_ELEMENT_TYPE")
public class LevelElement {
    @EmbeddedId
    protected LevelElementId id;

    public LevelElement() {
    }

    public LevelElement(LevelElementId id) {
        this.id = id;
    }

}
