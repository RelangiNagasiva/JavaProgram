import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
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

}
