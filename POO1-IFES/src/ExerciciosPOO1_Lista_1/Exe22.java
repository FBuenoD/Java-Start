package ExerciciosPOO1_Lista_1;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r1, r2;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Entre com o valor de A: ");
		int a = entrada.nextInt();

		System.out.print("Entre com o valor de B: ");
		int b = entrada.nextInt();

		System.out.print("Entre com o valor de C: ");
		int c = entrada.nextInt();

		if (a != 0) {
			int delta = b * b * 4 * a * c;
			if (delta >= 0) {
				r1 = (double) ((-b + (Math.sqrt(delta))) / (2 * a));
				r2 = (double) ((-b - (Math.sqrt(delta))) / (2 * a));

				System.out.println("Primeira Raiz: " + r1);
				System.out.println("Segunda Raiz: " + r2);
			} else {
				System.out.println("Não existe raiz no campo dos reais.");
			}

		} else {
			System.out.println("Não é uma equação de 2 grau, pois A é = 0");
		}

		entrada.close();
	}

}
