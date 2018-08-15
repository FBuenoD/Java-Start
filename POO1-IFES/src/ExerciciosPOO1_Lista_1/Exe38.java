package ExerciciosPOO1_Lista_1;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int cod;

		System.out.println("Digite o codigo do Produto!");
		cod = entrada.nextInt();

		if (cod == 1) {
			System.out.println("Sul");
		} else if (cod == 2) {
			System.out.println("Norte");
		} else if (cod == 3) {
			System.out.println("Leste");
		} else if (cod == 4) {
			System.out.println("Oeste");
		} else if (cod == 5 || cod == 6) {
			System.out.println("Nordeste");
		} else if (cod == 7 || cod == 8 || cod == 9) {
			System.out.println("Sudeste");
		} else if (cod <= 20) {
			System.out.println("Centro-Oeste");
		} else if (cod <= 30) {
			System.out.println("Noroeste");
		} else {
			System.out.println("Codigo Invalido Não consta na Tabela!!!");
		}

		entrada.close();

	}

}
