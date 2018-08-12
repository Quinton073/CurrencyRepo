package com.trainer.currencyrest.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.trainer.currencyrest.dbUtil.DatabaseClass;
import com.trainer.currencyrest.exception.DataNotFoundException;
import com.trainer.currencyrest.model.Currency;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;



public class CurrencyService {
	private Map<Long, Currency> currencies = DatabaseClass.getCurrencies(); 
	
	public CurrencyService(){
		currencies.put(1L, new Currency(1,"USD", "US DOLLAR"));
		currencies.put(2L, new Currency(2, "R", "RAND"));
		
	}
	
	public List<Currency> getAllCurrencies2(){
		return new ArrayList<Currency>(currencies.values());
	}
	
	public Currency getCurrency(long id){
		Currency currency = currencies.get(id);
		if(currency == null){
			throw new DataNotFoundException("Message with id " + id + " not found");
		}
		return currency;
	}
	
	public Currency addCurrencies(Currency currency){
		currency.setId(currencies.size() +1);
		currencies.put(currency.getId(), currency);
		return currency;
	}
	
 	public List<Currency> getAllCurrencies(){

		
		//Currency curr1 = new Currency("USD", "America");
		//Currency curr2 = new Currency("RAND", "South Africa");
		
		List<Currency> list = new ArrayList();
		URLConnection connection;
		URL url;
		
		try{
			//url = new URL("https://restcountries.eu/rest/v2/all");
			url = new URL("https://apilayer.net/api/live?access key=0efc512f4e8a02dc7a7a5b185a24e09&format=1");
			connection = url.openConnection();
			connection.connect();
			ObjectMapper objectMapper = new ObjectMapper();
			list = objectMapper.readValue(url,new TypeReference<List<Currency>>(){} );
			
		}catch(FileNotFoundException e){
			System.out.println("unable to find data");
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//list.add(curr1);
		//list.add(curr2);
		System.out.println(list);
		
		return list;
		
	}


}
