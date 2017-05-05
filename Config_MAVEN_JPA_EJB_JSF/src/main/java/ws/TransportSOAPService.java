package ws;

import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import metier.Cargaison;
import metier.Marchandise;
import service.IServiceTransportLocal;

@WebService(serviceName="TwsSoap")
public class TransportSOAPService {

	
	@EJB
	private IServiceTransportLocal serv;
	
	
	
	@WebMethod
	public void addCargaison(@WebParam Cargaison c) {
		serv.addCargaison(c);

	}

	@WebMethod
	public void AddMarchandise(@WebParam Marchandise m, @WebParam long refCarg) {
		serv.AddMarchandise(m, refCarg);

	}

	@WebMethod
	public List<Cargaison> getAllCargaisons() {
		
		return serv.getAllCargaisons();
	}

	@WebMethod
	public List<Marchandise> getMarchandisesParMC(@WebParam String mc) {
		
		return serv.getMarchandisesParMC(mc);
	}

	@WebMethod
	public void deleteMarchandises(@WebParam long refMarchandises) {
		serv.deleteMarchandises(refMarchandises);

	}
	
}
