//Reading of two numbers and perform Addition
import java.util.*;
public class Read
{
	public static void main(String args[])
	{
		int a,b;
		System.out.println("Enter two values");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("The result of sum is"+(a+b));
	}
}