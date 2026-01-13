// Average of three numbers Java Program
import java.util.*;
public class Average
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		float num1,num2,num3;
		System.out.println("Enter three float numbers");
		num1=s.nextFloat();
		num2=s.nextFloat();
		num3=s.nextFloat();
		float avg;
		avg=(num1+num2+num3)/3.0f;
		System.out.println("The avg is"+avg);
	}
}	
	