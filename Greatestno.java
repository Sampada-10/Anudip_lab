package assignmentproblems;
import java.util.*;
public class Greatestno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int cal,n;
		System.out.println("how many no you want: ");
		n=sc.nextInt();
		int [] array=new int[n];
		System.out.println("Enter "+n+" numbers: ");
		//Accepting the array numbers
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		//Display array numbers
		System.out.println("The numbers are: ");
		for(int i=0;i<n;i++)
		{
		   System.out.println(array[i]);
		}
		cal=array[0];
		for(int i=0;i<n;i++)
		{
			if(array[i]>cal)
			{
				System.out.println("The Greatest number is: "+array[i]);
			}
		
		}
		sc.close();
	}
	

}
