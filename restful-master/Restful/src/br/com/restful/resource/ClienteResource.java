package br.com.restful.resource;

import java.util.ArrayList;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import br.com.restful.controller.ClienteController;
import br.com.restful.model.Cliente;

@Path("/cliente")
public class ClienteResource {
	
	ClienteController controller = new ClienteController();
	
	@GET
	@Path("/listarTodos")
	@Produces("application/json")
	public ArrayList<Cliente> listarTodos(){
		System.out.println("saiu");		
		return this.controller.listarTodos();
	}
	
	@POST
	@Path("/cadastrar")
	@Consumes("application/json")
	public Response cadastrar( Cliente receita) {
		this.controller.criar(receita);
		try {
			 return Response.status(200).entity("cadastro realizado.").build();
			 } catch (Exception e) {
			 throw new WebApplicationException(500);
		}
	}
	@DELETE
	@Path("/deletar/{id}")
	@Consumes("application/json")
	public void deletar(@PathParam("id") Integer id) {
		System.out.println("funcionou" +id);
	}
}
