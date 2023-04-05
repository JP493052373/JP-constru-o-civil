package part1;

public class Cliente  extends Pessoa{
	private String nome;
	private String pedido;
	private int cod;
	private int cpf;
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPedido() {
		return pedido;
	}

	public void setPedido(String pedido) {
		this.pedido = pedido;
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
	
	
	
	
	
	
	
	
	
	
	
	
	//Repare que este toString() reaproveitou a implementa��o do toString()
	//da classe base por meio do super.toString() e acrescentou ao resultado
	//a informa��o pertinente a classe atual.
	@Override
	public String toString(){
		return super.toString() + String.format("nome: %s\nPedido: %s\nCod do cliente: %s\nCpf: %s\n", this.nome, this.getPedido(), this.cod, this.cpf);
	}

	//Por conta do m�todo abstrato definido na classe base, a classe atual
	//que � concreta, foi obrigada a fornecer uma implementa��o para tal m�todo
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@Override
	public String getRegistro() {
		// TODO Auto-generated method stub
		return "Registro do Cliente";
	}

}
