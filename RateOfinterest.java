/*2)Write a program to accept age and gender from the user and check the ROI according to condition

above 60
M: 7%
F: 7.5%

below 60
M,F: 5%
*/

package assignmentproblems;

import java.util.*;

public class RateOfinterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age;
		String gender;
		System.out.println("Enter the age: ");
		age=sc.nextInt();
		System.out.println("Enter the Gender(Male/Female): ");
		gender=sc.next();
		if(age>=60)
		{
			switch(gender)
			{
				case "Male":
					System.out.println("Age= "+age+"\nGender= "+gender+"\nRate of interest: 7%");
					break;
				case "Female":
				   System.out.println("Age= "+age+"\nGender= "+gender+"\nRate of interest rate is 7.5%");

			}
	    }
		else
		{
			System.out.println("Rate of interest: 5%");

		}
		sc.close();
	}
}
