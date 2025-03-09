package programacaoorientadaaobjetos.recursividade;

public class ExemploFibonacciRecursivo {
    public static void main(String[] args) {
        System.out.println("Fibonacci de 6: " + fibonacci(6));
    }

    /**Metodo responsavel por calcular o fibonacci usando recursividade. Casos base -> (num == 0) e (num == 1).
     * @param num Número que será calculado fibonacci.
     */
    public static int fibonacci(int num) {
        if (num == 0) return 0;
        if (num == 1) return 1;
        return fibonacci(num - 1) + fibonacci(num - 2);
        /*Cada número na sequência de Fibonacci é a soma dos dois anteriores.*/
    }
}

