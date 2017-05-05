package service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import dao.ITransportLocal;
import metier.Cargaison;
import metier.Marchandise;

@Stateless
public class TransportService implements IServiceTransportLocal, IServiceTransportRemote {

	@EJB
	private ITransportLocal dao;
	
	
	
	@Override
	public void addCargaison(Cargaison c) {
		dao.addCargaison(c);

	}

	@Override
	public void AddMarchandise(Marchandise m, long refCarg) {
		dao.AddMarchandise(m, refCarg);

	}

	@Override
	public List<Cargaison> getAllCargaisons() {
		
		return dao.getAllCargaisons();
	}

	@Override
	public List<Marchandise> getMarchandisesParMC(String mc) {
		
		return dao.getMarchandisesParMC(mc);
	}

	@Override
	public void deleteMarchandises(long refMarchandises) {
		dao.deleteMarchandises(refMarchandises);

	}

}
