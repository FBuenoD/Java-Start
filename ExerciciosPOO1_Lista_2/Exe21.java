package ExerciciosPOO1_Lista_2;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int num;
		int div = 0;

		System.out.println("Digite um numero Inteiro:");
		num = entrada.nextInt();

		for (int j = num; j >= 0; j--) {
			div=0;
			for (int i = 1; i <= j; i++) {
				if (j % i == 0) {
					div++;
				}
			}
			if (div == 2) {
				System.out.printf("%d ", j);
			}
		}
		
		entrada.close();

	}

}
