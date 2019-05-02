package br.com.restful.controller;

import java.io.IOException;
import java.util.ArrayList;

import br.com.restful.dao.ReceitaDAO;
import br.com.restful.model.Receita;

public class ReceitaController {
	private ReceitaDAO receitaDAO = new ReceitaDAO();
	
//	public ReceitaController() {
//		this.receitaDAO = new ReceitaDAO();
//	}
	
	public Integer criarReceita(Receita receita) {
		return this.receitaDAO.criarReceita(receita);
	}
	
	public ArrayList<Receita> listarTodos(){
		return this.receitaDAO.listaTodos();
	}
}
