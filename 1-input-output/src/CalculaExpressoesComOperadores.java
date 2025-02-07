/*
Faça um algoritmo que calcule e imprima o valor de cada expressão a seguir:

Operadores Aritmeticos:
    -(20 - 15) / 2
    -2 * (5 / 20) + 30 / (15 * 2)
    -35 / (6 + 2)
    -23 % 4

Operadores Lógicos:
    -(120 - 30) == (3 * 30)
    -! ((20 % 4) == 1) || (9 != 9)
    -(5 % 2) > 3
    -"a" == "A"
*/

public class CalculaExpressoesComOperadores {
    
    public static void main(String[] args){
        
        System.out.println((20 - 15) / 2); //Resultado: 2
        System.out.println(2 * (5 / 20) + 30 / (15 * 2)); //Resultado: 1
        System.out.println(35 / (6 + 2)); //Resultado: 4
        System.out.println(23 % 4); //Resultado: 3
        
        System.out.println((120 - 30) == (3 * 30)); //Resultado: true
        System.out.println(! ((20 % 4) == 1) || (9 != 9)); //Resultado: true
        System.out.println((5 % 2) > 3); //Resultado: false
        System.out.println("a" == "A"); //Resultado: false
    }

}