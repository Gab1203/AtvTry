/*
Você está desenvolvendo um programa para calcular a média de um conjunto de números digitados pelo usuário. 
No entanto, como nem todos os usuários digitam valores numéricos corretamente, é necessário implementar uma validação para lidar com possíveis erros. 
Utilize um bloco try-catch para capturar exceções e garantir que apenas valores numéricos sejam aceitos como entrada. 
Se o usuário digitar um valor não numérico, exiba uma mensagem de erro e peça que ele insira o valor novamente. 
Depois de receber todos os valores, calcule a média e exiba o resultado.*/
package average;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculoMedia {

	
	
	public static void main(String[] args) {
		
		double[] numeros = new double[5];
		String[] numbers = new String[numeros.length];
		double soma = 0;
		int i = 0;
		Scanner scan = new Scanner(System.in);
		
			
		do {
			
			System.out.printf("Digite o %d° número:\n", i+1);
			numbers[i] = scan.nextLine();
			
			try {
				
				numeros[i] = Double.parseDouble(numbers[i]);
				soma += numeros[i];	
				i++;
				
				
			} catch(Exception e) {
				
				
				
				System.out.println("\nInput inválido, digite apenas números!!!\n");

				
				
			}
			
			
			
		}while(i < numeros.length);
			
		double media = soma / numeros.length;
		
		System.out.printf("\nA média final é: %.2f\n", media);
		
		
	}
	
}
