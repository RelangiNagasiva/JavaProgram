package ObjectModel;

import java.util.Scanner;

public class PraticePrograms {
	
	public void CountName()
	{
	Scanner input = new Scanner(System.in);
	System.out.println("Enter you name");
	//Declaring the character variable for ch
	char ch; 
	//Declaring the String variable for reverse
	String reverse ="";
	//Assign value from keyboard	
	String name = input.nextLine();
	//logic 
	int count=name.length();			
	System.out.println(count);
	}
	
	public void Fibonaci()

	
	{
		int i=0,j=1,k, count=10;
		//Print value for i and j initially
		System.out.println(i);
		System.out.println(j);
		//logic for fibonacci series
		for(i=2;i<count;i++)
		{
			k=i+j;
			System.out.println(" "+k);
			i=j;
			j=k;
		}
	}
    
	public void LeapYear()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number");
		//Assign the year value from keyboard
		int year =input.nextInt();
		//logic for leap year it divisible by 4 and 400 and not divisible 100 
		if(((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
		{
			System.out.println("Specified year is a leap year");
		}
		else
		{
			System.out.println("Specified year is a not leap year");
		}
		

	}

	public void PrimeNumber()

	{
		// TODO Auto-generated method stub
				//Declaring the integer variable
				int i=0;
				int flag=0;
				//int primeNumbers=0;
				//Reding the year from the keyboard
				Scanner input = new Scanner(System.in);
				System.out.println("Please enter the number");
				//Assign the number value from keyboard
				int number =input.nextInt();
				//Logic for prime number divisible by itself and 1
				for(i=2 ; i < number/2 ; i++) {
				      if(number%i == 0) {
				        System.out.println("it is not a prime number"+number);
				         flag = 1;
				         break;
				      }
				   }
				   if(flag == 0) {
					   System.out.println("Prime number is "+number);
				   }
			
	}
    
	public void SwapNumber()
	{
		// TODO Auto-generated method stub
				int a=10, b=20,c = 0;
				//Assign value of a to c;
				c=a;
				//Assign value of a to b;
				a=b;
				//Assign value of b to c;
				b=c;	
				 System.out.println("After swapping:"
		                 + " a = " + a + ", b = " + b);
	}
}
