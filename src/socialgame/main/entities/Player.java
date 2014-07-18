package socialgame.main.entities;

import java.awt.Graphics;
import java.awt.Rectangle;

import socialgame.main.Game;
import socialgame.main.gfx.ImageManager;

public class Player{

	public static int x,y,width,height;
	private ImageManager im;
	
	public static boolean up = false, dn = false, lt = false, rt = false, moving = false, collision = false;
	private final int SPEED = 2;
	
	public Player(int x, int y, ImageManager im) {
		Player.x = x;
		Player.y = y;
		this.im = im;
		width = 12*Game.SCALE;
		height = 16*Game.SCALE;
	}
	
	public static int getX() {return x;}
	
	public static int getY() {return y;}
	
	public static int getWidth() {return width;}
	
	public static int getHeight() {return height;}
	
	public static Rectangle getBounds() {
		return new Rectangle(getX(),getY(),getWidth(),getHeight());
	}
	
	
	public void tick() {
		
		if(!collision) {
		
			if(up) {
				y -= SPEED;
				moving = true;
			}
			if(dn) {
				y+= SPEED;
				moving = true;
			}
			if(lt) {
				x -= SPEED;
				moving = true;
			}
			if(rt) {
				x += SPEED;
				moving = true;
			}
		}
	}
	
	public void render(Graphics g) {
		g.drawImage(im.player,x,y,12*Game.SCALE,16*Game.SCALE,null);
	}
}
