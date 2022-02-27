package Abstract;

import java.rmi.RemoteException;

import Entities.Game;

public interface IGameService {
	void addGame(Game game) throws RemoteException;
	void deleteGame(Game game);
	void updateGame(Game game);


}
