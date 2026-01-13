//Java program to print factorialof given number using for loop'
import java.util.*;
public class For
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=s.nextInt();
		int fact=1;
		for(int i=n;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("the factorial of given number is"+fact);
	}
}
/*
D:\Openelective2>javac For.java

D:\Openelective2>java -cp . For
Enter the value of n
5
the factorial of given number is120
*/