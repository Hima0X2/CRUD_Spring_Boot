package com.sts.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class user {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //for auto incrementation
	private int id;
	private String name;
	private String phnno;
	public user(int id, String name, String phnno) {
		super();
		this.id = id;
		this.name = name;
		this.phnno = phnno;
	}
	public user() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String string) {
		this.name = string;
	}
	public String getPhnno() {
		return phnno;
	}
	public void setPhnno(String phnno) {
		this.phnno = phnno;
	}
	@Override
	public String toString() {
		return "user [id=" + id + ", name=" + name + ", phnno=" + phnno + "]";
	}
	
}
