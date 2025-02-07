/*
Faça um algoritmo que receba a idade de uma pessoa.
Se for maior de idade imprima: "Maior de Idade"
Senão imprima: "Menor de Idade"
*/

import java.util.Scanner;

public class VerificaSeMaiorIdade{

	public static void main(String[] args){
		
		Scanner input = new Scanner(System. in);
		
		System.out.println("Insira sua idade:");
		int idade = input.nextInt();
		
		if (idade >= 18) {
			System.out.println("Maior de idade.");
		} else {
			System.out.println("Menor de idade.");
		}
		
		input.close();
	}
}