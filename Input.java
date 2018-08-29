package codechef;
import java.util.Scanner;
public class Input {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		long count=0;
	long  n=in.nextInt();
	long k=in.nextInt();
	long a[]=new long[(int)n];
	for(int i=0;i<n;i++)
	{
		a[i]=in.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		if(a[i]%k==0)
		count++;
	}
	System.out.print(count);
	in.close();
	}

}
