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
@DiscriminatorValue("COMMERCIAL")
public class CommercialUser extends User{
	private String grade;                 //ce champ sera null dans le tuple si l'user est de type ADMIN

	public CommercialUser(String name , String grade) {
		super();
		this.name = name;
		this.grade = grade;
	}
	
	
}
