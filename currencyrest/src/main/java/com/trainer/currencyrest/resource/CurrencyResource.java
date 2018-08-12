package com.trainer.currencyrest.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.trainer.currencyrest.model.Currency;
import com.trainer.currencyrest.model.Quotes;
import com.trainer.currencyrest.repository.QuotesRepo;
import com.trainer.currencyrest.service.CurrencyService;


@Path("/currencies")
public class CurrencyResource {
	
	CurrencyService currencyservice = new CurrencyService();
	Currency currency = new Currency();
	Quotes quotes = new Quotes();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Currency> getCurrencies(){
		return currencyservice.getAllCurrencies2();
	}
	
	QuotesRepo quotesRepo = new QuotesRepo();
	
	@GET
	@Path("/{currencyCode}")
	@Produces(MediaType.APPLICATION_JSON)
	public Currency convertCurrency(@PathParam("currencyCode") long currencycode){
		
		currency = currencyservice.getCurrency(currencycode);
		
		quotes.setSourceCurrencyCode(currency.getCurrencyCode());
		quotes.setSourceCurrencyName(currency.getCurrencyName());
		
		quotesRepo.setQuotes(quotes);
		
		return currency;
		
		
	}
	
}
