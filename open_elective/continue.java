//java program to demonstrate Continue statement
import java.util.*;
public class Continue
{
	public static void main(String args[])
	{
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
		}
	}
}/*
D:\Openelective2>javac Continue.java

D:\Openelective2>java -cp . Continue
1
2
3
4
6
7
8
9
10
*/