// Fernando Bueno Dansi
// 28/08/2016

import java.util.Scanner;

public class Exer02_30
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n;

		System.out.print("Digite um número com 5 dígitos:");
		n = input.nextInt();

		System.out.print((n/10000)%10+"   ");
		System.out.print((n/1000)%10+"   ");
		System.out.print((n/100)%10+"   ");
		System.out.print((n/10)%10+"   ");
		System.out.print(n%10+"   ");
	}
}
