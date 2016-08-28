public class Exer05_24
{
	public static void main(String[] args)
	{
		int aux = 1;
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 5; j > i; j--)
				System.out.print(" ");
			for (int k = 1 ; k <= aux; k++)
				System.out.print("*");
			aux += 2;
			System.out.println();
		}
		aux -= 2;
		for (int i = 1; i <= 4; i++)
		{
			for (int j = 1; j <= i; j++)
				System.out.print(" ");
			aux -= 2;
			for (int k = 1 ; k <= aux; k++)
				System.out.print("*");
			System.out.println();
		}
	}
}
