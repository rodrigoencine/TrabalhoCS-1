package br.com.restful.resource;

import java.io.IOException;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.restful.controller.ReceitaController;
import br.com.restful.model.Receita;

@Path("/receita")
public class ReceitaResource {
	ReceitaController receitaController = new ReceitaController();
	
	@POST
	@Path("/cadastrar")
	@Consumes("application/json")
	public void criarReceita(Receita receita) throws IOException {
		receitaController.criarReceita(receita);
	}
	
	@GET
	@Path("/listarTodos")
	@Produces("application/json")
	public ArrayList<Receita> listarTodos(){
		return receitaController.listarTodos();
	}
}
