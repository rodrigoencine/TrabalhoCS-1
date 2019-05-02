package br.com.restful.dao;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import br.com.restful.model.Cliente;

public class ClienteDAO {
	private Persistencia per = new Persistencia();
	private ArrayList<Cliente> lista;
	
	public ClienteDAO() {
		
		this.lista = new ArrayList<Cliente>();
		Cliente cliente = new Cliente();
		cliente.setCpf("12345");
		cliente.setEndereco("xxxxx");
		cliente.setId(1);
		cliente.setNome("Rodrigo");
		
		Cliente cliente2 = new Cliente();
		cliente2.setCpf("12345");
		cliente2.setEndereco("xxxxx");
		cliente2.setId(1);
		cliente2.setNome("Patricia");
		
		Cliente cliente3 = new Cliente();
		cliente3.setCpf("12345");
		cliente3.setEndereco("xxxxx");
		cliente3.setId(1);
		cliente3.setNome("julia");
		
		lista.add(cliente);
		lista.add(cliente2);
		lista.add(cliente3);
	}

	public ArrayList<Cliente> listaTodos(){
		
//		this.lista.add(c);
		return this.lista;
	}
	
	public void criar(Cliente cliente) {		
		File file = per.teste();
//		per.salvarCliente(cliente);
		per.salvar(cliente);
	}
}
