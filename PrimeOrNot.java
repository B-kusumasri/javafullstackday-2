import java.util.*;
class PrimeOrNot
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter a number");
		n=sc.nextInt();
		int c=2;
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(i%2==0)
			c++;
		}
		if(c==2)
		System.out.println("prime number");
		else
		System.out.println("not a prime number");
	}
}