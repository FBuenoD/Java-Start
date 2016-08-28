import java.util.Scanner;

public class Exer04_36
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Cripto c = new Cripto();
		Decripto d = new Decripto();
		int i=-1;

		while((i > 9999)||(i < 0))
		{
			i = input.nextInt();
			i = c.criptografa(i);
			System.out.println(i);
			i = d.descriptografa(i);
			System.out.println(i);
		}
	}
}
