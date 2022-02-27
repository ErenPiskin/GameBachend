package Abstract;

import java.rmi.RemoteException;
import Entities.Player;

public interface IPlayerRegistrationService {
	
	void addPlayer(Player player) throws NumberFormatException, RemoteException;
	
	void deletePlayer(Player player)throws NumberFormatException, RemoteException;
	
	void updatePlayer(Player player)throws NumberFormatException, RemoteException;

}
