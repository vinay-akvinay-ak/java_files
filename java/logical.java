public class logical{
	public static void main(String args[]){
		int a=4;
		int b=2;
		int x=4;
		int y=23;
		//boolean result = (a>=b && x<=y);
		//boolean result = (a>=b || x<=y);
		boolean result = (a!=b && x<=y);
		System.out.println(!result);
	}
}