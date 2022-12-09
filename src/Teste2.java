
import java.util.Scanner;
public class Teste2 {

	public static void main(String[] args) {
		float numerosDigitados;
		String resposta;
		Scanner in = new Scanner (System.in);
		
		for(;;) {
			System.out.println("Você quer digitar um numero? (s) ou (n)");
			resposta = in.nextLine();
			if(resposta.equals("s")) {
				System.out.println("Digite um numero:");
				numerosDigitados = in.nextFloat();
				System.out.print("Numero Digitado: " + numerosDigitados);
				System.out.println();
				System.out.println();
			}else {
				System.out.println("Você parou.......");
				break;
			}
			in.nextLine();
		}
		
		
		
		
		
	}

}
