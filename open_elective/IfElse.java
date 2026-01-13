//java program to demonstrate smaller than two numbers using if-else statement
import java.util.*;
public class IfElse
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=s.nextInt();
		int num2=s.nextInt();
		if( num1< num2)
		{
			System.out.println(""+num1+" is small number");
		}
		else
		{
			System.out.println(""+num2+" is small number");
		}
	}
}
/*
D:\Openelective2>javac IfElse.java

D:\Openelective2>java -cp . IfElse
Enter two numbers
66
24
24 is small number
*/