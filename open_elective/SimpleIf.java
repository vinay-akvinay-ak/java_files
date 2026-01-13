// java program to demonstrate person eligible for voting using simple if
import java.util.*;
public class SimpleIf
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age of the person");
		int age= s.nextInt();
		if(age>17)
		{
			System.out.println("The person is eligible for vote");
		}
	}
}
/*
D:\Openelective2>javac SimpleIf.java

D:\Openelective2>java -cp . SimpleIf
Enter the age of the person
10

D:\Openelective2>java -cp . SimpleIf
Enter the age of the person
20
The person is eligible for vote
*/