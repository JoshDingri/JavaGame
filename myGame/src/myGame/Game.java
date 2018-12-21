package myGame;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Game extends StateBasedGame {
	public static final String gamename = "Fix IT!";
	public static final int menu = 0;
	public static final int play = 1;
	//public static final int play = 1;
	
	public Game(String title) {
		super(title);
		this.addState(new Menu(menu));
		this.addState(new Play(play));

	}
	
	
	public static void main(String[] args) throws SlickException  {
		// TODO Auto-generated method stub
		AppGameContainer appContainer;
			appContainer = new AppGameContainer(new Game("Fix IT"));
			appContainer.setDisplayMode(800,600,false);
			appContainer.start();
	}



	@Override
	public void initStatesList(GameContainer gc) throws SlickException {
		this.getState(menu).init(gc, this);
		this.getState(play).init(gc, this);
		this.enterState(play);
		
	}

}
