package com.iasa.ka23.ManagementSystem.bl.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="dbo.Counterparty")
public class Counterparty extends IdentifyableBean implements Serializable, Cloneable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    //@GeneratedValue
    @Column(columnDefinition="serial",name="id_counterparty")
	private Integer id;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="Phone_number")
	private Integer number;

	/*@OneToOne(fetch = FetchType.LAZY, mappedBy="counterparty")
	private LegalPerson legalPerson;

	@OneToOne(fetch = FetchType.LAZY, mappedBy="counterparty")
	private IndividualPerson individualPerson;

	public String getName(){
		String name = legalPerson.getName();
		if (name==null){
		name = individualPerson.getName();
		}
		return name;
	}*/
	
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	@Override
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	/*public LegalPerson getLegalPerson() {
		return legalPerson;
	}

	public void setLegalPerson(LegalPerson legalPerson) {
		this.legalPerson = legalPerson;
	}*/

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Counterparty other = (Counterparty) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}

