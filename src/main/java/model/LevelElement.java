package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LevelElement)) return false;
        LevelElement that = (LevelElement) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
