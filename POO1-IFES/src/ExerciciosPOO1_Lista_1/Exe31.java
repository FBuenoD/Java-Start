package ExerciciosPOO1_Lista_1;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		float saldo;

		System.out.println("Digite seu Saldo Medio: ");
		saldo = entrada.nextFloat();

		if (saldo <= 200) {
			saldo = (float) (saldo + (saldo * 0.10));
			System.out.println("Seu novo saldo eh R$" + saldo);
		} else if (saldo <= 300) {
			saldo = (float) (saldo + (saldo * 0.20));
			System.out.println("Seu novo saldo eh R$" + saldo);
		} else if (saldo <= 400) {
			saldo = (float) (saldo + (saldo * 0.25));
			System.out.println("Seu novo saldo eh R$" + saldo);
		} else {
			saldo = (float) (saldo + (saldo * 0.30));
			System.out.println("Seu novo saldo eh R$" + saldo);
		}

		entrada.close();

	}

}
