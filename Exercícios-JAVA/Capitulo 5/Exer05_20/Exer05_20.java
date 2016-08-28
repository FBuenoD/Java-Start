/*
 * Calcule o valor de π das series infinitas
 *      π 4 4/3 4/5 4/7 4/9 4/11 ...
 * Imprima uma tabela que mostre o valor aproximado de π computando um termo
 * dessa série, por dois termos, por três termos e assim por diante. Quantos
 * termos dessa série você tem de utilizar antes de primeiro obter 3,14?
 * 3,141? 3,1415? 3,14159?
 */

package ch05.Exer05_20_REVER;

public class Exer05_20
{
	public static void main ( String args[] )
	{
		float pi=0.0;
                int termos = (args.length ==0) ? 10 :                       Integer.parseInt(args[0]);
                for(int i=0;i<termos;i++)
                        pi += ((i%2==1)? -1.0 : 1.0)/(2.0*i+1.0);
                System.out.println("O Valor de Pi com " + termos  + " termos eh : " + (4.0*pi));
		}
	}
}
