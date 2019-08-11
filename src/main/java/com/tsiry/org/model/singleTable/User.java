/**
 * 
 */
package com.tsiry.org.model.singleTable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * @author Tsiry MANANKASINA
 * http://objis.com/tutoriel-jpa-n6-mapping-dheritage-avec-jpa/
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_USER") // pour differencier
@DiscriminatorValue("USER_NO_ROLE")
public abstract class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;
	protected String name;

}
