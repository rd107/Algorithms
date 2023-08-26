package recursion;

import java.util.Scanner;

public class RecursionTest 
{
	static int n1=0,n2=1,n3=0;
	public static void fibonacci(int n)
	{
		if(n>0)
		{
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
			
			fibonacci(n-1);
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		
		int n = userInput.nextInt();
		
		System.out.println(n1);
		
		System.out.println(n2);
		
		fibonacci(n-2);
		
		userInput.close();
	}
}
