package com.trainer.currencyrest.dbUtil;

import java.util.HashMap;
import java.util.Map;

import com.trainer.currencyrest.model.Currency;

public class DatabaseClass {
	private static Map<Long, Currency> currencies = new HashMap<>();
	
	public static Map<Long, Currency> getCurrencies(){
		return currencies;
	}
}
