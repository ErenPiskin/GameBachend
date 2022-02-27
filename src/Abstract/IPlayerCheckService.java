package Abstract;

import java.rmi.RemoteException;

import Entities.Player;

public interface IPlayerCheckService {
	
	boolean checkIfRealPerson(Player player) throws NumberFormatException, RemoteException;
	
	
}
