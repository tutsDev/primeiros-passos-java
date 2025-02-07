import java.util.Random;

public class SintaxeNumerosAleatorios {
    public static void main(String[] args){

        Random numAleatorio = new Random();

        //RANDOM INT

        //Sem intervalo
        int sorteandoSemIntervaloInt = numAleatorio.nextInt();    
        System.out.println(sorteandoSemIntervaloInt);
        
        //Intervalo de 0 a 9
        //O 10 entre parenteses, indica que serão gerados 10 numeros possíveis iniciando do 0
        int sorteandoComIntervaloInt1 = numAleatorio.nextInt(10);
        System.out.println(sorteandoComIntervaloInt1);

        //Intervalo de 2 a 10
        int sorteandoComIntervaloInt2 = 2 + numAleatorio.nextInt(8 + 1);
        System.out.println(sorteandoComIntervaloInt2);

        //Intervalo de 10 a 100
        int sorteandoComIntervaloInt3 = 10 + numAleatorio.nextInt(90 + 1);
        System.out.println(sorteandoComIntervaloInt3);

        //RANDOM DOUBLE

        //Sem intervalo
        double sorteandoSemIntervaloDouble = numAleatorio.nextDouble();
        System.out.println(sorteandoSemIntervaloDouble);

        //Intervalo de 10 a 100
        //O * 90 após o parenteses, indica que serão gerados 90 números possíveis iniciando em 10
        double sorteandoComIntervaloDouble1 = 10 + numAleatorio.nextDouble() * 90;
        System.out.println(sorteandoComIntervaloDouble1);

    }
}
