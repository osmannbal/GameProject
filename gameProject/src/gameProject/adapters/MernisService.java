package gameProject.adapters;

import java.rmi.RemoteException;

import gameProject.abstracts.UserCheckService;
import gameProject.entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisService implements UserCheckService{

	@Override
	public Boolean checkIfRealPerson(Gamer gamer) {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		try {
			return proxy.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalIdentity()), gamer.getFirstName(), gamer.getLastName(), gamer.getBirthday());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
		
	}

}
