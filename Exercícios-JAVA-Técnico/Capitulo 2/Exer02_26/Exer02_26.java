// Fernando Bueno Dansi
// 28/08/2016

import java.util.Scanner;

public class Exer02_26
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n1, n2;

		System.out.print("Digite o primeiro inteiro:");
		n1 = input.nextInt();
		System.out.print("Digite o segundo inteiro:");
		n2 = input.nextInt();

		if (n1%n2==0)
			System.out.println("n1 é múltiplo de n2");
		else
			System.out.println("n1 não é múltiplo de n2");
	}
}
