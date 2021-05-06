package gameProject.concretes;

import gameProject.abstracts.GameService;
import gameProject.entities.Game;

public class GameManager implements GameService{
	 @Override
	    public void add(Game game) {
	        System.out.println(game.getGameName() + " eklendi.");
	    }

	    @Override
	    public void delete(Game game) {
	        System.out.println(game.getGameName() + " silindi.");
	    }

	    @Override
	    public void update(Game game) {
	        System.out.println(game.getGameName() + " güncellendi.");
	    }
	}

