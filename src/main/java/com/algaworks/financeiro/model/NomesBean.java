package com.algaworks.financeiro.model;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class NomesBean {

	private String nome;
	private List<String> nomes = new ArrayList<>();
	
	public String adicionar(){
		this.nomes.add(nome);
		if(this.nomes.size()>=3){
			return "Ola?faces-redirect=true";
		}
		return null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getNomes() {
		return nomes;
	}
	
	
}
