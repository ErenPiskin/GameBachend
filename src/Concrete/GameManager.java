package Concrete;

import java.rmi.RemoteException;

import Abstract.IGameService;
import Entities.Game;

public class GameManager implements IGameService{

	@Override
	public void addGame(Game game) throws RemoteException {
		System.out.println(game.getGameName() + " oyunu eklendi");
	}

	@Override
	public void deleteGame(Game game) {
		System.out.println(game.getGameName() + " oyunu silindi");
		
	}

	@Override
	public void updateGame(Game game) {
		System.out.println(game.getGameName() + " oyunu güncelledi");
		
	}

}
