package screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.Game;

import images.Image;
import images.ImageFish;

/**
 * Created by m on 2016-08-05.
 */
public abstract class AbstractScreen implements Screen {
    OrthographicCamera camera;
    SpriteBatch batch;
    Game game;
    Stage stage;
    Image imageWallpaper;
    float xx= Game.WIDTH / 2 - (ImageFish.WIDTH / 2);
    ImageFish imageFish;



    AbstractScreen(Game game){
        this.game = game;
        createcamera();

        init();
        stage = new Stage(new StretchViewport(Game.WIDTH,Game.HEIGHT,camera)){
            @Override
            public boolean keyDown(int keyCode) {

                if (keyCode == Input.Keys.A){

                    xx-=50;
                    System.out.println(xx);
                    imageFish.setX(xx);

                }
                else if (keyCode==Input.Keys.D){
                    xx+=50;
                    imageFish.setX(xx);
                    System.out.println(xx);
                }

                else if (keyCode==Input.Keys.S){
                    System.out.println("siema stary3");

                }

                return super.keyDown(keyCode);
            }


        };



    }

    private void createcamera() {
        camera=new OrthographicCamera(Game.WIDTH,Game.HEIGHT);
        camera.update();

    }

    public void init() {
        batch = new SpriteBatch();

    }




    @Override
    public void render(float delta) {
        update();
        batch.begin();
        drawer();
        batch.setProjectionMatrix(camera.combined);
        batch.end();


    }

    public void drawer() {


    }

    public void update() {
        Gdx.gl.glClearColor(034/255f,113/255f,179/255f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        camera.update();

    }
































    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }
    @Override
    public void dispose() {
        batch.dispose();


    }
}
