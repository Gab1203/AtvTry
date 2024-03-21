/*Você está desenvolvendo um sistema de gerenciamento de funcionários para uma empresa. 
 * A empresa possui dois tipos de funcionários: os funcionários regulares e os gerentes. Os funcionários regulares têm um nome, 
 * um número de identificação e um salário, enquanto os gerentes têm as mesmas características dos funcionários regulares, 
 * além de um departamento ao qual estão associados. Implemente as classes FuncionarioRegular e Gerente 
 * utilizando herança, de modo que a classe Gerente herde os atributos e métodos da classe FuncionarioRegular e 
 * inclua um atributo adicional para o departamento. Em seguida, crie instâncias dessas classes e teste seus métodos.*/
package funca;


public class Main {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente("Gabriel", "123", 12000, "Financeiro");
		FuncionarioRegular funcionario = new FuncionarioRegular("Elmo", "321", 1200);
		
		System.out.println(gerente.toString());
		gerente.setSalario(gerente.getSalario() + 2000);
		System.out.println(gerente.toString());
		System.out.println(funcionario.toString());
		funcionario.setNome("Dora");
		System.out.println(funcionario.toString());

	}

}
