/*Você está desenvolvendo um sistema de gerenciamento de funcionários para uma empresa. 
 * A empresa possui dois tipos de funcionários: os funcionários regulares e os gerentes. Os funcionários regulares têm um nome, 
 * um número de identificação e um salário, enquanto os gerentes têm as mesmas características dos funcionários regulares, 
 * além de um departamento ao qual estão associados. Implemente as classes FuncionarioRegular e Gerente 
 * utilizando herança, de modo que a classe Gerente herde os atributos e métodos da classe FuncionarioRegular e 
 * inclua um atributo adicional para o departamento. Em seguida, crie instâncias dessas classes e teste seus métodos.*/


package funca;

public class FuncionarioRegular {

	private String nome;
	private String id;
	private double salario;
	
	
	public FuncionarioRegular(String nome, String id, double salario) {
		
		this.nome = nome;
		this.id = id;
		this.salario = salario;
		
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String toString() {
		
		
		return "Gerente: " + "Nome = " + getNome() + ", Id = " + getId() + ", salario: R$ " + getSalario();
	}
	
	
	
}
