package socialgame.main.levels;

import java.awt.Graphics;

import socialgame.main.Game;
import socialgame.main.gfx.ImageManager;
import socialgame.main.tiles.Tile;

public class LevelOne extends Tile{

	public LevelOne(ImageManager im) {
		super(im);
	}

	public void tick() {
		
	}

	public void render(Graphics g, int x, int y) {
		
	//grass
		//row 1
		g.drawImage(im.grassTile,x,y,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+Game.TILESIZE*Game.SCALE,y,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*2)*Game.SCALE,y,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*3)*Game.SCALE,y,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*4)*Game.SCALE,y,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*5)*Game.SCALE,y,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*6)*Game.SCALE,y,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*7)*Game.SCALE,y,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*8)*Game.SCALE,y,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*9)*Game.SCALE,y,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*10)*Game.SCALE,y,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*11)*Game.SCALE,y,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*12)*Game.SCALE,y,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*13)*Game.SCALE,y,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*14)*Game.SCALE,y,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*15)*Game.SCALE,y,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*16)*Game.SCALE,y,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*17)*Game.SCALE,y,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*18)*Game.SCALE,y,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*19)*Game.SCALE,y,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		
		//row 2
		g.drawImage(im.grassTile,x,Game.TILESIZE*Game.SCALE,Game.TILESIZE*Game.SCALE,y+Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+Game.TILESIZE*Game.SCALE,Game.TILESIZE*Game.SCALE,y+Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*2)*Game.SCALE,Game.TILESIZE*Game.SCALE,y+Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*3)*Game.SCALE,Game.TILESIZE*Game.SCALE,y+Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*4)*Game.SCALE,Game.TILESIZE*Game.SCALE,y+Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*5)*Game.SCALE,Game.TILESIZE*Game.SCALE,y+Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*6)*Game.SCALE,Game.TILESIZE*Game.SCALE,y+Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*7)*Game.SCALE,Game.TILESIZE*Game.SCALE,y+Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*8)*Game.SCALE,Game.TILESIZE*Game.SCALE,y+Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*9)*Game.SCALE,Game.TILESIZE*Game.SCALE,y+Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*10)*Game.SCALE,Game.TILESIZE*Game.SCALE,y+Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*11)*Game.SCALE,Game.TILESIZE*Game.SCALE,y+Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*12)*Game.SCALE,Game.TILESIZE*Game.SCALE,y+Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*13)*Game.SCALE,Game.TILESIZE*Game.SCALE,y+Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*14)*Game.SCALE,Game.TILESIZE*Game.SCALE,y+Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*15)*Game.SCALE,Game.TILESIZE*Game.SCALE,y+Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*16)*Game.SCALE,Game.TILESIZE*Game.SCALE,y+Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*17)*Game.SCALE,Game.TILESIZE*Game.SCALE,y+Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*18)*Game.SCALE,Game.TILESIZE*Game.SCALE,y+Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*19)*Game.SCALE,Game.TILESIZE*Game.SCALE,y+Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		
		//row 3
		g.drawImage(im.grassTile,x,y+(Game.TILESIZE*2)*Game.SCALE,Game.TILESIZE*Game.SCALE,Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+Game.TILESIZE*Game.SCALE,y+(Game.TILESIZE*2)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*2)*Game.SCALE,y+(Game.TILESIZE*2)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*3)*Game.SCALE,y+(Game.TILESIZE*2)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*4)*Game.SCALE,y+(Game.TILESIZE*2)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*5)*Game.SCALE,y+(Game.TILESIZE*2)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*6)*Game.SCALE,y+(Game.TILESIZE*2)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*7)*Game.SCALE,y+(Game.TILESIZE*2)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*8)*Game.SCALE,y+(Game.TILESIZE*2)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*9)*Game.SCALE,y+(Game.TILESIZE*2)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*10)*Game.SCALE,y+(Game.TILESIZE*2)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*11)*Game.SCALE,y+(Game.TILESIZE*2)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*12)*Game.SCALE,y+(Game.TILESIZE*2)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*13)*Game.SCALE,y+(Game.TILESIZE*2)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*14)*Game.SCALE,y+(Game.TILESIZE*2)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*15)*Game.SCALE,y+(Game.TILESIZE*2)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*16)*Game.SCALE,y+(Game.TILESIZE*2)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*17)*Game.SCALE,y+(Game.TILESIZE*2)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*18)*Game.SCALE,y+(Game.TILESIZE*2)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*19)*Game.SCALE,y+(Game.TILESIZE*2)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		
		//row 4
		g.drawImage(im.grassTile,x,y+(Game.TILESIZE*3)*Game.SCALE,Game.TILESIZE*Game.SCALE,Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+Game.TILESIZE*Game.SCALE,y+(Game.TILESIZE*3)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*2)*Game.SCALE,y+(Game.TILESIZE*3)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*3)*Game.SCALE,y+(Game.TILESIZE*3)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*4)*Game.SCALE,y+(Game.TILESIZE*3)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*5)*Game.SCALE,y+(Game.TILESIZE*3)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*6)*Game.SCALE,y+(Game.TILESIZE*3)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*7)*Game.SCALE,y+(Game.TILESIZE*3)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*8)*Game.SCALE,y+(Game.TILESIZE*3)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*9)*Game.SCALE,y+(Game.TILESIZE*3)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*10)*Game.SCALE,y+(Game.TILESIZE*3)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*11)*Game.SCALE,y+(Game.TILESIZE*3)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*12)*Game.SCALE,y+(Game.TILESIZE*3)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*13)*Game.SCALE,y+(Game.TILESIZE*3)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*14)*Game.SCALE,y+(Game.TILESIZE*3)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*15)*Game.SCALE,y+(Game.TILESIZE*3)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*16)*Game.SCALE,y+(Game.TILESIZE*3)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*17)*Game.SCALE,y+(Game.TILESIZE*3)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*18)*Game.SCALE,y+(Game.TILESIZE*3)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*19)*Game.SCALE,y+(Game.TILESIZE*3)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		
		//row 5
		g.drawImage(im.grassTile,x,y+(Game.TILESIZE*4)*Game.SCALE,Game.TILESIZE*Game.SCALE,Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+Game.TILESIZE*Game.SCALE,y+(Game.TILESIZE*4)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*2)*Game.SCALE,y+(Game.TILESIZE*4)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*3)*Game.SCALE,y+(Game.TILESIZE*4)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*4)*Game.SCALE,y+(Game.TILESIZE*4)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*5)*Game.SCALE,y+(Game.TILESIZE*4)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*6)*Game.SCALE,y+(Game.TILESIZE*4)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*7)*Game.SCALE,y+(Game.TILESIZE*4)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*8)*Game.SCALE,y+(Game.TILESIZE*4)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*9)*Game.SCALE,y+(Game.TILESIZE*4)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*10)*Game.SCALE,y+(Game.TILESIZE*4)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*11)*Game.SCALE,y+(Game.TILESIZE*4)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*12)*Game.SCALE,y+(Game.TILESIZE*4)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*13)*Game.SCALE,y+(Game.TILESIZE*4)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*14)*Game.SCALE,y+(Game.TILESIZE*4)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*15)*Game.SCALE,y+(Game.TILESIZE*4)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*16)*Game.SCALE,y+(Game.TILESIZE*4)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*17)*Game.SCALE,y+(Game.TILESIZE*4)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*18)*Game.SCALE,y+(Game.TILESIZE*4)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		g.drawImage(im.grassTile,x+(Game.TILESIZE*19)*Game.SCALE,y+(Game.TILESIZE*4)*Game.SCALE,Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
	}
}
