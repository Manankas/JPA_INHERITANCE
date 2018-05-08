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
public class Camion extends Vehicule{
	private int volume;

	public Camion(int volume , String immatriculation) {
		super();
		this.volume = volume;
		this.immatriculation = immatriculation;
	}
	
	
}
