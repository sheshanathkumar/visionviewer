package com.sk.model;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;


/**
 * The persistent class for the contact database table.
 * 
 */
@Entity
@Table(name="contact")
@Data
//@NamedQuery(name="Contact.findAll", query="SELECT c FROM Contact c")
public class Contact implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int contactid;

	private String email;

	private int entityid;

	private String firstname;

	private String lastname;

	private String phone;
}