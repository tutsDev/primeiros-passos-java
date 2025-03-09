package programacaoorientadaaobjetos.recursividade;

public class ExemploContagemRegressiva {
    public static void main(String[] args) {
        contagemRegressiva(10);
    }

    /**Metodo responsavel por imprimir uma contagem regressiva usando recursividade. Caso base -> (inicioCont == 0).
     * @param inicioCont Inicio da contagem regressiva.
     */
    public static void contagemRegressiva(int inicioCont){
        if (inicioCont == 0) {
            System.out.println("FIM!");
        } else {
            System.out.print(inicioCont + " ");
            contagemRegressiva( inicioCont - 1);
            /*Cada chamada reduz n em 1 até n == 0, que é o caso base, onde a recursão para.*/
        }
    }
}
