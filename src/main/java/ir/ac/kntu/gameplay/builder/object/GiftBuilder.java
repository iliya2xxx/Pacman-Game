package ir.ac.kntu.gameplay.builder.object;

import ir.ac.kntu.gameplay.EntityType;
import ir.ac.kntu.gameplay.py.ObjectPhy;
import ir.ac.kntu.gameplay.py.Displacement;
import ir.ac.kntu.engine.core.builder.EntityBuilder;
import ir.ac.kntu.engine.graphic.Graphics;
import ir.ac.kntu.engine.phy.BoxCollider;
import ir.ac.kntu.engine.phy.Position;

/**
 * Builder corresponding to gifts
 */
public class GiftBuilder extends EntityBuilder {
    @Override
    public void buildPosition(Position position) {
        entity.setPosition(position);
    }

    @Override
    public void buildName() {
        entity.setName(EntityType.GIFT.name);
    }

    @Override
    public void buildPosition() {
        entity.setPositioning(Displacement.NOTHING.orientation);
    }

    @Override
    public void buildPhysComp(double length, double width) {
        Position position1 = new Position(entity.getPosition().getX(), entity.getPosition().getY());
        Position position2 = new Position(entity.getPosition().getX() + length, entity.getPosition().getY() + width);

        entity.setPhysicsComponent(new ObjectPhy(new BoxCollider(position1, position2)));
    }

    @Override
    public void buildGraphComp(double length, double width) {
        Graphics graphics = new Graphics(0);
        graphics.setImage("/Image/object/giftCoin.png");
        graphics.setHeight(width);
        graphics.setWidth(length);
        entity.setGraphicsComponent(graphics);
    }

    @Override
    public void buildContComp() {

    }
}
