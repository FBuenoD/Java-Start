package ExerciciosPOO1_Lista_2;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String[] matricula = new String[10];

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite a Matricula " + (i + 1));
			matricula[i] = entrada.nextLine();
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("Matricula " + (i + 1) + " = " + matricula[i]);
		}

		entrada.close();

	}

}
