package ExerciciosPOO1_Lista_1;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		float real, cotacao, dolar;

		System.out.println("Digite o Valor em Reais:");
		real = entrada.nextFloat();
		System.out.println("Digite o Valor da Cotação:");
		cotacao = entrada.nextFloat();

		dolar = real / cotacao;

		System.out.println("Resultado: U$" + dolar);

		entrada.close();

	}

}
