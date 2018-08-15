package ExerciciosPOO1_Lista_2;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String nome, nomeMaior = "";
		float altura, alturaMaior = 0;
		int i = 0;

		for (i = 0; i < 10; i++) {
			System.out.println("Digite o Nome do " + (i + 1) + "º Aluno");
			nome = entrada.nextLine();
			System.out.println("Digite a Altura do " + (i + 1) + "º Aluno");
			altura = entrada.nextFloat();

			if (altura > alturaMaior) {
				alturaMaior = altura;
				nomeMaior = nome;
			}
			entrada.nextLine();
		}

		System.out.println("O aluno com maior altura eh " + nomeMaior);

		entrada.close();

	}

}
