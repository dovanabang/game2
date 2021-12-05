package uet.oop.bomberman.entities;

import javafx.scene.image.Image;

public class Brick extends Entity{
    public Brick(int x, int y, Image img) {
        super(x, y, img);
    }
    
    public Brick(int x, int y) {
        super( x, y);
    }

    @Override
    public void update() {

    }

    @Override
    public boolean collide(Entity e) {
        return false;
    }
    
    
}
