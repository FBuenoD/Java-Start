package ExerciciosPOO1_Lista_1;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		float a, b, c;

		System.out.println("Digite o Numero A: ");
		a = entrada.nextFloat();
		System.out.println("Digite o Numero B: ");
		b = entrada.nextFloat();
		System.out.println("Digite o Numero C: ");
		c = entrada.nextFloat();

		float aux;
		if (a > b) {
			aux = a;
			a = b;
			b = aux;
		}
		if (b > c) {
			aux = b;
			b = c;
			c = aux;
		}
		if (a > b) {
			aux = a;
			a = b;
			b = aux;
		}

		System.out.println("A=" + a + " B=" + b + " C=" + c);

		entrada.close();

	}

}
