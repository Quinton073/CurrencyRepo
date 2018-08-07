package com.trainer.currencyrest;

import java.util.List;
import java.util.Arrays;


import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/currency")
public class CurrencyResource {
	
	CurrencyRepository repo = new CurrencyRepository();
	@GET	
	@Produces(MediaType.APPLICATION_JSON)
	public List<Currency> getCurrency(){
		
		System.out.println("get currency called...");
		
		return repo.getCurrency();
	}
	
	@GET
	@Path("currencycode/{CurrencyCode}")
	@Produces(MediaType.APPLICATION_JSON)
	public Currency convertCurrency(@PathParam("CurrencyCode")String currencyCode){
		
		System.out.println("get by id  currency called..." + currencyCode);
		
		return repo.convertCurrency(currencyCode);
		
	}
	
	
	@POST
	@Path("Create")
	public Currency createCurrency(Currency curr1){
		
		System.out.println(curr1);
		repo.create(curr1);
		return curr1;
	}
}
