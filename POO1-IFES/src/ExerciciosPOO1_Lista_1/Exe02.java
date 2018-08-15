package ExerciciosPOO1_Lista_1;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		String nome, idade, altura;

		System.out.println("Digite Seu Nome: ");
		nome = entrada.nextLine();
		System.out.println("Digite Sua Idade: ");
		idade = entrada.nextLine();
		System.out.println("Digite Sua Altura: ");
		altura = entrada.nextLine();

		System.out.println("Seu Nome Eh: " + nome);
		System.out.println("Sua Idade Eh: " + idade);
		System.out.println("Sua Altura Eh: " + altura);

		entrada.close();
	}

}
