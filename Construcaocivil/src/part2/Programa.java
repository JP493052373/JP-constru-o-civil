package part2;

import part1.Pessoa;
import part1.Cliente;
import part1.Profissional;
import part1.Formacao;
import part1.Projeto;
import part1.Project;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa cli = new Cliente();
		
		cli.setNome("Pablo");
	    cli.setCod("1123421");
	    cli.setCpf("345.456.654.78");
	    cli.setPedido("Construa uma casa");
	    
	    System.out.println( cli.toString() );
	    
	    Profissional pro = new Profissional();
	    pro.setNome("Gustavo");
	    pro.setCod("12453325");
	    pro.setCpf("134.567.543-23");
	    ((Profissional) pro).setEstado("Rio de Janeiro");
	    pro.setBairro("Cosme Velho");
	    ((Profissional) pro).setEmpresa("Construzil");
	    ((Profissional) pro).setCargo("Construtor Chefe");
	    
	    System.out.println( pro.toString() );
	   
	    Formacao form = new Formacao();
		form.setCurso("Curso Gestão de estoque em obras");
		form.setCod("1332445");
		form.setLocal(" Fundação Getúlio Vargas");
		form.setDateini("20-5-2012");
		form.setDatefim("20-7-2015");
		form.setNivel("Nivel Superior");
		
		 System.out.println( form .toString() );
		 
		 Projeto proj = new Projeto();
		 
		    proj.setCod("1243658");
		    proj.setEstado("Rio de janeiro");
			proj.setCidade(" Niterói RJ");
			proj.setBairro(" Boa Viagem");
			proj.setDateini("21-4-2019");
			proj.setDatefim("4-9-2022");
			proj.setAvaliacao("Casa de doid andares");
			proj.setStatus("incompleto");
			
		 
		
		
		
		
		System.out.println(proj.toString());
		
	    
	   
	    
	    

		
		

	}

}
