package com.madebythinkers.restful;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.madebythinkers.Message;


@Path("message/{id}")
public class MessageResource {

	@GET
	@Produces("text/plain")
	public String message(@PathParam("id") Long id) {
		return getMessage(id).toString(); 
	}
	
	@GET
	@Produces("text/xml")
	public Message messageXML(@PathParam("id") Long id) {
		return getMessage(id);
	}
	
	@GET
	@Produces("application/json")
	public Message getMessageJSON(@PathParam("id") Long id) {
		return getMessage(id);
	}
	
	/**
	 * Retorna uma mensagem qualquer para ser usada como exemplo.
	 * 
	 * @return
	 */
	private Message getMessage(final Long id) {
		Message message = new Message();
		message.setId(id);
		message.setTitle("Sucesso!");
		message.setText("Mensagem de sucesso.");
		message.setType("SUCCESS");
		
		return message;
	}
}
