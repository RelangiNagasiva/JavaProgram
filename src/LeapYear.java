import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Reding the year from the keyboard
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

}
