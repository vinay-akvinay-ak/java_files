//java program to implement greatest among three using Else-if Ladder
import java.util.*;
public class ElseIf
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the three numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(b>a&&b>c)
		{
			System.out.println("B is greater number");
		}
		else if(c>a)
		{
			System.out.println("C is greater number");
		}
		else
		{
			System.out.println("A is greater number");
		}
	}
}
/*
D:\Openelective2>javac ElseIf.java

D:\Openelective2>java -cp . ElseIf
Enter the three numbers
4 3 8
C is greater number*/