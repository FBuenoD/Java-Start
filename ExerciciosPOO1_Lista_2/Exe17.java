package ExerciciosPOO1_Lista_2;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int num;

		System.out.println("Digite um Numero:");
		num = entrada.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.print(Exe17.fibo(i) + " ");
		}

		entrada.close();

	}

	static long fibo(int n) {
		if (n < 2) {
			return n;
		} else {
			return fibo(n - 1) + fibo(n - 2);
		}
	}

}
