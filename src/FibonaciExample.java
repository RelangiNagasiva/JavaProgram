import java.util.Scanner;

public class FibonaciExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaring the integer variable i,j,k,count
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

}
