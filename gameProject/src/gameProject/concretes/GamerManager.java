package gameProject.concretes;

import gameProject.abstracts.GamerService;
import gameProject.abstracts.UserCheckService;
import gameProject.entities.Gamer;

public class GamerManager implements GamerService{
	private UserCheckService userCheckService;
	
	public GamerManager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}

	@Override
    public void add(Gamer gamer) {
		if(userCheckService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " eklendi.");
		}
		else {
			System.out.println("Not a valid person");
		}
        
    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " silindi.");
    }

    @Override
    public void update(Gamer gamer) {
    	if(userCheckService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " güncellendi.");
		}
		else {
			System.out.println("Not a valid person");
		}
        
    }
}
