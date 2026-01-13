//java program to demonstrate for-each
import java.util.*;
public class ForEach
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50};
		for(int i: a)
		{
			System.out.println(i);
		}
	}
}
/*
:\Openelective2>javac ForEach.java

D:\Openelective2>java -cp . ForEach
10
20
30
40
50	*/