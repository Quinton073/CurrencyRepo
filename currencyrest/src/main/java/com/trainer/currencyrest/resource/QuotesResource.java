package com.trainer.currencyrest.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import javax.ws.rs.core.MediaType;

import com.trainer.currencyrest.model.Quotes;
import com.trainer.currencyrest.repository.QuotesRepo;


@Path("/Quotes")
public class QuotesResource {
	
	QuotesRepo quotesrepo = new QuotesRepo();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Quotes> getQuotes(){
		
		return quotesrepo.getAllQuotes();
	}
}
