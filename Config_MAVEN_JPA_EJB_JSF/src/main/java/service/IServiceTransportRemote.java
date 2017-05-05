package service;

import java.util.List;

import javax.ejb.Remote;

import metier.Cargaison;
import metier.Marchandise;

@Remote
public interface IServiceTransportRemote {

	public void addCargaison(Cargaison c);
	
	public void AddMarchandise(Marchandise m, long refCarg);
	
	public List<Cargaison> getAllCargaisons();
	
	public List<Marchandise> getMarchandisesParMC(String mc);
	
	public void deleteMarchandises(long refMarchandises);
	
	
	
}
