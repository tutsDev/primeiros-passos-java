/*
Faça um algoritmo para ler um número inteiro.
Verifique se o número está no intervalo entre 50 e 100.
Se estiver, imprimir "Está no Intervalo"
Se não, imprimir "Não prtence ao intervalo"
*/

import java.util.Scanner;

public class VerificaSeEstaNoIntervalo{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System. in);
        
        System.out.println("Insira um número:");
        int numero = input.nextInt();
        
        if (numero >= 50 && numero <= 100){
            System.out.println("O número " + numero + " está no intervalo");
        } else {
            System.out.println("O número " + numero + " não está no intervalo");
        }
        
        input.close();
        
    }
}