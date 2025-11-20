package empresa;

import java.util.Scanner;

public class CalculoImc {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o peso e a altura:");
		
		int peso = teclado.nextInt();
		double altura = teclado.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.printf("IMC: %.2f ", imc);
	}

}