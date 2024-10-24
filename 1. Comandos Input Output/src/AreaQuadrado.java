import java.util.Scanner;

public class AreaQuadrado {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System. in);
        
        System.out.println("Insira o valor do lado do quadrado:");
        double ladoQuadrado = input.nextDouble();

        double areaQuadrado = (ladoQuadrado * ladoQuadrado);

        System.out.println("A área do quadrado é de: " + areaQuadrado);
        
        input.close();
    }

}