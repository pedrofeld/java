package empresa;

import java.util.Scanner;

public class PalpiteJogo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite seu palpite:");
		
		int palpite = teclado.nextInt();
		
		int valorCorreto = 10000;
		
		while(palpite != valorCorreto) {
			if(palpite > valorCorreto) {
				System.out.println("Um pouco menos...");
			} else {
				System.out.println("Um pouco mais...");
			}
			System.out.println("Digite outro palpite:");
			palpite = teclado.nextInt();
		}
		
		System.out.println("Parabéns, você acertou!");
	}

}
