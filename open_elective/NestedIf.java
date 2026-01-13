//java program to implement greatest among three numbers using nested if
import java.util.*;
public class NestedIf
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the three numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(c>a)
		{
			if(c>b)
			{
				System.out.println("C is greater number");
			}
			else
			{
				System.out.println("B is greater number");
			}
		}
		else
		{
			if(b>a)
			{
				System.out.println("B is greater number");
			}
			else
			{
				System.out.println("A is greater number");
			}
		}
	}
}
/*
D:\Openelective2>javac NestedIf.java

D:\Openelective2>java -cp . NestedIf
Enter the three numbers
7 12 3
B is greater number*/