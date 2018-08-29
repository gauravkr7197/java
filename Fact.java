package codechef;
import java.util.Scanner;
public class Fact {
	public static int fact(int n)
	{
		if(n==0||n==1)
		{
			return 1;
		}
		else
			n=n*fact(n-1);
		return n;
	}
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(fact(a[i]));
		}
		in.close();	
	}}
