package org.mycompany.service;

import java.io.InputStream;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Produces(value = "application/json")
public interface RestService {

	@GET
	@Path("/getservice")
	String getService(InputStream request);	

}
