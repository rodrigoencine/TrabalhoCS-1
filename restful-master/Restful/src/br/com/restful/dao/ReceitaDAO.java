package br.com.restful.dao;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.JsonObject;

import br.com.restful.model.Receita;

public class ReceitaDAO {
	FileWriter w = null;
	private ArrayList<Receita> receitaBD = 
	new ArrayList<Receita>();
	
	public ReceitaDAO() {
	}
	
	public Integer criarReceita(Receita receita) {
//		JsonObject json = new JsonObject();
//		json.addProperty("tipo", receita.getTipo());
//		try {
//			w = new FileWriter("dados_json.json");
//			w.write(json.toString());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println(json.toString());
//		System.out.println(receita.getTipo());
		return 1;
	}
	
	public ArrayList<Receita> listaTodos(){
		
		return this.receitaBD;
	}
}
