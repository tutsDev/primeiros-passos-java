/*
Faça um algoritmo que leia quatri números inteiros.
Calcule e imprima a soma desses números.
*/

import java.util.Scanner;

public class SomaQuatroNumeros {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System. in);
        
        System.out.println("Insira o primeiro número:");
        int num1 = input.nextInt();
        
        System.out.println("Insira o segundo número:");
        int num2 = input.nextInt();
        
        System.out.println("Insira o terceiro número:");
        int num3 = input.nextInt();
        
        System.out.println("Insira o quarto número:");
        int num4 = input.nextInt();
        
        int somaNum = num1 + num2 + num3 + num4;
        
        System.out.println("A soma dos números é: " + somaNum);
        
        input.close();
    }
}