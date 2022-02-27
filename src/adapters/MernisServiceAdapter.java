package adapters;

import java.rmi.RemoteException;


import Abstract.IPlayerCheckService;

import Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IPlayerCheckService{
	

	KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
	


	@Override
	public boolean checkIfRealPerson(Player player)throws NumberFormatException, RemoteException {

		boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()), player.getPlayerFirstName(),
				player.getPlayerLastName(), player.getBirthOfDate());
		if (result == true) {
			System.out.println("Giri� Ba�ar�l�");
			return true;
		} else {
			System.out.println("Giri� Ba�ar�s�z");
			return false;
		}
	}

}
