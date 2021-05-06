package gameProject.abstracts;

import gameProject.entities.Campaign;
import gameProject.entities.Game;
import gameProject.entities.Gamer;
import gameProject.entities.Sale;

public interface SaleService {
	public void sale(Game game, Gamer gamer, Campaign campaign, Sale sale);
}
