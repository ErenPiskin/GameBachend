package Concrete;

import java.rmi.RemoteException;


import Abstract.IPlayerCheckService;
import Abstract.IPlayerRegistrationService;
import Entities.Player;

public class PlayerRegistrationManager implements IPlayerRegistrationService{
	IPlayerCheckService personCheckService;
	
	public PlayerRegistrationManager(IPlayerCheckService personCheckService) {
		this.personCheckService = personCheckService;
	}
	
	

	@Override
	public void addPlayer(Player player) throws NumberFormatException, RemoteException {
		if (personCheckService.checkIfRealPerson(player)) {
			System.out.println(player.getPlayerFirstName() + " " + player.getPlayerLastName() + " " + "ba�ar�yla kay�t oldu.");
		}else {
			System.out.println("Ki�i Mernis Sisteminde yok.");
		}
		
	}

	@Override
	public void deletePlayer(Player player) throws NumberFormatException, RemoteException {
		System.out.println(player.getPlayerFirstName() + " " + player.getPlayerLastName() + " " + "kayd�n� sildi.");

		
	}

	@Override
	public void updatePlayer(Player player) throws NumberFormatException, RemoteException {
		System.out.println(player.getPlayerFirstName() + " " + player.getPlayerLastName() + " " + "bilgilerini g�ncelledi.");

		
	}
	
	
	

}
