package ExerciciosPOO1_Lista_1;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int codigo, quantidade;
		double preco = 0, precoTotal = 0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o Codigo do Produto: ");
		codigo = entrada.nextInt();

		System.out.println("Informe a Quantidade do Produto: ");
		quantidade = entrada.nextInt();

		if (codigo >= 1 && codigo <= 10) {
			preco = 10;

		} else if (codigo >= 11 && codigo <= 20) {
			preco = 15;

		} else if (codigo >= 21 && codigo <= 30) {
			preco = 20;

		} else if (codigo >= 31 && codigo <= 40) {
			preco = 30;

		} else {
			System.out.println("Codigo Invalido!");
		}

		precoTotal = preco * quantidade;

		System.out.println("Preco Unitario: R$" + preco);
		System.out.println("Preco Total na Nota: R$" + precoTotal);

		if (precoTotal <= 250) {
			System.out.println("Valor do Desconto é: R$" + (precoTotal * 0.05));
			System.out.println("Preco Total da Nota Após o Desconto é: R$" + (precoTotal - (precoTotal * 0.05)));
		} else if (precoTotal > 250 && precoTotal <= 500) {
			System.out.println("Valor do Desconto é: R$" + (precoTotal * 0.1));
			System.out.println("Preco Total da Nota Após o Desconto é: R$" + (precoTotal - (precoTotal * 0.1)));
		} else {
			System.out.println("Valor do Desconto é: R$" + (precoTotal * 0.15));
			System.out.println("Preco Total da Nota Após o Desconto é: R$" + (precoTotal - (precoTotal * 0.15)));
		}

		entrada.close();

	}

}
