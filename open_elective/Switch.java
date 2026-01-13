//java program to demonstrate switch
import java.util.*;
public class Switch
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a and b values");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("Enter the menu");
		System.out.println("add. addition");
		System.out.println("sub. Substraction");
		System.out.println("mul. Multiplication");
		System.out.println("div. Division");
		System.out.println("enter the choice");
		String choice=s.next();
		switch(choice)
		{
			case "add":
				System.out.println("The addition is"+(a+b));
				break;
			case "sub":
				System.out.println("The sub is"+(a-b));
				break;
			case "mul":
				System.out.println("The mul is"+(a*b));
				break;
			case "div":
				System.out.println("The div is"+(a/b));
				break;
			default:
				System.out.println("Enter the valid choice");
		}
	}
}
/*D:\Openelective2>java -cp . Switch
Enter a and b values
12 6
Enter the menu
add. addition
sub. Substraction
mul. Multiplication
div. Division
enter the choice
div
The div is2
*/