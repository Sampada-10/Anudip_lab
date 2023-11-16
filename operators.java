package assignmentproblems;

import java.util.*;

public class operators {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		boolean result;
		System.out.println("Enter 1st no.(num1): ");
		num1=sc.nextInt();
		System.out.println("Enter 2nd no.(num2): ");
		num2=sc.nextInt();
		do {
		System.out.println("Choices:\n1.Arithmetic operator\n2.Logical Operator\n3.Relational Operator\n4.Bitwise Operator\n5.Conditional Operator\n6.Assignment Operator");
		System.out.println("Which operation you want to perform?  ");
		int choice=sc.nextInt();
		switch(choice) 
		{
			case 1:
				//Arithmetic operator
				 System.out.println("\n\nArithmatic operations:\n 1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus6.Exit ");
				 System.out.println("Select operation you want to perform: ");
				 int c=sc.nextInt();
				 switch(c) {
				    case 1:
				    	int addition=num1+num2;
				    	System.out.println("num1+num2 = "+addition);
				    	break;
				    case 2:	
				    	 int subtraction=num1-num2;
				    	 System.out.println("num1-num2 ="+subtraction);
				    	 break;
				    case 3:
				    	int multiplication=num1*num2;
				    	System.out.println("num1*num2 =: "+multiplication);
				    	break;
				    case 4:
				    	 int division=num1/num2;
				    	 System.out.println("num1/num2 =: "+division);
				    	 break;
				    case 5:
				    	int modulus=num1%num2;
				    	System.out.println("num1%num2 = "+modulus);
						break;
				    case 6:
				    	System.exit(0);
				    default:
				    	System.out.println("Enter valid choice");
				 }
				 
			case 2:
				//Logical operator
				boolean and, or, not;
				System.out.println("\n\nLogical Operators:  \n 1.Logical AND(&)\n2.Logical OR(||)\n3.Logical NOT(!)\n4.Exit");
				System.out.println("Select operator: ");
				int ch=sc.nextInt();
				switch(ch) {
				   case 1:
					   and=(num1>num2 && num1>0);
					   System.out.println("num1>num2 && num1>0=> "+and);
					   break;
				   case 2:
						or=((num1>num2)||(num2<num1));
						System.out.println("((num1>num2)||(num2<num3))=> "+or);
					   break;
				   case 3:
					   not=!(num1>num2);
					   System.out.println("!(num1>num2)=> "+not);				
		               break;
				   case 4:
				    	System.exit(0);
				   default:
					   System.out.println("Enter valid choice");
		         }
			case 3:
				//Relational operator
				System.out.println("\n\nLogical Operators:  \n 1.==\n2.!=)\n3.>\n4.<\n5.>=\n6.<=\n7.Exit");
				System.out.println("Select operator: ");
				ch=sc.nextInt();
				switch(ch) {
					case 1:
						//== operator
						result=(num1==num2);
						System.out.println("(num1==num2): "+result);
						break;
					case 2:
						//not equal to operator
						result=(num1!=num2);
						System.out.println("(num1!=num2): "+result);
						break;
					case 3:
						//greater than operator
						result=(num1>num2);
						System.out.println("(num1>num2): "+result);
						break;
					case 4:
						//less than operator
						result=(num1<num2);
						System.out.println("(num1<num2): "+result);
						break;
					case 5:
						//greater than or equal to operator
						result=(num1>=num2);
						System.out.println("(num1>=num2): "+result);
						break;
					case 6:
						//greater than or equal to operator
						result=(num1<=num2);
						System.out.println("(num1<=num2): "+result);
						break;
					case 7:
						System.exit(0);
					default:
						System.out.println("Enter valid choice!");
				}
				break;
			case 4:
				//Bitwise operator
				System.out.println("num1 & num2: "+(num1&num2));   // binary and
				System.out.println("num1 | num2: "+(num1|num2));    // binary or 
				System.out.println("num1 ^ num2: "+(num1^num2));		//binary Xor
				System.out.println("num1 = ~ num2: "+(num1=~num2));		//binary 1's complement
				System.out.println("num1 << num2: "+(num1<<num2));		//left shift
				System.out.println("num1 >> num2: "+(num1>>num2));		//right shift
				break;
			case 5:
				//Conditional operator
					if(num1%2==0)
					{
						System.out.println("num1 is even");
					}
					else {
						System.out.println("num1 is odd");
					}
				
				
				break;
			case 6:
				//Assignment operator
				System.out.println("Initially no: "+num1);
			   	 num1+=5;
			   	 System.out.println("after adding 5 in no: "+num1);
			   	 num1-=10;
			   	 System.out.println("after multiplying no by 2: "+num1);
			   	 num1*=2;
			   	 System.out.println("after multiplying no by 2: "+num1);
			  	 num1/=2;
			  	 System.out.println("after divide no by 2:"+num1);
			  	 System.out.println("add 10 in no: "+num1);
			  	 num1+=10;
			  	 num1%=2;
			  	 System.out.println("no mod by 2: "+num1);
				break;
			default:
				System.out.println("Enter valid choice");
		   }
		   sc.close();
		}while(true);
		
	}
}
