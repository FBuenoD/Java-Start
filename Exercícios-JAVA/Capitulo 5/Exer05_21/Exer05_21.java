public class Exer05_21
{
	public static void main(String[] args)
	{
		for (int i = 1; i <= 500; i++)
			for (int j = 1; j <= 500; j++)
				for (int k = 1; k <= 500; k++)
				{
					System.out.printf("i = %s, j = %s, k = %s\n",i,j,k);
					if(Math.pow(i,2)==(Math.pow(j,2)+Math.pow(k,2)))
						System.out.printf("lado1 = %s, lado2 = %s, hipotenusa = %s.\n %s == %s+%s\n",j,k,i,Math.pow(j,2),Math.pow(k,2),Math.pow(i,2));
					if(Math.pow(j,2)==(Math.pow(i,2)+Math.pow(k,2)))
						System.out.printf("lado1 = %s, lado2 = %s, hipotenusa = %s.\n %s == %s+%s\n",i,k,k,Math.pow(i,2),Math.pow(k,2),Math.pow(j,2));
					if(Math.pow(k,2)==(Math.pow(i,2)+Math.pow(j,2)))
						System.out.printf("lado1 = %s, lado2 = %s, hipotenusa = %s.\n",i,j,k);
						System.out.printf("lado1 = %s, lado2 = %s, hipotenusa = %s.\n %s == %s+%s\n",i,j,k,Math.pow(i,2),Math.pow(j,2),Math.pow(k,2));
				}
	}
}
