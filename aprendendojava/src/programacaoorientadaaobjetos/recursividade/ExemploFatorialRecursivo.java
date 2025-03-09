package programacaoorientadaaobjetos.recursividade;

public class ExemploFatorialRecursivo {
    public static void main(String[] args) {
        System.out.println("Fatorial de 5: " + fatorial(5));
    }

    /**Metodo responsavel por calcular o fatorial usando recursividade. Caso base -> (num == 1).
     * @param num Número que será calculado o fatorial.
     */
    public static int fatorial(int num){
        if (num == 1){
            return 1;
        }
        return num * fatorial(num - 1);
    }
}

