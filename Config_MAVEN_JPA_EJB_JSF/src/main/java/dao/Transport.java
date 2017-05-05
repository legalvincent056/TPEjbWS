package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import metier.Cargaison;
import metier.Marchandise;

@Stateless
public class Transport implements ITransportRemote, ITransportLocal {

	
	@PersistenceContext(name="TPEJBWS-pu")
	private EntityManager em;
	
	
	
	@Override
	public void addCargaison(Cargaison c) {
		em.merge(c);
	}

	@Override
	public void AddMarchandise(Marchandise m, long refCarg) {
		m.setCargaison(em.find(Cargaison.class, refCarg));
		em.merge(m);
	}

	@Override
	public List<Cargaison> getAllCargaisons() {
		// TODO Auto-generated method stub
		return em.createQuery("SELECT c FROM Cargaison c").getResultList();
	}

	@Override
	public List<Marchandise> getMarchandisesParMC(String mc) {
		// TODO Auto-generated method stub
		return em.createQuery("SELECT m FROM Marchandise m WHERE m.nom LIKE %" + mc  +"%").getResultList();
	}

	@Override
	public void deleteMarchandises(long refMarchandises) {
		em.remove(em.find(Marchandise.class,refMarchandises));

	}

}
