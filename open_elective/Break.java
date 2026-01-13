//java program to demonstrate break statement
import java.util.*;
public class Break
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
D:\Openelective2>javac Break.java

D:\Openelective2>java -cp . Break
1
2
3
4
*/