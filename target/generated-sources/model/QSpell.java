package model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSpell is a Querydsl query type for Spell
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSpell extends EntityPathBase<Spell> {

    private static final long serialVersionUID = -600820221L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSpell spell = new QSpell("spell");

    public final QLevelElement _super;

    public final NumberPath<Integer> cost = createNumber("cost", Integer.class);

    public final NumberPath<Integer> damage = createNumber("damage", Integer.class);

    // inherited
    public final QLevelElementId id;

    public QSpell(String variable) {
        this(Spell.class, forVariable(variable), INITS);
    }

    public QSpell(Path<? extends Spell> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSpell(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSpell(PathMetadata metadata, PathInits inits) {
        this(Spell.class, metadata, inits);
    }

    public QSpell(Class<? extends Spell> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QLevelElement(type, metadata, inits);
        this.id = _super.id;
    }

}

