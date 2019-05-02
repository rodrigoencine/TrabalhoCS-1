package br.com.restful.model;

import java.util.ArrayList;
import java.util.List;

public class ClienteList {
	private List<Cliente> lista = null;
	public ClienteList() {
		if(lista==null) {
			lista = new ArrayList<Cliente>();
		}
	}
	public void addCliente(Cliente c) {
		lista.add(c);
	}
}
