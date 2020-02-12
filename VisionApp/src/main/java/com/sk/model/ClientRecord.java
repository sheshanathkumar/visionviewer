package com.sk.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the client_record database table.
 * 
 */
@Entity
@Table(name="client_record")
//@NamedQuery(name="ClientRecord.findAll", query="SELECT c FROM ClientRecord c")
public class ClientRecord implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="client_info_id")
	private Integer clientInfoId;

	private String email;

	private String entcode;

	private String entityid;

	private String entname;

	private String fulladdress;

	private String name;

	private String phonenumber;

	public ClientRecord() {
	}

	public int getClientInfoId() {
		return this.clientInfoId;
	}

	public void setClientInfoId(int clientInfoId) {
		this.clientInfoId = clientInfoId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEntcode() {
		return this.entcode;
	}

	public void setEntcode(String entcode) {
		this.entcode = entcode;
	}

	public String getEntityid() {
		return this.entityid;
	}

	public void setEntityid(String entityid) {
		this.entityid = entityid;
	}

	public String getEntname() {
		return this.entname;
	}

	public void setEntname(String entname) {
		this.entname = entname;
	}

	public String getFulladdress() {
		return this.fulladdress;
	}

	public void setFulladdress(String fulladdress) {
		this.fulladdress = fulladdress;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhonenumber() {
		return this.phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

}