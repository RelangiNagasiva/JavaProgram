import java.util.Scanner;

public class CountName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Reding the input from the keyboard
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
		//System.out.println(count);
        
	}

}

