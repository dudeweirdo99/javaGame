package socialgame.main.tiles;

import java.awt.Graphics;

import socialgame.main.Game;
import socialgame.main.gfx.ImageManager;

public class StoneTile extends Tile {

	public StoneTile(ImageManager im) {
		super(im);
	}

	public void tick() {
		
	}
	
	public void render(Graphics g, int x, int y) {
		g.drawImage(im.stoneTile,x,y,Game.TILESIZE*Game.SCALE,Game.TILESIZE*Game.SCALE,null);
	}
}
