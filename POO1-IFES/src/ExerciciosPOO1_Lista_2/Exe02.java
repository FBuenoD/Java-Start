package ExerciciosPOO1_Lista_2;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		float[] nota1 = new float[10];
		float[] nota2 = new float[10];

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite a Nota da Primeira Prova do Aluno " + (i + 1));
			nota1[i] = entrada.nextFloat();
			System.out.println("Digite a Nota da Segunda Prova do Aluno " + (i + 1));
			nota2[i] = entrada.nextFloat();
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("Media do Aluno "+(i+1));
			System.out.println("Media = "+((nota1[i]+nota2[i])/2));
		}

		entrada.close();

	}

}
