package com.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("son")
public class Son {
	@Autowired
	private Father father;
	private String sonName;
	public Father getFather() {
		return father;
	}
	public void setFather(Father father) {
		this.father = father;
	}
	public String getSonName() {
		return sonName;
	}
	public void setSonName(String sonName) {
		this.sonName = sonName;
	}
}