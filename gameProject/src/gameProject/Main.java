package gameProject;

import gameProject.adapters.MernisService;
import gameProject.concretes.CampaignManager;
import gameProject.concretes.GameManager;
import gameProject.concretes.GamerManager;
import gameProject.concretes.SaleManager;
import gameProject.entities.Campaign;
import gameProject.entities.Game;
import gameProject.entities.Gamer;
import gameProject.entities.Sale;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer(1,  "Osman", "Bal", "osmanbal", "osman@osman.com", "123456789", "11111111", 2000);
		
        GamerManager gamerManager = new GamerManager(new MernisService());
        gamerManager.add(gamer);

        Game game = new Game(1,"Call of Duty", 20);
        GameManager gameManager = new GameManager();
        gameManager.add(game);

        Campaign campaign = new Campaign(1,"Sepette %10 indirim", 10);
        CampaignManager campaignManager = new CampaignManager();
        campaignManager.add(campaign);

        Sale sale = new Sale(1, "133516168");


        SaleManager saleManager = new SaleManager(new MernisService());
        saleManager.sale(game,gamer,campaign, sale);

	}

}
