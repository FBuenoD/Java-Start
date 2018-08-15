import java.util.Scanner;

public class Exer04_21
{
	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);
		int conta = 0, num, maior;

		System.out.println("Digite um inteiro: ");
		num = input.nextInt();
		maior = num;
		conta++;


		while (conta <= 9){
			System.out.println("Digite um inteiro: ");
			num = input.nextInt();
			if (num > largest)
				maior = num;
			conta++;

		}
		System.out.println("Maior número: " + maior);
	}
}
