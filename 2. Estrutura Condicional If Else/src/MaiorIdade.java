import java.util.Scanner;

public class MaiorIdade{

	public static void main(String[] args){
		
		Scanner input = new Scanner(System. in);
		
		System.out.println("Insira sua idade:");
		int idade = input.nextInt();
		
		if (idade >= 18) {
			System.out.println("Você é maior de idade.");
		} else {
			System.out.println("Você é menor de idade.");
		}
		
		input.close();
	}
}