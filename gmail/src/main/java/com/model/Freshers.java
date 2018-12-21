package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Freshers {
	
	
	@Column
	String SName;
	
	@Id
	@GeneratedValue
	int Sid;

	public Freshers(String sName) {
		super();
		SName = sName;
	}

	public String getSName() {
		return SName;
	}

	public void setSName(String sName) {
		SName = sName;
	}

	public int getSid() {
		return Sid;
	}

	public void setSid(int sid) {
		Sid = sid;
	}
	
	

}
