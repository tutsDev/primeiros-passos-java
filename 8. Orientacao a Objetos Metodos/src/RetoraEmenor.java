public class RetoraEmenor {
    
    public static void main(String[] args) {

        double[] listaTeste = new double[]{10,5,4,8,15,16,20,18,56,23};

        double maiorDaLista = retornaMaior(listaTeste);
        double menorDaLista = retornaMenor(listaTeste);
        double mediaMaiorMenorDaLista = mediaMaiorMenor(listaTeste);

        System.out.println("O maior é: " + maiorDaLista);
        System.out.println("O menor é: " + menorDaLista);
        System.out.println("Media do maior e menor: " + mediaMaiorMenorDaLista);
        
    }

    public static double retornaMaior(double[] listaEntrada){

        double maiorNumero = listaEntrada[0];

        for (int i = 0; i < listaEntrada.length; i++) {

            if(listaEntrada[i] > maiorNumero){
                maiorNumero = listaEntrada[i];
            }
            
        }

        return maiorNumero;

    }

    public static double retornaMenor(double[] listaEntrada){

        double menorNumero = listaEntrada[0];

        for (int i = 0; i < listaEntrada.length; i++) {

            if(listaEntrada[i] < menorNumero){
                menorNumero = listaEntrada[i];
            }
            
        }

        return menorNumero;
    }

    public static double mediaMaiorMenor(double[] listaEntrada) {

        double menorDaLista = retornaMenor(listaEntrada);
        double maiorDaLista = retornaMaior(listaEntrada);

        double mediamenor = (maiorDaLista + menorDaLista) / 2;

        return mediamenor;

    }


}
