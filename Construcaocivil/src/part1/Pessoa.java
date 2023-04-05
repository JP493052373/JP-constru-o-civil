package part1;


import java.io.File;

public abstract class Pessoa {
	
	
		private String nome;
		private String estado;
		private String cidade;
		private String bairro; 
		private int cod;
		private int cpf;
		
		
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
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
		public int getCod() {
			return cod;
		}
		
		public void setCod(int cod) {
			this.cod = cod;
		}
		public int getCpf() {
			return cpf;
		}
		
		public void setCpf(int string) {
			this.cpf = string;
		}
		
		
		
		
		public String toString() {
			
			return String.format("Nome: %s\nCidade: %s\nBairro: %s\nCod: %s\nCpf: %s\n", this.nome, this.cidade, this.bairro, this.cod, this.cpf);
		}
		
		
		public abstract String getRegistro();
		
	

		public void setCod(String string) {
			// TODO Auto-generated method stub
			
		}

		public void setCpf(String string) {
			// TODO Auto-generated method stub
			
		}

		public void setPedido(String string) {
			// TODO Auto-generated method stub
		
			
		}
	}


