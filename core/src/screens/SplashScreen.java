package screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.Timer;

import java.sql.Time;

/**
 * Created by m on 2016-08-05.
 */
public class SplashScreen extends AbstractScreen {
    MainScreen mainScreen = new MainScreen(game);
    Texture texture;




    public SplashScreen(final com.mygdx.game.Game game) {
        super(game);
        init();
        Timer.schedule(new Timer.Task() {
            @Override
            public void run() {
                game.setScreen(mainScreen);

            }
        },2,0);


    }

    @Override
    public void init() {
        super.init();
        texture = new Texture("photos/brzenskylogo.png");
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        update();
        batch.begin();
        batch.draw(texture, com.mygdx.game.Game.WIDTH/2-texture.getWidth()/2, com.mygdx.game.Game.HEIGHT/2-texture.getHeight()/2);
        batch.end();

    }

    @Override
    public void show() {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        super.dispose();
    }
}
