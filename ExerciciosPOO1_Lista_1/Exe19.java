package ExerciciosPOO1_Lista_1;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		float nota;
		int faltas;

		System.out.println("Digite sua nota");
		nota = entrada.nextFloat();

		System.out.println("Digite sua nota");
		faltas = entrada.nextInt();

		if (nota >= 9 & nota <= 10 & faltas <= 20) {
			System.out.println("Conceito A");
			System.out.println(nota);
		} else if (nota >= 9 & nota <= 10 & faltas > 20) {
			System.out.println("Conceito B");
			System.out.println(nota);
		} else if (nota >= 7.5 & nota <= 8.9 & faltas <= 20) {
			System.out.println("Conceito B");
			System.out.println(nota);
		} else if (nota >= 7.5 & nota <= 8.9 & faltas > 20) {
			System.out.println("Conceito C");
			System.out.println(nota);

		} else if (nota >= 5 & nota <= 7.4 & faltas <= 20) {
			System.out.println("Conceito C");
			System.out.println(nota);
		} else if (nota >= 5 & nota <= 7.4 & faltas > 20) {
			System.out.println("Conceito D");
			System.out.println(nota);
		} else if (nota >= 4 & nota <= 4.9 & faltas <= 20) {
			System.out.println("Conceito D");
			System.out.println(nota);
		} else if (nota >= 4 & nota <= 4.9 & faltas > 20) {
			System.out.println("Conceito E");
			System.out.println(nota);
		} else if (nota >= 0 & nota <= 3.9 & faltas <= 20) {
			System.out.println("Conceito E");
			System.out.println(nota);
		} else if (nota >= 0 & nota <= 3.9 & faltas > 20) {
			System.out.println("Conceito E");
			System.out.println(nota);
		} else {
			System.out.println("Ocorreu um erro");
		}

		entrada.close();

	}

}
