package codekata;  //strings 4-->right

import java.util.Scanner;

public class StringVowel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		String str=sc.nextLine();
		
		if(str.matches(".*[aeiou].*"))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
		
	}

}
