/*Você está desenvolvendo um sistema de gerenciamento de funcionários para uma empresa. 
 * A empresa possui dois tipos de funcionários: os funcionários regulares e os gerentes. Os funcionários regulares têm um nome, 
 * um número de identificação e um salário, enquanto os gerentes têm as mesmas características dos funcionários regulares, 
 * além de um departamento ao qual estão associados. Implemente as classes FuncionarioRegular e Gerente 
 * utilizando herança, de modo que a classe Gerente herde os atributos e métodos da classe FuncionarioRegular e 
 * inclua um atributo adicional para o departamento. Em seguida, crie instâncias dessas classes e teste seus métodos.*/
package funca;

public class Gerente extends FuncionarioRegular{
	private String departamento;
	
	public String getDepartamento(){
		
		return this.departamento;
	}
	
	public void setDepartamento(String departamento) {
		
		this.departamento = departamento;
	}
	
	public Gerente(String nome, String id, double salario, String departamento) {
		super(nome, id, salario);
		
		this.departamento = departamento;
		
	}
	
	public String toString() {
		
		
		return "Gerente: " + "Nome = " + getNome() + ", Id = " + getId() + ", salario: R$ " + getSalario() + ", departamento: " + getDepartamento();
	}
	

}
