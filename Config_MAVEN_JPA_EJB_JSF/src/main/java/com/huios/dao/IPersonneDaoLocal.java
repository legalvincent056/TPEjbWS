package com.huios.dao;

import java.util.List;

import com.huios.entities.Personne;

public interface IPersonneDaoLocal {
    public void ajouterPersonne(Personne p);

    public List<Personne> findAll();
}
