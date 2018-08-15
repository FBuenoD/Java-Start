package ExerciciosPOO1_Lista_2;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		float valorJ, valorC;
		int qtd = 0;

		System.out.println("Digite o valor investido por Carlos:");
		valorC = entrada.nextFloat();

		valorJ = valorC / 3;

		while (valorJ < valorC) {

			valorJ = (float) (valorJ + (valorJ * 0.05));
			valorC = (float) (valorC + (valorC * 0.02));
			qtd++;
		}

		System.out.println("Será necessario " + qtd + " Meses!");

		entrada.close();

	}

}
