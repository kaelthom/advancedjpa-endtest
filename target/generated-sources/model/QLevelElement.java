package model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLevelElement is a Querydsl query type for LevelElement
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLevelElement extends EntityPathBase<LevelElement> {

    private static final long serialVersionUID = 1415089565L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLevelElement levelElement = new QLevelElement("levelElement");

    public final QLevelElementId id;

    public QLevelElement(String variable) {
        this(LevelElement.class, forVariable(variable), INITS);
    }

    public QLevelElement(Path<? extends LevelElement> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLevelElement(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLevelElement(PathMetadata metadata, PathInits inits) {
        this(LevelElement.class, metadata, inits);
    }

    public QLevelElement(Class<? extends LevelElement> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QLevelElementId(forProperty("id")) : null;
    }

}

