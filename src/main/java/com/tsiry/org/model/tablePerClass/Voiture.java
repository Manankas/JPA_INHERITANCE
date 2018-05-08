/**
 * 
 */
package com.tsiry.org.model.tablePerClass;

import javax.persistence.Entity;

/**
 * @author Tsiry MANANKASINA
 *
 */
@Entity
public class Voiture extends Vehicule {
	private int nbPortes;

	public Voiture(int nbPortes ,String immatriculation) {
		super();
		this.nbPortes = nbPortes;
		this.immatriculation = immatriculation;
	}
	
	
}
