import java.util.Scanner;

public class ReverseName {

	public static void main(String[] args) {
		
		//Reding the year from the keyboard
		Scanner input = new Scanner(System.in);
		System.out.println("Enter you name");
		//Declaring the character variable for ch
		char ch;  
		//Declaring the String variable for reverse
		String reverse ="";	
		//	//Assign the year value from keyboard
		String name = input.nextLine();
		int count=name.length();
		//logic for reverse number
		for(int i=0;i<name.length();i++)
		{
			
			ch=name.charAt(i);
		
			reverse=ch+reverse;
			
			
		}
		System.out.println(reverse);
	
        
	}
	
	}


