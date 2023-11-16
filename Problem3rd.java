//3)Write a program to accept choice from the user and perform the operation
//        1.Find out greater between 3 NO
//        2.Check given no is even or odd
//        3.Check the given character is vowel or not
//        4.check the given no is divible by 5 or not

package assignmentproblems;
import java.util.*;
public class Problem3rd {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
            System.out.println("\n\nOperations:\n1.Find out greater between 3 numbers\n" +
                    "2.Check given no is even or odd\n" +
                    "3.Check the given character is vowel or not\n" +
                    "4.check the given no is divisible by 5 or not"+
                    "5.Exit");
             System.out.println("Select any choice from above options: ");
             int ch = sc.nextInt();
             switch(ch)
             {
	             case 1 : 
	            	// Find out greater between 3 numbers
	                 int num1, num2, num3;
	                 System.out.println("Enter first number");
	                 num1 = sc.nextInt();
	                 System.out.println("Enter second number ");
	                 num2 = sc.nextInt();
	                 System.out.println("Enter third number ");
	                 num3 = sc.nextInt();
	                 if (num1 >= num2 && num1 >= num3)
	                     System.out.println(num1 + " is the largest number.");

	                 else if (num2 >= num1 && num2 >= num3)
	                     System.out.println(num2 + " is the largest number.");

	                 else
	                     System.out.println(num3 + " is the largest number.");
	                 break;
	                 
	             case 2 :
	            	   //Check given no is even or odd
	                    System.out.println("Enter number");
	                    num1 = sc.nextInt();
	                    if (num1 % 2 == 0)
	                        System.out.println("Number is even");
	                    else
	                        System.out.println("Number is odd");
	                    break;
	             case 3 :
	            	   //Check the given character is vowel or not
	                   System.out.println("Enter character:  ");
	                   char character = sc.next().charAt(0);
	                   if(character=='a' ||character=='e'||character=='i'||character=='o'||character=='u'||character=='A'||character=='E'||character=='I'||character=='O')
	                   {
	                        System.out.println("Enter letter is Vowel");

                       }
	                   else
	                   {
	                	   System.out.println("Enter letter is  not Vowel");
	                   }
	                   break;
	             case 4 :
	                    System.out.println("Enter number");
	                    int no = sc.nextInt();
	                    if(no>0) {
		                    if (no% 5 == 0)
		                        System.out.println("Number is divisible by 5");
		                    else
		                        System.out.println("Number is NOT divisible by 5");
	                    }
	                    else if(no<0) {
	                    	System.out.println("Enter Number is negative ...Enter positive number only");
	                    }
	                    else
	                    {
	                    	System.out.println("Number is equal to zero");
	                    }
	                    break;
	             case 5:
	            	 System.exit(0);
	             default:
	            	 System.out.println("Enter valid choice!");
             }
             sc.close();
	  }
} 

