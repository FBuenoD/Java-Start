package ExerciciosPOO1_Lista_1;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		float raio, area;

		System.out.println("Digite o Raio do circulo:");
		raio = entrada.nextFloat();

		if (raio < 0) {
			System.out.println("Raio Invalido!");
		} else {
			area = (float) (3.14 * (raio * raio));
			System.out.println("Area do Circulo =" + area);
		}

		entrada.close();

	}

}
