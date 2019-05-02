package br.com.restful.controller;

import java.util.ArrayList;
import br.com.restful.dao.ClienteDAO;
import br.com.restful.model.Cliente;

public class ClienteController {
	
	private ClienteDAO clienteDAO = new ClienteDAO();
	
	public ArrayList<Cliente> listarTodos(){
		return clienteDAO.listaTodos();
	}
	public void criar(Cliente cliente) {
		clienteDAO.criar(cliente);
	}
	
}
