/**
 * 
 */
package com.tsiry.org.model.singleTable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Tsiry MANANKASINA
 *
 */

@Entity
@DiscriminatorValue("ADMIN")
public class Admin extends User{
	private String fonction;		//ce champ sera null dans le tuple si l'user est de Commercial

	public Admin(String fonction , String name) {
		super();
		this.fonction = fonction;
		this.name = name;
	}
	
	
}
