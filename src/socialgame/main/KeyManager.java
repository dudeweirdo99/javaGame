package socialgame.main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import socialgame.main.entities.Player;

public class KeyManager implements KeyListener {

	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_W) {
			Game.getPlayer();
			Player.up = true;
		}
		if(e.getKeyCode() == KeyEvent.VK_S) {
			Game.getPlayer();
			Player.dn = true;
		}
		if(e.getKeyCode() == KeyEvent.VK_A) {
			Game.getPlayer();
			Player.lt = true;
		}
		if(e.getKeyCode() == KeyEvent.VK_D) {
			Game.getPlayer();
			Player.rt = true;
		}
	}

	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_W) {
			Game.getPlayer();
			Player.up = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_S) {
			Game.getPlayer();
			Player.dn = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_A) {
			Game.getPlayer();
			Player.lt = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_D) {
			Game.getPlayer();
			Player.rt = false;
		}
	}

	public void keyTyped(KeyEvent e) {}
	
}
