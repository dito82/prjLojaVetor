package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Produto;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantidade de produto: ");
		int n = sc.nextInt();
		Produto[] vetor = new Produto[n];

		for (int i = 0; i < vetor.length; i++) {
			sc.nextLine();
			System.out.print("Produto: ");
			String nome = sc.nextLine();

			System.out.print("Valor: ");
			double preco = sc.nextDouble();
			vetor[i] = new Produto(nome, preco);
		}

		double soma = 0.0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i].getPreco();
		}

		double media = soma / vetor.length;
		System.out.printf("Média de preço: %.2f%n", media);

		sc.close();

	}

}
