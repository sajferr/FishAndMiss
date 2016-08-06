package screens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.mygdx.game.Game;

import images.Image;
import images.ImageFish;

/**
 * Created by m on 2016-08-05.
 */
public class MainScreen extends  AbstractScreen {
    Texture textureWallpaper;
    Texture textureFish;
    Image imageWallpaper;
    ImageFish imageFish;
    MainScreen(Game game) {
        super(game);
        initMain();

    }

    private void initMain() {
        imageWallpaper = new Image(new Texture("photos/wallpaper.png"));
        imageFish = new ImageFish(new Texture("photos/fish.png"));
        stage.addActor(imageWallpaper);
        stage.addActor(imageFish);

    }

    @Override
    public void render(float delta) {
        super.render(delta);


    }

    @Override
    public void drawer() {
        super.drawer();
        stage.draw();






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
}
