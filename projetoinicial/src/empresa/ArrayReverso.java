package empresa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayReverso {

	public static void main(String[] args) {
		// ARRAY DE NÚMEROS ----------------------------------------------
		int dados[] = {10, 20, 30, 40, 50};
		
		System.out.println("Array de números: ");
		 
		// Solução 1 para exibir todos os dados: 
		//System.out.println(dados[0]);
		//System.out.println(dados[1]);
		//System.out.println(dados[2]);
		 
		 
		// Solução 2: while com índice
		//int i = 0;
		// while (i < dados.length) {
		//	 System.out.println(dados[i]);
		//	 i++;
		//}
		 
		// Solução 3: laço de repetição for
		for (int i = 0; i < dados.length; i++) {
			System.out.println(dados[i]);
		}
		
		// Solução 4: for-each
		// for (int dado : dados) {
		//     System.out.println(dado);
		// }
		
		// É possível substituir dados[] por ArrayList:
		// ArrayLis<classe> nomeDoArray = new ArrayList<classe>();
		// ArrayList<Integer> novosDados = new ArrayList<Integer>();
		
		// Convertendo array primitivo para ArrayList
        ArrayList<Integer> dadosLista = new ArrayList<Integer>();
        for (int numero : dados) {
            dadosLista.add(numero);
        }
        
        System.out.println("Ordem normal: " + dadosLista);
        
        // Invertendo com Collections
        Collections.reverse(dadosLista);
        System.out.println("Ordem reversa: " + dadosLista);
        
        // ARRAY DE STRINGS ----------------------------------------------
		
        System.out.println("Array de strings: ");
        
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<String> listaNomes = new ArrayList<String>();
		System.out.println("Digite a quantidade de nomes: ");
		int qtd = teclado.nextInt();
		String nome;
		
		for (int i = 0; i < qtd; i++) {
			nome = teclado.next();
			listaNomes.add(nome);
		}
		
		// loop reverso
		//for (int i = listaNomes.size()-1; i >= 0; i--) {
		//	System.out.println(listaNomes.get(i));
		//}
		
		//É possível fazer esse mesmo processo de loop reverso com a classe nativa Collections
		//Collections.reverse(listaNomes);
		
		System.out.println("Ordem normal: ");
		System.out.println(listaNomes);
		
		Collections.reverse(listaNomes);
		
		System.out.println("Ordem reversa: ");
		System.out.println(listaNomes);
	}

}

/*
	Variáveis primitivas (iniciam com letras minúsculas):
	int
	float
	double
	char
	
	Classes (iniciam com letras maiúsculas:
	String
	Integer
 */
