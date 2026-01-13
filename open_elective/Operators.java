//java program to demonstrate operators
import java.util.*;
public class Operators
{
	public static void main(String args[])
	{
		int a=10,b=20;
		Scanner s=new Scanner(System.in);
		System.out.println("The modulus of a and b is"+(a%b));//10
		System.out.println(" greater than equal to"+(a>=b));//false
		System.out.println("logical and is"+(a > b && a++ < b++));//false
		System.out.println("The value of a and b is"+a+"\t"+b);//11 21
		System.out.println("The value of complement a is"+~a);//-10
		a += 2;
		System.out.println("Is s is an instance of Scanner"+(s instanceof Scanner));//true
		System.out.println("The value of a and b is"+a+"\t"+b);//13 21
	}
}