package ExerciciosPOO1_Lista_1;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int x, y;

		System.out.println("Digite as coordenadas de x:");
		x = entrada.nextInt();

		System.out.println("Digite as coordenadas de y:");
		y = entrada.nextInt();

		if (x >= 1 & y >= 1) {
			System.out.println("Primeiro quadrante");
			System.out.printf("Coordenadas de X: %d\n", x);
			System.out.printf("Coordenadas de X: %d\n", y);

		} else if (x < 0 & y > 1) {
			System.out.println("Segundo quadrante");
			System.out.printf("Coordenadas de X: %d\n", x);
			System.out.printf("Coordenadas de X: %d\n", y);

		} else if (x < 0 & y < 0) {
			System.out.println("terceiro quadrante");
			System.out.printf("Coordenadas de X: %d\n", x);
			System.out.printf("Coordenadas de X: %d\n", y);

		} else {
			System.out.println("Quarto quadrante");
			System.out.printf("Coordenadas de X: %d\n", x);
			System.out.printf("Coordenadas de X: %d\n", y);

		}

		entrada.close();

	}

}
