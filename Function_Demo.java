package assignmentproblems;
import java.util.*;
public class Function_Demo {
	static int n;
	static int array[];
	public static void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many no you want? =>  ");
		n=sc.nextInt();
		array=new int[n];
		System.out.println("Enter "+n+" numbers: ");
		//Accepting the array numbers
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		sc.close();
	}
	public static void display()
	{
		System.out.println("The numbers are: ");
		for(int i=0;i<n;i++)
		{
		   System.out.print(array[i]+"\t");
		}
	}
	public static void asscending_order() {
		int temp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(array[i]>array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println("\n\nAsscending order Array numbers are: ");
		display();
	}
	public static void desscending_order() {
		int temp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(array[i]<array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println("\n\ndesscending order Array numbers are: ");
		display();
	}
	public static void Average()
	{
		int avg,total=0;
		for(int i=0;i<n;i++) {
			total+=array[i];
		}
		avg=total/n;
		System.out.println("\nAverage of all numbers is: "+avg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//Accept
		accept();
		//Display array 
		display();
		//Asscending order
		asscending_order();
		//desscending order
		desscending_order();
		//average
		Average();
		sc.close();	
	}
}
