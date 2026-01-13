//java program to demonstrate nested loops
import java.util.*;
public class NestedFor
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)//rows
		{
			for(int j=1;j<=i;j++)//processing of each rows
			{
				System.out.print(""+j);
			}
			System.out.println();//each row
		}
	}
}
/*
D:\Openelective2>javac NestedFor.java

D:\Openelective2>java -cp . NestedFor
Enter the number of rows
10
1
12
123
1234
12345
123456
1234567
12345678
123456789
12345678910
*/