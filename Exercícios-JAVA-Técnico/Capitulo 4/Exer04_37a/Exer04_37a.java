import java.util.Scanner;

public class Exer04_37a
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int i=-1;
		Fatorial fat = new Fatorial();

		while(i < 0)
		{
			System.out.print("Digite o número para calcular o Fatorial: ");
			i = input.nextInt();
		}
		System.out.printf("i=%d Fatorial=%d\n",i,fat.calcula(i));
	}
}
