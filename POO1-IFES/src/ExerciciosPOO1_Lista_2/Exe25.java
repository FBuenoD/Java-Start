package ExerciciosPOO1_Lista_2;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		float a, b, c, d;
		float maior = 0, intermediario1 = 0, intermediario2 = 0, menor = 0;

		System.out.printf("\nInforme 4 numeros: A, B, C e D: \n");
		a = entrada.nextFloat();
		b = entrada.nextFloat();
		c = entrada.nextFloat();
		d = entrada.nextFloat();

		/* Início das condições com A maior */

		if (a > b && b > c && c > d) {
			menor = d;
			intermediario2 = c;
			intermediario1 = b;
			maior = a;
		} else if (a > b && b > d && d > c) {
			menor = c;
			intermediario2 = d;
			intermediario1 = b;
			maior = a;
		} else if (a > c && c > b && b > d) {
			menor = d;
			intermediario2 = b;
			intermediario1 = c;
			maior = a;
		} else if (a > c && c > d && d > b) {
			menor = b;
			intermediario2 = d;
			intermediario1 = c;
			maior = a;
		} else if (a > d && d > b && b > c) {
			menor = c;
			intermediario2 = b;
			intermediario1 = d;
			maior = a;
		} else if (a > d && d > c && c > b) {
			menor = b;
			intermediario2 = c;
			intermediario1 = d;
			maior = a;
		}

		/* Início das condições com B maior */

		if (b > a && a > c && c > d) {
			menor = d;
			intermediario2 = c;
			intermediario1 = a;
			maior = b;
		} else if (b > a && a > d && d > c) {
			menor = c;
			intermediario2 = d;
			intermediario1 = a;
			maior = b;
		} else if (b > c && c > a && a > d) {
			menor = d;
			intermediario2 = a;
			intermediario1 = c;
			maior = b;
		} else if (b > c && c > d && d > a) {
			menor = a;
			intermediario2 = d;
			intermediario1 = c;
			maior = b;
		} else if (b > d && d > a && a > c) {
			menor = c;
			intermediario2 = a;
			intermediario1 = d;
			maior = b;
		} else if (b > d && d > c && c > a) {
			menor = a;
			intermediario2 = c;
			intermediario1 = d;
			maior = b;
		}

		/* Início das condições com C maior */

		if (c > a && a > b && b > d) {
			menor = d;
			intermediario2 = b;
			intermediario1 = a;
			maior = c;
		} else if (c > a && a > d && d > b) {
			menor = b;
			intermediario2 = d;
			intermediario1 = a;
			maior = c;
		} else if (c > b && b > a && a > d) {
			menor = d;
			intermediario2 = a;
			intermediario1 = b;
			maior = c;
		} else if (c > b && b > d && d > a) {
			menor = a;
			intermediario2 = d;
			intermediario1 = b;
			maior = c;
		} else if (c > d && d > a && a > b) {
			menor = c;
			intermediario2 = a;
			intermediario1 = d;
			maior = b;
		} else if (c > d && d > b && b > a) {
			menor = a;
			intermediario2 = b;
			intermediario1 = d;
			maior = c;
		}

		/* Início das condições com D maior */

		else if (d > a && a > b && b > c) {
			menor = c;
			intermediario2 = b;
			intermediario1 = a;
			maior = d;
		} else if (d > a && a > c && c > b) {
			menor = b;
			intermediario2 = c;
			intermediario1 = a;
			maior = d;
		} else if (d > b && b > a && a > c) {
			menor = c;
			intermediario2 = a;
			intermediario1 = b;
			maior = d;
		} else if (d > b && b > c && c > a) {
			menor = a;
			intermediario2 = c;
			intermediario1 = b;
			maior = d;
		} else if (d > c && c > a && a > b) {
			menor = b;
			intermediario2 = a;
			intermediario1 = c;
			maior = d;
		} else if (d > c && c > b && b > a) {
			menor = a;
			intermediario2 = b;
			intermediario1 = c;
			maior = d;
		}

		/* Impressão dos números informados, em ordem de entrada do usuário */

		System.out.printf("\n==== Valores Digitados ====\n");
		System.out.printf("a...............: %.0f\n", a);
		System.out.printf("b...............: %.0f\n", b);
		System.out.printf("c...............: %.0f\n", c);
		System.out.printf("d...............: %.0f\n", d);

		/* Impressão dos números informados, em ordem crescente */

		System.out.printf("=== Lista em Ordem Crescente ===\n");
		System.out.printf("Menor...........: %.0f\n", menor);
		System.out.printf("Intermediario2..: %.0f\n", intermediario2);
		System.out.printf("Intermediario1..: %.0f\n", intermediario1);
		System.out.printf("Maior...........: %.0f\n", maior);

		System.out.printf("=== Lista em Ordem Decresente ===\n");
		System.out.printf("Menor...........: %.0f\n", maior);
		System.out.printf("Intermediario2..: %.0f\n", intermediario1);
		System.out.printf("Intermediario1..: %.0f\n", intermediario2);
		System.out.printf("Maior...........: %.0f\n", menor);

		entrada.close();

	}

}
