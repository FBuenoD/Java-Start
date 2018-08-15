import java.util.Scanner;

public class Exer04_30
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Integer tamanho = 0;
		String s = "";

		while (tamanho != 5)
		{
			System.out.print("Digite o número: ");
			s = input.next();

			tamanho=s.length();

			if (tamanho != 5)
				System.out.println("Erro: Não tem 5 dígitos.");
			else
				if ((new SubPalavra().Sub(s))==false)
					tamanho=0;
		}

		if ((s.charAt(0) == s.charAt(4)) && (s.charAt(1) == s.charAt(3)))
			System.out.println("Palíndromo");
		else System.out.println("Não é palíndromo");
	}
}
