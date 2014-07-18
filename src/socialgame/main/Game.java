package socialgame.main;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

import socialgame.main.entities.Player;
import socialgame.main.gfx.ImageLoader;
import socialgame.main.gfx.ImageManager;
import socialgame.main.gfx.SpriteSheet;
import socialgame.main.levels.LevelOne;
import socialgame.main.tiles.CollisionTile;
import socialgame.main.tiles.DirtTile;
import socialgame.main.tiles.GrassTile;
import socialgame.main.tiles.StoneTile;
import socialgame.main.tiles.TeleportTile;

public class Game extends Canvas implements Runnable {

	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 1280, HEIGHT = 800, SCALE = 4, TILESIZE = 16;
	public static boolean running = false;
	public Thread gameThread;
	
	private BufferedImage spriteSheet;
	private ImageManager im;
	
	public static Player player;
	public static GrassTile grasst;
	public static StoneTile stonet;
	public static DirtTile dirttile;
	public static CollisionTile collisiont;
	public static TeleportTile teletile;
	public static LevelOne levelOne;
	
	public void init() {
		ImageLoader loader = new ImageLoader();
		spriteSheet = loader.load("/spritesheet.png");
		SpriteSheet ss = new SpriteSheet(spriteSheet);
		
		im = new ImageManager(ss);
		player = new Player(0,0,im);
		grasst = new GrassTile(im);
		stonet = new StoneTile(im);
		dirttile = new DirtTile(im);
		collisiont = new CollisionTile(im);
		teletile = new TeleportTile(im);
		levelOne = new LevelOne(im);
		
		this.addKeyListener(new KeyManager());
	}
	
	public synchronized void start() {
		if(running)return;
		running = true;
		gameThread = new Thread(this);
		gameThread.start();
	}
	
	public synchronized void stop() {
		if(!running)return;
		running = false;
		
		try {
			gameThread.join();
		} catch (InterruptedException e) {e.printStackTrace();}
	}
	
	public void run() {
		init();
		long lastTime = System.nanoTime();
		final double amountOfTicks = 60D;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		
		while(running) {
			long now = System.nanoTime();
			delta += (now = lastTime) / ns;
			lastTime = now;
			if(delta >= 1) {
				tick();
				delta--;
			}
			render();
		}
		stop();
	}
	
	public void tick() {
		player.tick();
		collisiont.checkCollisions(TILESIZE*SCALE,-64,TILESIZE*SCALE,TILESIZE*SCALE);
		collisiont.checkCollisions((TILESIZE*2)*SCALE,-64,TILESIZE*SCALE,TILESIZE*SCALE);
		collisiont.checkCollisions((TILESIZE*3)*SCALE,-64,TILESIZE*SCALE,TILESIZE*SCALE);
	}
	
	public void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null) {
			createBufferStrategy(3);
			return;
		}
		
		Graphics g = bs.getDrawGraphics();
		//RENDER HERE
		
		g.fillRect(0, 0, WIDTH * SCALE, HEIGHT * SCALE);
		
		levelOne.render(g,0,0);
		player.render(g);
		
		//END RENDER
		g.dispose();
		bs.show();
	}
	
	public static void main(String args[]) {
		Game game = new Game();
		game.setPreferredSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
		game.setMaximumSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
		game.setMinimumSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
		
		JFrame frame = new JFrame("Social RPG");
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.add(game);
		frame.setVisible(true);
		
		game.start();
	}
	
	public static Player getPlayer() {
		return player;
	}
}
