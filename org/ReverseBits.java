package org;

import java.util.Scanner;

public class ReverseBits 
{
	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		
		int number = userInput.nextInt();
		
		String binary_str = Integer.toBinaryString(number);
		
		int binary_num = Integer.parseInt(binary_str);
		
		System.out.println(binary_num);
		
		int temp=0,rem=0,rev=0;
		
		temp=binary_num;
		
		while(temp>0)
		{
			rem=temp%10;
			rev=(rev*10)+rem;
			temp=temp/10;
		}
		
		String dec_str=String.valueOf(rev);
		int decimal = Integer.parseInt(dec_str, 2);
		
		System.out.println(decimal);
		
		userInput.close();
	}
}
