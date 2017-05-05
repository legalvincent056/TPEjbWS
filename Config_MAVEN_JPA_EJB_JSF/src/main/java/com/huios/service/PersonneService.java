package com.huios.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.huios.dao.IPersonneDaoLocal;
import com.huios.entities.Personne;

@Stateless
public class PersonneService implements IPersonneServiceLocal, IPersonneServiceRemote {

    @EJB
    private IPersonneDaoLocal dao;

    @Override
    public void ajouterPersonne(Personne p) {
	// TODO Auto-generated method stub
	dao.ajouterPersonne(p);
    }

    @Override
    public List<Personne> findAll() {
	// TODO Auto-generated method stub
	return dao.findAll();
    }

}
