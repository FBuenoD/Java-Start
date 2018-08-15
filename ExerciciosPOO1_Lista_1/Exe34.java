package ExerciciosPOO1_Lista_1;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		float preco;

		System.out.println("Digite o Preço: ");
		preco = entrada.nextFloat();

		if (preco <= 50) {
			preco = (float) (preco + (preco * 0.05));
			System.out.println("Seu novo preço eh R$" + preco);
			tipoDePreco(preco);

		} else if (preco <= 100) {
			preco = (float) (preco + (preco * 0.1));
			System.out.println("Seu novo preço eh R$" + preco);
			tipoDePreco(preco);

		} else {
			preco = (float) (preco + (preco * 0.15));
			System.out.println("Seu novo preço eh R$" + preco);
			tipoDePreco(preco);
		}

		entrada.close();

	}

	public static void tipoDePreco(float preco) {
		if (preco <= 80) {
			System.out.println("Barato");
		} else if (preco <= 120) {
			System.out.println("Normal");
		} else if (preco <= 200) {
			System.out.println("Caro");
		} else {
			System.out.println("Muito Caro");
		}
	}

}
