package ExerciciosPOO1_Lista_1;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		// Parte da Venda

		float valorIni;

		System.out.println("Digite o valor Final da Compra:");
		valorIni = entrada.nextFloat();

		System.out.println("Valor com 10% de Desconto: R$ " + (valorIni - valorIni * 0.1));
		System.out.println("Valor de cada Parcela divido em 3x: R$ " + (valorIni / 3));
		System.out.println("Valor comisao caso seja Avista: R$ " + (0.05 * (valorIni - valorIni * 0.1)));
		System.out.println("Valor comisao caso seja Parcelada: R$ " + (0.05 * valorIni));

		// Parte das Trocas

		System.out.println("Trocando Variaveis: ");
		int a, b, c;

		System.out.println("Digite o valor de A:");
		a = entrada.nextInt();
		System.out.println("Digite o valor de B:");
		b = entrada.nextInt();

		c = b;
		b = a;
		a = c;

		System.out.println("A agora vale: " + a + " E B agora vale: " + b);

		// Parte das Apostas

		System.out.println("Apostas");

		float quant_p1, quant_p2, quant_p3, valor_premio, prop_p1, prop_p2, prop_p3;

		System.out.println("Digite a quantia do apostador 1: ");
		quant_p1 = entrada.nextFloat();

		System.out.println("Digite a quantia do apostador 2: ");
		quant_p2 = entrada.nextFloat();

		System.out.println("Digite a quantia do apostador 3: ");
		quant_p3 = entrada.nextFloat();

		System.out.println("Digite o Valor do Premio: ");
		valor_premio = entrada.nextFloat();

		prop_p1 = quant_p1 / (quant_p1 + quant_p2 + quant_p3);
		prop_p2 = quant_p2 / (quant_p1 + quant_p2 + quant_p3);
		prop_p3 = quant_p3 / (quant_p1 + quant_p2 + quant_p3);

		System.out.printf("\nO apostador 1 ganhou: %.2f - O apostador 2 ganhou: %.2f - apostador 3 ganhou: %.2f",
				valor_premio * prop_p1, valor_premio * prop_p2, valor_premio * prop_p3);

		entrada.close();

	}

}
