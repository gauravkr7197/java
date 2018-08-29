package codechef;
import java.util.Scanner;
class Atm {
	public static void main(String[] args)
	{
		int x;
		float b;
		Scanner in=new Scanner(System.in);
		x=in.nextInt();
		b=in.nextFloat();
		if((x+0.50)<b)
		{
			if(x%5==0)
			{
				System.out.format("%.2f",b-(x+0.50));
			}
			else
				System.out.format("%.2f",b);
		}
		else
			System.out.format("%.2f",b);
		in.close();
	}
}
