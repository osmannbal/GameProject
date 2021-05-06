package gameProject.concretes;

import gameProject.abstracts.SaleService;
import gameProject.abstracts.UserCheckService;
import gameProject.entities.Campaign;
import gameProject.entities.Game;
import gameProject.entities.Gamer;
import gameProject.entities.Sale;

public class SaleManager implements SaleService{
		private UserCheckService usercheckService;
		
	 public SaleManager(UserCheckService usercheckService) {
			this.usercheckService = usercheckService;
		}

	@Override
	   public void sale(Game game, Gamer gamer, Campaign campaign, Sale sale) {
		 if(usercheckService.checkIfRealPerson(gamer)) {
			 System.out.println(game.getGameName() + " oyunu " + sale.getSalePrice(campaign, game) + " fiyatýyla " + gamer.getFirstName() + " " + gamer.getLastName() + " oyuncusuna satýþý gerçekleþti");
			}
			else {
				System.out.println("Sale failed! Not a valid person.");
			}   
		 
	    }
}
