package Concrete;

import Abstract.IGameSaleService;
import Entities.Campaign;

import Entities.Game;
import Entities.Player;

public class GameSaleManager implements IGameSaleService{
	 
	

	@Override
	public void gameSell(Game game, Player player, Campaign campaign) {
		
		System.out.println(game.getGameName() + " oyunu " + player.getPlayerId() + " ýd'sine sahip " + player.getPlayerFirstName() + " isimli kiþi " + campaign.getCampaignName()+ " ile "+ 
				 "%" +campaign.getDiscount() + " indirimle "  + ( game.getPriceOfGame() - (game.getPriceOfGame() * campaign.getDiscount()/100))+  "tl " + " fiyatýna satýn aldý."
				);
		
	}

}
