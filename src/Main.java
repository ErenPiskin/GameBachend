import java.rmi.RemoteException;

import java.time.LocalDate;


import Concrete.CampaignManager;

import Concrete.GameManager;
import Concrete.GameSaleManager;

import Concrete.PlayerRegistrationManager;
import Entities.Campaign;

import Entities.Game;
import Entities.Player;
import adapters.MernisServiceAdapter;


public class Main {
	
	public static void main (String[] args) throws RemoteException {
		
		Player player = new Player(1,"eren","piþkin",LocalDate.of(2001,7,26),"12345678911");
		Player player2 = new Player(2,"Serpil","Demir",LocalDate.of(2001,7,9),"12345678911");
	
		  PlayerRegistrationManager playerCheck = new PlayerRegistrationManager(new MernisServiceAdapter());
	      playerCheck.addPlayer(player);
	      
	      System.out.println(" ");
	
        Game game1 = new Game(1, "God Of War", 330);
        Game game2 = new Game(2,"Anime Wallpapers" , 100);
        
        Campaign campaign1 = new Campaign("1","Black Friday",70);
        Campaign campaign2 = new Campaign ("2", "Yýlbaþý indirimi",72);
        
        
        
        GameManager gameManager1 = new GameManager();
        GameManager gameManager2 = new GameManager();
       
        gameManager1.addGame(game1);
        gameManager2.addGame(game2);
        gameManager2.deleteGame(game2);
        gameManager2.updateGame(game2);
        
        System.out.println(" ");
        
        CampaignManager compaignManager1 = new CampaignManager();
        CampaignManager compaignManager2 = new CampaignManager();
        
        compaignManager1.addCampaign(campaign1);
        compaignManager2.addCampaign(campaign2);
        compaignManager2.deleteCampaign(campaign2);
        compaignManager2.updateCampaign(campaign2);
        
        System.out.println(" ");


        GameSaleManager gameSaleManager = new GameSaleManager();
        GameSaleManager gameSaleManager2 = new GameSaleManager();
        gameSaleManager.gameSell(game1,player,campaign1);
        gameSaleManager2.gameSell(game2, player2, campaign2);
        
      
		
	}
	

}
