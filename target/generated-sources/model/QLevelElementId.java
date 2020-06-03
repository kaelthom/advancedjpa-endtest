package model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QLevelElementId is a Querydsl query type for LevelElementId
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QLevelElementId extends BeanPath<LevelElementId> {

    private static final long serialVersionUID = -1603558504L;

    public static final QLevelElementId levelElementId = new QLevelElementId("levelElementId");

    public final NumberPath<Integer> level = createNumber("level", Integer.class);

    public final StringPath name = createString("name");

    public QLevelElementId(String variable) {
        super(LevelElementId.class, forVariable(variable));
    }

    public QLevelElementId(Path<? extends LevelElementId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLevelElementId(PathMetadata metadata) {
        super(LevelElementId.class, metadata);
    }

}

