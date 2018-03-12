package org.mycompany.process;

import javax.ws.rs.core.Response;

import org.apache.camel.Exchange;
import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class RestProcess {

	private static Logger log = Logger.getLogger(RestProcess.class);

	/***
	 * Build Response Message 
	 * @param exchange
	 */
	public void buildResponse(Exchange exchange) {
		log.info("In buildResponse method");
		ObjectNode resONode = JsonNodeFactory.instance.objectNode();
		resONode.put("responseCode", "0");
		resONode.put("responseMessage", "success");
		Response httpResponseCodeWithBody = Response.status(200).entity(resONode.toString()).build();
		exchange.getOut().setBody(httpResponseCodeWithBody);		
	}
}
	
