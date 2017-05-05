package dao;

import java.util.List;

import javax.ejb.Remote;

import metier.Cargaison;
import metier.Marchandise;

@Remote
public interface ITransportRemote {

	public void addCargaison(Cargaison c);
	
	public void AddMarchandise(Marchandise m, long refCarg);
	
	public List<Cargaison> getAllCargaisons();
	
	public List<Marchandise> getMarchandisesParMC(String mc);
	
	public void deleteMarchandises(long refMarchandises);
	
	
	
}
