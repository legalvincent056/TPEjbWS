package ws;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import metier.Cargaison;
import metier.Marchandise;
import service.IServiceTransportLocal;

@Path("/TwsSoap")
public class TransportRESTService {

	
	@EJB
	private IServiceTransportLocal serv;
	
	
	
	@POST
	@Path("addCargaison/{distance}/{poidsMax}/{temperatureConservation}")
	public void addCargaison(int distance,double poidsMax,double temperatureConservation) {
		Cargaison c = new Cargaison();
		c.setDistance(distance);
	
		serv.addCargaison(c);

	}

	
	public void AddMarchandise (Marchandise m,  long refCarg) {
		serv.AddMarchandise(m, refCarg);

	}

	
	public List<Cargaison> getAllCargaisons() {
		
		return serv.getAllCargaisons();
	}

	
	public List<Marchandise> getMarchandisesParMC( String mc) {
		
		return serv.getMarchandisesParMC(mc);
	}

	
	public void deleteMarchandises( long refMarchandises) {
		serv.deleteMarchandises(refMarchandises);

	}
	
}
