package com.sk.model;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;


/**
 * The persistent class for the address_client database table.
 * 
 */
@Entity
@Table(name="address_client")
@Data
//@NamedQuery(name="AddressClient.findAll", query="SELECT a FROM AddressClient a")
public class AddressClient implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int addid;

	private int addressid;

	private int entityid;

}