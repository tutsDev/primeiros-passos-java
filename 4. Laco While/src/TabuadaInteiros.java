import java.util.Scanner;

public class TabuadaInteiros {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System. in);
        
        int contador = 1;
        
        System.out.println("Insira o número da tabuada:");
        int tabuada = input.nextInt();
        int resultado = 0;

        while (contador <= 10) {
  
            resultado = contador * tabuada;
            System.out.println(tabuada + " x " + contador + " = " + resultado);
            contador++;

        }

        input.close();
    }

}