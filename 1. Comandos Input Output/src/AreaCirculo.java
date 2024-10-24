import java.util.Scanner;

public class AreaCirculo {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System. in);
        
        System.out.println("Insira o raio do circulo:");
        double raioCirculo = input.nextDouble();

        double pi = 3.14159;
        double areaCirculo = (pi * (raioCirculo * raioCirculo));
        
        System.out.println(areaCirculo);
        
        input.close();
    }

}