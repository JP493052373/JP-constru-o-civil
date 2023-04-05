package part1;

import java.util.ArrayList;
import java.util.List;

public class Project {
	private String nome;
	private String tipo;
	
private List<Pessoa> geral;
	
	public Project() {
		this.geral = new ArrayList<Pessoa>();
	}
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public List<Pessoa> getGeral() {
		return geral;
	}
	
	public void addIntegrante(Pessoa geral) {
		this.geral.add(geral);
	}

}
