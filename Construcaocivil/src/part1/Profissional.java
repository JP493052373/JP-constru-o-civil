package part1;
public class Profissional extends Pessoa {
	private String nome;
	private int cod;
	private int cpf;
	private String estado;
	private String cidade;
	private String bairro;
	private String empresa;
	private String cargo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}
	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
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
	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return super.toString() + String.format("Nome: %s\nCod: %s\nCpf: %s\nEstado: %s\nBairro: %s\nEmpresa: %s\nCargo: %s\n", this.nome, this.getCod(), this.cpf, this.estado, this.bairro, this.empresa, this.cargo);
	}
	

	
	
	
	
	
	
	
	
	
	

	@Override
	public String getRegistro() {
		// TODO Auto-generated method stub
		return "Registro do Profissional";
	}

}
