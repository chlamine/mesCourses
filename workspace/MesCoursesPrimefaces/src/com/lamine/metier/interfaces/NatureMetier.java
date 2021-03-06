package com.lamine.metier.interfaces;

import java.util.List;
import com.lamine.dao.entite.Nature;

public interface NatureMetier {
	public Integer creer(Nature nature);
	public Nature modifier(Nature nature);
	public void supprimer(Integer idNat);
	public Nature afficher(Integer idNat);
	public List<Nature> toutAfficher();
}