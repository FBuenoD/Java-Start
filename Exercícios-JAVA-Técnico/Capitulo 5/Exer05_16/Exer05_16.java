import java.util.Scanner;

public class Exer05_16
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n1,n2,n3,n4,n5;

		System.out.print("Digite o 1o número: ");
		n1 = input.nextInt();

		System.out.print("Digite o 2o número: ");
		n2 = input.nextInt();

		System.out.print("Digite o 3o número: ");
		n3 = input.nextInt();

		System.out.print("Digite o 4o número: ");
		n4 = input.nextInt();

		System.out.print("Digite o 5o número: ");
		n5 = input.nextInt();

		for (int i = 1; i <= n1; i++)
		{
				System.out.print("*");
		}
		System.out.println();
		for (int i = 1; i <= n2; i++)
		{
			System.out.print("*");
		}
		System.out.println();
		for (int i = 1; i <= n3; i++)
		{
			System.out.print("*");
		}
		System.out.println();
		for (int i = 1; i <= n4; i++)
		{
			System.out.print("*");
		}
		System.out.println();
		for (int i = 1; i <= n5; i++)
		{
			System.out.print("*");
		}
	}
}
