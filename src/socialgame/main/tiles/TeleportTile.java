package socialgame.main.tiles;

import java.awt.Graphics;
import java.awt.Rectangle;
import socialgame.main.Game;
import socialgame.main.entities.Player;
import socialgame.main.gfx.ImageManager;

public class TeleportTile extends Tile {
	
	public static int x,y,width,height;
	
	public TeleportTile(ImageManager im) {
		super(im);
		x = 0;
		y = 0;
		width = Game.TILESIZE*Game.SCALE;
		height = Game.TILESIZE*Game.SCALE;
	}

	public void tick() {
		
	}
	
	public Rectangle getBounds(int x, int y, int width, int height) {
		return new Rectangle(x,y,width,height);
	}
	
	public void checkCollisions(int tx, int ty, int twidth, int theight, int desx, int desy) {
		if(Player.getBounds().intersects(getBounds(tx,ty,twidth,theight))) {
			Player.x=desx;
			Player.y=desy;
			Player.up = false;
			Player.dn = false;
			Player.lt = false;
			Player.rt = false;
			Player.moving = false;
		}
	}

	public void render(Graphics g, int x, int y) {
		
	}
}
