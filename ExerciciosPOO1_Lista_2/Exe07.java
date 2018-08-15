package ExerciciosPOO1_Lista_2;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int a, b;

		System.out.println("Digite o Numero A:");
		a = entrada.nextInt();
		System.out.println("Digite o Numero B:");
		b = entrada.nextInt();

		System.out.println("Os numeros Pares entre " + a + " e " + b + " São:");

		for (int j = a; j <= b; j++) {
			if ((j % 2) == 0)
				System.out.println(j);
		}

		entrada.close();

	}

}
