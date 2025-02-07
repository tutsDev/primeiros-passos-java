/*
Faça um algoritmo para ler e imprimir em cada linha:
    - Seu nome completo;
    - Sua idade;
    - Seu cruso.
*/

import java.util.Scanner;

public class ImprimeInformacoesFaculdadeEntrada {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System. in);
        
        System.out.println("Qual é o seu nome?");
        String nome = input.nextLine();
        
        System.out.println("Qual é o seu curso?");
        String curso = input.nextLine();
        
        System.out.println("Quantos anos você tem?");
        int idade = input.nextInt();
        
        System.out.println("Seu nome é " + nome);
        System.out.println("Seu curso é " + curso);
        System.out.println("Você tem " + idade + " anos");

        input.close();
    } 

}