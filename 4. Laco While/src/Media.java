import java.util.Scanner;

public class Media {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System. in);

        int contador = 1;
        double nota1, nota2, media;

        while (contador <= 5) {

            do{

                System.out.println("Aluno " + contador + " Insira a primeira nota:");
                nota1 = input.nextDouble();
    
            } while (nota1 < 0 && nota1 > 10 );

            do{

                System.out.println("Aluno " + contador + " Insira a segunda nota:");
                nota2 = input.nextDouble();
    
            } while (nota2 < 0 && nota2 > 10 );

            media = (nota1 + nota2) / 2;

            System.out.println("A média do aluno " + contador + " é de: " + media);

            contador++;
            
        }

        input.close();

    }

}