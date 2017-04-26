package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="SON")
public class Son {
	@Id
	@Column(name="SON_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sonId;
	
	@Column(name="SON_NAME")
	private String sonName;
	
	@OneToOne()
	@JoinColumn(name="FATHER_ID")
	private Father father;

	public String getSonName() {
		return sonName;
	}

	public void setSonName(String sonName) {
		this.sonName = sonName;
	}

	public int getSonId() {
		return sonId;
	}

	public void setSonId(int sonId) {
		this.sonId = sonId;
	}

	public Father getFather() {
		return father;
	}

	public void setFather(Father father) {
		this.father = father;
	}
}
