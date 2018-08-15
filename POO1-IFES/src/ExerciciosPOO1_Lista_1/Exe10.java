package ExerciciosPOO1_Lista_1;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int n1, n2;
		System.out.println("Digite um numero");
		n1 = entrada.nextInt();

		System.out.println("Digite um numero");
		n2 = entrada.nextInt();

		if ((n1 > 0) & (n2 > 0)) {
			System.out.println("Numero validos!");
		} else {
			System.out.println("Numeros nao validos");
		}

		entrada.close();

	}

}
