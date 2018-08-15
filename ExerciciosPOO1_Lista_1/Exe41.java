package ExerciciosPOO1_Lista_1;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double preco, percentAumento = 0, precoFinal;
		int categoria;
		String situacao = new String();
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o Preco do Alimento:");
		preco = entrada.nextDouble();

		System.out.println("Informe a Categoria do Alimento: [1] Limpeza [2] Alimentação" + "[3] Vestuário");
		categoria = entrada.nextInt();

		System.out.println("Informe a Situação: [R] Refrigerado [N] Não Refrigerado");
		situacao = entrada.next();

		if (preco < 25 && categoria == 1) {
			percentAumento = preco + (preco * 0.05);
		} else if (preco < 25 && categoria == 2) {
			percentAumento = preco + (preco * 0.08);
		} else if (preco < 25 && categoria == 3) {
			percentAumento = preco + (preco * 0.10);
		}

		if (preco > 25 && categoria == 1) {
			percentAumento = preco + (preco * 0.12);
		} else if (preco > 25 && categoria == 2) {
			percentAumento = preco + (preco * 0.15);
		} else if (preco > 25 && categoria == 3) {
			percentAumento = preco + (preco * 0.18);
		}

		if (categoria == 2 && (situacao.equals("R"))) {
			precoFinal = percentAumento - (percentAumento * 0.05);
		} else {
			precoFinal = percentAumento - (percentAumento * 0.08);
		}

		if (precoFinal <= 50) {
			System.out.printf("Preco Final: %.2f\n", precoFinal);
			System.out.println("Barato");

		} else if (precoFinal > 50 && precoFinal < 120) {
			System.out.printf("Preco Final: %.2f\n", precoFinal);
			System.out.println("Normal");

		} else {
			System.out.printf("Preco Final: %.2f\n", precoFinal);
			System.out.println("Caro");
		}

		entrada.close();

	}

}
