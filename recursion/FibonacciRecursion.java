package recursion;

import java.util.Scanner;

public class FibonacciRecursion 
{
	public static int n1=0,n2=1,n3=0;
	
	public static void fibonacci(int n)
	{
		if(n>0)
		{
			n3=n1+n2;
			
			System.out.print(" "+n3);
			
			n1=n2;
			n2=n3;
			
			fibonacci(n-1);
		}
		
	}
	
	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter n: ");
		int n=userInput.nextInt();
		
		System.out.print(n1+" "+n2);
		
		fibonacci(n-2);
		
		userInput.close();
	}
}
