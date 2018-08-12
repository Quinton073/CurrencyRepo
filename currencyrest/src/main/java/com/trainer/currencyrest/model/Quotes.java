package com.trainer.currencyrest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Quotes {
	
	private int QuoteId;
	private String sourceCurrencyCode;
	private String sourceCurrencyName;
	private double sourceAmount;
	private String targetCurrencyCode;
	private String targetCurrencyName;
	private String Date;
	
	public Quotes(){}
	
	
	public Quotes(int QuoteId, String sourceCurrencyCode, String sourceCurrencyName, double sourceAmount, String targetCurrencyCode,
			String targetCurrencyName, String date) {
		super();
		this.QuoteId = QuoteId;
		this.sourceCurrencyCode = sourceCurrencyCode;
		this.sourceCurrencyName = sourceCurrencyName;
		this.sourceAmount = sourceAmount;
		this.targetCurrencyCode = targetCurrencyCode;
		this.targetCurrencyName = targetCurrencyName;
		this.Date = date;
	}


	

	public int getQuoteId() {
		return QuoteId;
	}


	public void setQuoteId(int i) {
		QuoteId = i;
	}


	


	public String getDate() {
		return Date;
	}


	public void setDate(String date) {
		Date = date;
	}


	public String getSourceCurrencyCode() {
		return sourceCurrencyCode;
	}

	public void setSourceCurrencyCode(String sourceCurrencyCode) {
		this.sourceCurrencyCode = sourceCurrencyCode;
	}

	public String getSourceCurrencyName() {
		return sourceCurrencyName;
	}

	public void setSourceCurrencyName(String sourceCurrencyName) {
		this.sourceCurrencyName = sourceCurrencyName;
	}

	public double getSourceAmount() {
		return sourceAmount;
	}

	public void setSourceAmount(double sourceAmount) {
		this.sourceAmount = sourceAmount;
	}

	public String getTargetCurrencyCode() {
		return targetCurrencyCode;
	}

	public void setTargetCurrencyCode(String targetCurrencyCode) {
		this.targetCurrencyCode = targetCurrencyCode;
	}

	public String getTargetCurrencyName() {
		return targetCurrencyName;
	}

	public void setTargetCurrencyName(String targetCurrencyName) {
		this.targetCurrencyName = targetCurrencyName;
	}
	
	@Override
	public String toString() {
		return "Quotes [QuoteId=" + QuoteId + ", sourceCurrencyCode=" + sourceCurrencyCode + ", sourceCurrencyName="
				+ sourceCurrencyName + ", sourceAmount=" + sourceAmount + ", targetCurrencyCode=" + targetCurrencyCode
				+ ", targetCurrencyName=" + targetCurrencyName + ", Date=" + Date + "]";
	}
}
