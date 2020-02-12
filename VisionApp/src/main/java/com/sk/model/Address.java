package com.sk.model;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;


/**
 * The persistent class for the address database table.
 * 
 */
@Entity
@Table(name="address")
@Data
//@NamedQuery(name="Address.findAll", query="SELECT a FROM Address a")
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	private String addr1;

	private String addr2;

	@Id
	private int addressid;

	private String city;

	private String country;

	private String district;

	private int entityid;

	private String state;

	private String zip;

}