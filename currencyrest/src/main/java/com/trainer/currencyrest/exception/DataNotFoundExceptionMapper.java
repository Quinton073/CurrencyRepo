package com.trainer.currencyrest.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.trainer.currencyrest.model.ErrorMessage;

@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException> {
	
	//this is were we write our custom response
	@Override
	public Response toResponse(DataNotFoundException ex) {
			ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(), 404, "http://localhost:8080/currencyrest/webapi/currencies");
		return Response.status(Status.NOT_FOUND)
				.entity(errorMessage)
				.build();
	}
	
}
