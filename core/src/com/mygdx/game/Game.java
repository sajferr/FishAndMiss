package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import screens.SplashScreen;

public class Game extends com.badlogic.gdx.Game {
	SplashScreen splashScreen;
	public static final int HEIGHT=600;
	public static final int WIDTH=480;
	
	@Override	public void create () {
		splashScreen = new SplashScreen(this);
		setScreen(splashScreen);
	}



}
