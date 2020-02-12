package com.sk.model;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;


/**
 * The persistent class for the client database table.
 * 
 */
@Entity
@Table(name="client")
@Data
//@NamedQuery(name="Client.findAll", query="SELECT c FROM Client c")
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;

	private int addressid;

	private String entcode;

	@Id
	private int entityid;

	private String entname;

}