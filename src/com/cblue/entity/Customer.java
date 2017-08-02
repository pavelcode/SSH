package com.cblue.entity;



/**
 * Customer entity. @author MyEclipse Persistence Tools
 */

public class Customer  implements java.io.Serializable {


	public Customer() {
		super();
	}
	public Customer(String name, String pass) {
		super();
		this.name = name;
		this.pass = pass;
	}
	private int id;
	private String name;
	private String pass;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", pass=" + pass + "]";
	}
	







}