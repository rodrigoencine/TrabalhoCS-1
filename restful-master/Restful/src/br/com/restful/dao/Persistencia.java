package br.com.restful.dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import br.com.restful.model.Cliente;

public class Persistencia{
	private XStream xstream = new XStream(new DomDriver());
	private File file = null; 
	List<Cliente> clientes = new ArrayList<Cliente>();
	public File teste() {
		this.file = new File("banco_dados.xml");
		return file;
	}
	
	public void salvarCliente(Cliente cliente) {
//
//		clientes.add(cliente);
//		
//		xstream.alias("clientes", List.class);
//		xstream.alias("Cliente", Cliente.class);
		
		xstream.alias("Cliente", Cliente.class);
		String xml = xstream.toXML(cliente);
		String path = "banco_dados.xml";
		
			try {
				
				FileWriter fw = new FileWriter(path, true);
				BufferedWriter conexao = new BufferedWriter(fw);
				PrintWriter gravar = new PrintWriter(conexao);
				gravar.println(xml);
				gravar.close();
			
			}
			 catch (IOException e) {
				e.printStackTrace();
			 }
		}
	
	public Cliente buscaArquivo(){
	xstream.alias("cliente", Cliente.class);
	FileReader reader = null;
		try {
			//carrega o arquivo XML para um objeto reader
			reader = new FileReader(
					"/home/user/banco_dados.xml"
			);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return  (Cliente) xstream.fromXML(reader);
	
	}	
}
