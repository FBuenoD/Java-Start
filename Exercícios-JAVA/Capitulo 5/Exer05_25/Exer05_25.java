import java.util.Scanner;

public class Exer05_25
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int aux = 1, leitor = 0;

		while((leitor%2 == 0)||(leitor < 1)||(leitor > 19)){
			System.out.print("Tamanho do losango (Ímpar 1 - 19): ");
			leitor = input.nextInt();

			if (leitor%2 == 0)
			{
				System.out.println("ERRO: Digite um número ímpar.");
			}
			else if (leitor < 1)
			{
				System.out.println("ERRO: Digite um número maior ou igual a 1.");
			}
			else if (leitor > 19)
			{
				System.out.println("ERRO: Digite um número menor ou igual a 19.");

			}
		}

		for (int i = 1; i <= (leitor/2)+1; i++)
		{
			for (int j = (leitor/2)+1; j > i; j--)
				System.out.print(" ");
			for (int k = 1 ; k <= aux; k++)
				System.out.print("*");
			aux += 2;
			System.out.println();
		}
		aux -= 2;
		for (int i = 1; i <= (leitor/2); i++)
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
