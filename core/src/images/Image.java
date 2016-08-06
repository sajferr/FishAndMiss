package images;

import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.Game;


public class Image extends com.badlogic.gdx.scenes.scene2d.ui.Image {
    public static final int WIDTH= Game.WIDTH;
    public static final int HEIGHT = Game.HEIGHT;

    public Image(Texture texture) {
        super(texture);
        this.setWidth(WIDTH);
        this.setHeight(HEIGHT);
    }



}
