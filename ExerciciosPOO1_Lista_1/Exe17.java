package ExerciciosPOO1_Lista_1;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		float km, litros, result;

		System.out.println("Digite a kilometragem");
		km = entrada.nextFloat();

		System.out.println("Digite os litros gastos");
		litros = entrada.nextFloat();
		System.out.println();

		result = km / litros;

		if (result < 8) {
			System.out.println(result);
			System.out.println("Venda essa carro");
		} else if (result >= 8 & result <= 14) {
			System.out.println(result);
			System.out.println("Economico");
		} else {
			System.out.println(result);
			System.out.println("Super economico");
		}

		entrada.close();

	}

}
