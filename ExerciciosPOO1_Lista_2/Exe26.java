package ExerciciosPOO1_Lista_2;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String nome;
		float valorCompra;

		for (int i = 0; i < 15; i++) {
			System.out.println("Digite o nome do Cliente:");
			nome = entrada.nextLine();
			System.out.println("Digite o valor de compras do ano Passado!:");
			valorCompra = entrada.nextFloat();

			entrada.nextLine();

			if (valorCompra <= 1000) {
				System.out.println("O Cliente " + nome + " tem direito a um bonus de R$" + (valorCompra * 0.10));
			} else {
				System.out.println("O Cliente " + nome + " tem direito a um bonus de R$" + (valorCompra * 0.15));
			}

			entrada.nextLine();

		}

		entrada.close();

	}

}
