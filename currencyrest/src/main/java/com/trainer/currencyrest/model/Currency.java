package com.trainer.currencyrest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Currency {
	
	private long id;
	private String currencyCode;
	private String currencyName;
	
	//there no argument constructor
	public Currency(){
		
	}
	
	
	//parameterized constr. lets us create new instance of the currency class
	public Currency(long id, String currencyCode, String currencyName) {
		super();
		this.currencyCode = currencyCode;
		this.currencyName = currencyName;
		this.id = id;
		
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getCurrencyName() {
		return currencyName;
	}
	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}
	
	
}
