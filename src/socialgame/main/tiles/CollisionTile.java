package socialgame.main.tiles;

import java.awt.Graphics;
import java.awt.Rectangle;
import socialgame.main.Game;
import socialgame.main.entities.Player;
import socialgame.main.gfx.ImageManager;

public class CollisionTile extends Tile {
	
	public static int x,y,width,height;
	public boolean collision = false;

	public CollisionTile(ImageManager im) {
		super(im);
		width = Game.TILESIZE*Game.SCALE;
		height = Game.TILESIZE*Game.SCALE;
		x = 0;
		y = 0;
	}

	public void tick() {
		
	}
	
	public Rectangle getBounds(int x, int y, int width, int height) {
		return new Rectangle(x,y,width,height);
	}
	
	public void collisionPlayer() {
		if(Player.up) {
			Player.y+=2;
		}
		if(Player.dn) {
			Player.y-=2;
		}
		if(Player.lt) {
			Player.x+=2;
		}
		if(Player.rt) {
			Player.x-=2;
		}
	}
	
	public void checkCollisions(int cx, int cy, int cwidth, int cheight) {
		if(Player.getBounds().intersects(getBounds(cx,cy,cwidth,cheight))) {
			Player.collision = true;
			collisionPlayer();
		}else{
			Player.collision = false;
		}
	}

	public void render(Graphics g, int x, int y) {
		g.drawImage(im.collisionTile, x, y, Game.TILESIZE * Game.SCALE,Game.TILESIZE * Game.SCALE,null);
	}
}
