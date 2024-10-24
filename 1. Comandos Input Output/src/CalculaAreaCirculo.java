/*
Faça um algoritmo que calcule e imprima a área de um circulo.
Considere Pi = 3,14159.
*/

import java.util.Scanner;

public class CalculaAreaCirculo {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System. in);
        
        System.out.println("Insira o raio do circulo:");
        double raioCirculo = input.nextDouble();

        double pi = 3.14159;
        double areaCirculo = (pi * (raioCirculo * raioCirculo));
        
        System.out.println(areaCirculo);
        
        input.close();
    }

}