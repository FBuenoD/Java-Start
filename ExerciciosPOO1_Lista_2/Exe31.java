package ExerciciosPOO1_Lista_2;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int num;

		System.out.println("Digite um numero para ver sua tabuada:");
		num = entrada.nextInt();
		for (int j = 1; j <= 10; j++) {
			System.out.println(num + "X" + j + "=" + num * j);
		}
		System.out.println("");

		entrada.close();
	}

}
