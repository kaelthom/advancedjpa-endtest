package model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QWizard is a Querydsl query type for Wizard
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QWizard extends EntityPathBase<Wizard> {

    private static final long serialVersionUID = -1336890384L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QWizard wizard = new QWizard("wizard");

    public final QCharacter _super;

    //inherited
    public final NumberPath<Integer> health;

    //inherited
    public final NumberPath<Long> id;

    //inherited
    public final ListPath<Item, QItem> items;

    //inherited
    public final NumberPath<Integer> level;

    public final NumberPath<Integer> magic = createNumber("magic", Integer.class);

    //inherited
    public final StringPath name;

    //inherited
    public final NumberPath<Integer> strength;

    // inherited
    public final QUser user;

    public QWizard(String variable) {
        this(Wizard.class, forVariable(variable), INITS);
    }

    public QWizard(Path<? extends Wizard> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QWizard(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QWizard(PathMetadata metadata, PathInits inits) {
        this(Wizard.class, metadata, inits);
    }

    public QWizard(Class<? extends Wizard> type, PathMetadata metadata, PathInits inits) {
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

