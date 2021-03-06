package com.trainer.currencyrest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Currency
{
	private String currencyCode;
	public String currencyName;
	
	public Currency(){}
	
	public Currency(String currencyCode, String currencyName) {
		super();
		this.currencyCode = currencyCode;
		this.currencyName = currencyName;
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
	@Override
	public String toString() {
		return "Currency [currencyCode=" + currencyCode + ", currencyName=" + currencyName + "]";
	}
	
	
}
