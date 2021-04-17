package ro.ase.cts.facade.clase;

public class Facade {
	
	public static boolean potInvitaOameniiLaMasa(Masa masa) {
		if(OperatorMese.esteLibera(masa)) {
			Picolo andrei=new Picolo("Andrei");
			if(andrei.esteDebarasata(masa) && andrei.esteAranjata(masa)) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}

}
