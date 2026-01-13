//java program to demonstrate literals
import java.util.*;
public class Literals
{
	public static void main(String args[])
	{
		int a=123,b=012,c=0x1A,d=0b1011;
		float e=23.34f;
		double f=23.4E+3;
		char g='@';
		String h="Gudlavalleru";
		boolean i=false;
		System.out.println("The value of a is "+a);
		System.out.println("Octal"+b+"\nHexa"+c+"\nbinary"+d);
		System.out.println("float"+e+"\nDouble"+f);
		System.out.println("Char"+g+"\n\u0041"+"\n\u0042"+"\132");
		System.out.println("String"+h+"\nBoolean"+i);
	}
}/*
D:\Openelective2>javac Literals.java

D:\Openelective2>java -cp . Literals
The value of a is 123
Octal10
Hexa26
binary11
float23.34
Double23400.0
Char@
A
BZ
StringGudlavalleru
Booleanfalse*/