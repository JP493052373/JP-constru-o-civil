package part1;


public class Projeto extends Pessoa {
	private int cod;
	private String datefim;
	private String dateini;
	private String estado;
	private String cidade;
	private String bairro;
	private String avaliacao;
	private String status;
	
	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getDatefim() {
		return datefim;
	}

	public void setDatefim(String string) {
		this.datefim = string;
	}

	public String getDateini() {
		return dateini;
	}

	public void setDateini(String string) {
		this.dateini = string;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(String string) {
		this.avaliacao = string;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String toString() {
		return super.toString() + "Codigo do projeto: " + this.cod + "\n"+ "Estado"+ this.estado + "Cidade: "+this.cidade +"\n"+ "Bairro: "+this.bairro +"\n"+ "Data de inicio: " + this.dateini + "\n"+ "Data de fim: "+ this.datefim + "\n"+ "Avaliação:"+ this.avaliacao + "\n"+ "Status atual:"+ this.status + "\n";
	}

	@Override
	public String getRegistro() {
		// TODO Auto-generated method stub
		return "Registro do Projeto";
	}

}
