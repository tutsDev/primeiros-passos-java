package programacaoorientadaaobjetos.introducaometodoseobjetos.classes;

public class Calculadora {

    public static int somar(int num1, int num2){
        int resultSoma = num1 + num2;
        return resultSoma;
    }

    public static int subtrair(int num1, int num2){
        int resultSubtracao = num1 - num2;
        return resultSubtracao;
    }

    public static double multiplicar(int num1, int num2){
        double resultMultiplicacao = num1 * num2;
        return resultMultiplicacao;
    }

    public static double dividir(int num1, int num2){
        double resultDivisao;

        if (num2 == 0){
            resultDivisao = num1;
            return resultDivisao;
        }

        resultDivisao = num1 / num2;
        return resultDivisao;

    }

}
