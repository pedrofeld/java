package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// exibindo texto no console
		System.out.println("Hello, World!"); // println gera quebra de linha
		System.out.print("Esse é um texto."); // apenas print, não
		System.out.println("Esse é outro texto.");
		
		// variáveis
		String nome = "Pedro";
		int idade = 19;
		idade = idade +2;		
		double peso = 72.5; // números com vírgula, mais preciso
		float peso2 = 80; // números inteiros, economiza mais espaço
		
		System.out.println("Idade: " + idade);
		System.out.printf("Idade: %d\n", idade); // o \n indica quebra de linha
		// System.out.println("Peso:" + peso);
		// System.out.println("Peso 2: " + peso2);
		System.out.printf("Peso: %.2f\n", peso); // o 2f significa 2 casas após a vírgula
		
		// criando objeto
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite idade, peso e nome:");
		
		// solicitando input
		idade = teclado.nextInt();
		peso = teclado.nextDouble();
		nome = teclado.next();
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Peso: " + peso);
		
		
		//  condicionais
		if  (idade < 18) {
			System.out.println("Acesso bloqueado");
		} else {
			System.out.println("Acesso liberado");
		}
		
		// laço de repetição
		for (int i=0; i<10; i++) {
			System.out.println("Valor: " + i);
		}
		
		// array
		int megaSena[] = {11, 14, 21, 30, 37, 56}; // declarando os elementos
		int numeros[] = new int [200]; // definindo 200 elementos para o array
		
		megaSena[0] = 10;
		numeros[60] = 50;
	}

}

/*
	Dicas:
	ctrl + seta para baixo copia a linha
	ctrl + espaço abre janela de atalhos para comandos
*/