class student
{//instant variables
	int rollno;
	String name;
	int marks;
}
public class array{
	public static void main(String args[]){
		
		student s1=new student();
		s1.rollno=88;
		s1.name="vinayak";
		s1.marks=77;
		
		student s2=new student();
		s2.rollno=2;
		s2.name="simba";
		s2.marks=88;
		
		student s3=new student();
		s3.rollno=3;
		s3.name="sai";
		s3.marks=99;
				
		student students[]=new student[3];
		students[0]=s1;
		students[1]=s2;
		students[2]=s3;
		
		for (int i=0;i<students.length;i++){
			System.out.println(students[i].name + ":" students[i].rollno + ":" students[i].marks);
		}
		
	}
}









/*public class array{
	public static void main(String args[]){
		/*int arr[]=new  int[4];
		arr[0]s=2;
		arr[1]=3;
		arr[2]=8;
		arr[3]=4;*/
		
		/*int arr1[][] = new int[3][];
		arr1[0]=new int[3];
		arr1[1]=new int[4];
		arr1[2]=new int[5];
		
		for (int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++){
				arr1[i][j]=(int)(Math.random() * 10);
			System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
			
		}
	}
}*/
		
		
		
		
		