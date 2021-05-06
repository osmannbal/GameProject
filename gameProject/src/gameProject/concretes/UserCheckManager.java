package gameProject.concretes;

import gameProject.abstracts.UserCheckService;
import gameProject.entities.Gamer;

public class UserCheckManager implements UserCheckService{

	@Override
	public Boolean checkIfRealPerson(Gamer gamer) {
		return true;
	}

}
