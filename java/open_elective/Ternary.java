//java program to implement greatest among three using ternary
import java.util.*;
public class Ternary
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the three numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int result= (a>b&&a>c)?a:(b>c)?b:c;
		System.out.println(""+result+"is greater number");
		
	}
}
/*
D:\Openelective2>javac Ternary.java

D:\Openelective2>java -cp . Ternary
Enter the three numbers
16 1 24
24is greater number*/