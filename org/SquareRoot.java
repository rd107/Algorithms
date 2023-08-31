package org;

import java.util.Scanner;

public class SquareRoot 
{
	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		
		double number = userInput.nextDouble();
				
		System.out.println(Math.sqrt(number));
		
		userInput.close();
	}
}
