/*
Ler dois númeors e apresentá-los em ordem decrescente.
*/

import java.util.Scanner;

public class ImprimeOrdemDecrescente{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System. in);
        
        System.out.println("Insira o primeiro número:");
        int primeiroNumero = input.nextInt();
        
        System.out.println("Insira o segundo número:");
        int segundoNumero = input.nextInt();
        
        boolean maiorNumero = primeiroNumero > segundoNumero;
        
        if (maiorNumero == true){
            System.out.println("Os números em ordem decrescente são " + primeiroNumero + " e " + segundoNumero);
        } else {
            System.out.println("Os números em ordem decrescente são " + segundoNumero + " e " + primeiroNumero);
        }
        
        input.close();
    } 
}