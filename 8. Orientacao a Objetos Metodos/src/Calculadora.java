/*Calculadora Simples
Crie uma classe chamada Calculadora com métodos para somar, subtrair, 
multiplicar e dividir dois números.
Cada método deve receber dois parâmetros e retornar o resultado da operação.
No método main, crie um objeto da classe Calculadora e teste cada método.
*/

public class Calculadora {
    
    public void soma(int num1, int num2){

        int somaResultado = num1 + num2;
        System.out.println(somaResultado);

    }

    public void subtrai(int num1, int num2){

        int subtraiResultado = num1 - num2;
        System.out.println(subtraiResultado);

    }

    public void multiplica(double num1, double num2){

        double multiplicaResultado = num1 * num2;
        System.out.println(multiplicaResultado);

    }

    public void divide(double num1, double num2){

        if(num2 == 0){

            System.out.println("Não foi possível dividir");
            return;

        }

        double divideResultado = num1 / num2;
        System.out.println(divideResultado);

    }

}
