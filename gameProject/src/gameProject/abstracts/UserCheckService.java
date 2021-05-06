package gameProject.abstracts;

import gameProject.entities.Gamer;

public interface UserCheckService {
	Boolean checkIfRealPerson(Gamer gamer);
}
