/*Calculadora Simples
Crie uma classe chamada Calculadora com métodos para somar, subtrair, 
multiplicar e dividir dois números.
Cada método deve receber dois parâmetros e retornar o resultado da operação.
No método main, crie um objeto da classe Calculadora e teste cada método.
*/

public class CalculadoraMain {

    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora();

        int numInt1 = 10;
        int numInt2 = 5;
        double numDouble1 = 10;
        double numDouble2 = 5;

        calculadora.soma(numInt1, numInt2);
        calculadora.subtrai(numInt1, numInt2);
        calculadora.multiplica(numDouble1, numDouble2);
        calculadora.divide(numDouble1, numDouble2);

    }
    
}
