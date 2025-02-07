/*
Faça um algoritmo que leia um número inteiro.
Se i número for maior que 20, calcule e imprima a metade dele.
*/

import java.util.Scanner;

public class CalculaMetadeSeMaiorQue20{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System. in);
        
        System.out.println("Insira um numero:");
        double numero = input.nextDouble();

        double metade = numero / 2;
        
        if (numero > 20) {

            System.out.println("A metade do número é: " + metade);
            
        }
        
        input.close();
    }   
}