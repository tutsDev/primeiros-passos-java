package programacaoorientadaaobjetos.introducaometodoseobjetos.testeclasses;

import programacaoorientadaaobjetos.introducaometodoseobjetos.classes.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {

        int soma = Calculadora.somar(5, 2);
        int subtrai = Calculadora.subtrair(5, 2);
        double multiplica = Calculadora.multiplicar(7, 10);
        double divide = Calculadora.dividir(60, 2);

        System.out.println("Resultado soma: " + soma);
        System.out.println("Resultado subtração: " + subtrai);
        System.out.println("Resultado multiplicação: " + multiplica);
        System.out.println("Resultado divisão: " + divide);

    }
}
