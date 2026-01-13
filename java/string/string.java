public class string
{
	public static void main(String args[])
	{
		String name=new String(" vinayak ");  
		// String name="vinayak";
		//creation of object
		name=name+"goud ";
		
		System.out.println(name);
		System.out.println(name.hashCode());
		System.out.print(name + " hi ");
		System.out.println(name.charAt(1));     
		System.out.print(name.concat( " hello "));



	}
}