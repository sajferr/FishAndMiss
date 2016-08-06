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
    public static final int WIDTH = 100;
    private static final int HEIGHT = 100;
    Action akcja1;
    Action akcja2;
    private static float IMAGE_X = Game.WIDTH / 2 - (WIDTH / 2);
    private static  float IMAGE_Y = Game.HEIGHT / 2 - (HEIGHT / 2) + 20;
    int xx =0;
      public  boolean coKlikac=false;
    public ImageFish(Texture texture) {
        super(texture);
        this.setHeight(HEIGHT);
        this.setWidth(WIDTH);
        this.setX(IMAGE_X);
        this.setY(IMAGE_Y);

    }



    public void initActionsXRight() {
        if (coKlikac ==true) {


            IMAGE_X += 5;
            System.out.println(IMAGE_Y);
            Action akcja1 = Actions.moveTo(IMAGE_X,IMAGE_Y, 0.1f);
   //         this.removeAction(akcja2);
            this.addAction(akcja1);


        }


        if (coKlikac == false) {
            IMAGE_X -= 5;
            System.out.println(IMAGE_Y);
            Action akcja2 = Actions.moveTo(IMAGE_X,IMAGE_Y, 0.1f);
         //   this.removeAction(akcja1);
            this.addAction(akcja2);



        }


    }}



