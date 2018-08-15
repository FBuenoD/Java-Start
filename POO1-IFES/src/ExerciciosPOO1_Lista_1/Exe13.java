package ExerciciosPOO1_Lista_1;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		float n1, n2, n3;

		System.out.println("Digite um numero");
		n1 = entrada.nextFloat();

		System.out.println("Digite um numero");
		n2 = entrada.nextFloat();

		System.out.println("Digite um numero");
		n3 = entrada.nextFloat();

		if (n1 > n2 & n1 > n3) {
			System.out.println(n1);
		} else if (n1 < n2 & n2 > n3) {
			System.out.println(n2);
		} else {
			System.out.println(n3);
		}

		entrada.close();

	}

}
