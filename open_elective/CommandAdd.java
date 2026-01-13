import java.util.*;
public class CommandAdd
{
	public static void main(String args[])
	{
		int a= Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		
		System.out.println("the addition is"+(a+b));
	}
}
/*D:\Openelective2>javac CommandAdd.java

D:\Openelective2>java -cp . CommandAdd 10 20
the addition is30
*/