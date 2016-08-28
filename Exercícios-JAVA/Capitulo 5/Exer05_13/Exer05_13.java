public class Exer05_13
{
	public static void main(String[] args)
	{
		int aux;
		System.out.println("i      i!");
		for (int i = 1; i <= 5; i++)
		{
			aux = i;
			for (int j = 1; j < i; j++)
			{
				aux *= j;
			}
			System.out.printf("%d      %d\n",i,aux);
		}
	}
}
