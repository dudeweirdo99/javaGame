package socialgame.main.gfx;

import java.awt.image.BufferedImage;

public class ImageManager {

	public BufferedImage player, grassTile, stoneTile, dirtTile, collisionTile;
	
	public ImageManager(SpriteSheet ss) {
		player = ss.crop(0, 0, 12, 15);
		grassTile = ss.crop(1, 0, 16, 16);
		stoneTile = ss.crop(2, 0, 16, 16);
		dirtTile = ss.crop(3,0,16,16);
		collisionTile = ss.crop(0, 7, 16, 16);
	}
}
