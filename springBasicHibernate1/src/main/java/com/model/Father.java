package com.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="FATHER")
public class Father {
	@Id
	@Column(name="FATHER_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int fatherId;
	
	@Column(name="FATHER_NAME")
	private String fatherName;
	
	@OneToMany(mappedBy="father",cascade = CascadeType.ALL)
	private List<Son> sons;
	
	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public int getFatherId() {
		return fatherId;
	}

	public void setFatherId(int fatherId) {
		this.fatherId = fatherId;
	}

	public List<Son> getSons() {
		return sons;
	}

	public void setSons(List<Son> sons) {
		this.sons = sons;
	}
}
