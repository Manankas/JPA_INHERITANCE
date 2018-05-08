/**
 * 
 */
package com.tsiry.org.model.tablePerClass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * @author Tsiry MANANKASINA
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) 
public abstract class Vehicule {
	/*
	 * Ces attributs seront ajoutés dans chaque table fille
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	protected int id;
	protected String immatriculation; 
}
