//java program to print sum of n natural numbers using while loop
import java.util.*;
public class While
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=s.nextInt();
		int i=1,sum=0;//intialization
		while(i<=n)
		{
			sum=sum+i;
			i++;
		}
		System.out.println("The sum of n natural numbers is"+sum);
	}
}
/*D:\Openelective2>javac While.java

D:\Openelective2>java -cp . While
Enter the value of n
5
The sum of n natural numbers is15

*/