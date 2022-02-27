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
			System.out.println(player.getPlayerFirstName() + " " + player.getPlayerLastName() + " " + "baþarýyla kayýt oldu.");
		}else {
			System.out.println("Kiþi Mernis Sisteminde yok.");
		}
		
	}

	@Override
	public void deletePlayer(Player player) throws NumberFormatException, RemoteException {
		System.out.println(player.getPlayerFirstName() + " " + player.getPlayerLastName() + " " + "kaydýný sildi.");

		
	}

	@Override
	public void updatePlayer(Player player) throws NumberFormatException, RemoteException {
		System.out.println(player.getPlayerFirstName() + " " + player.getPlayerLastName() + " " + "bilgilerini güncelledi.");

		
	}
	
	
	

}
