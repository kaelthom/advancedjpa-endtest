package model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrc is a Querydsl query type for Orc
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QOrc extends EntityPathBase<Orc> {

    private static final long serialVersionUID = -2011799941L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrc orc = new QOrc("orc");

    public final QCharacter _super;

    //inherited
    public final NumberPath<Integer> health;

    //inherited
    public final NumberPath<Long> id;

    //inherited
    public final ListPath<Item, QItem> items;

    //inherited
    public final NumberPath<Integer> level;

    //inherited
    public final StringPath name;

    public final NumberPath<Integer> rage = createNumber("rage", Integer.class);

    //inherited
    public final NumberPath<Integer> strength;

    // inherited
    public final QUser user;

    public QOrc(String variable) {
        this(Orc.class, forVariable(variable), INITS);
    }

    public QOrc(Path<? extends Orc> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOrc(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOrc(PathMetadata metadata, PathInits inits) {
        this(Orc.class, metadata, inits);
    }

    public QOrc(Class<? extends Orc> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QCharacter(type, metadata, inits);
        this.health = _super.health;
        this.id = _super.id;
        this.items = _super.items;
        this.level = _super.level;
        this.name = _super.name;
        this.strength = _super.strength;
        this.user = _super.user;
    }

}

