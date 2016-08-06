package images;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Interpolation;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.EventListener;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.mygdx.game.Game;

/**
 * Created by m on 2016-08-06.
 */
public class ImageFish extends com.badlogic.gdx.scenes.scene2d.ui.Image {
    private static final int WIDTH = 100;
    private static final int HEIGHT = 100;
    private static final float IMAGE_X = Game.WIDTH / 2 - (WIDTH / 2);
    private static final float IMAGE_Y = Game.HEIGHT / 2 - (HEIGHT / 2) + 20;

    public ImageFish(Texture texture) {
        super(texture);
        this.setHeight(HEIGHT);
        this.setWidth(WIDTH);
        this.setX(IMAGE_X);
        this.setY(IMAGE_Y);

    }



    public void initActions() {



//        int moveX=MathUtils.random(-130,130);
//        int moveY=MathUtils.random(-20,20);
//
//        System.out.println("lol");
//       Action action = Actions.sequence(Actions.moveBy(moveX,moveY,0.2f,Interpolation.circle),
//               Actions.moveBy(-moveX,-moveY,0.2f,Interpolation.circle)
//               );
//        Action action2 = Actions.sequence(
//                Actions.sizeTo()




    }

}



