/**
 * TrackDivisions.java
 * Andrew Metz 
 * CSC30
 * START DATE: Friday, June 2nd, 2017
 * COMPLETION DATE:
 * Create a program that determines the track and field division that a student athlete should be competing in.
 */

//Import the class needed to acquire input
import java.util.Scanner;


 
public class TrackDivisions
{

	public static void main(String[] args)
	{
		
		final int SHSAA_YEAR = 2016;
		final int SHSAA_MONTH = 8;
		
		int birthYear;
		int birthMonth;
		int age = 11;
		int division = 0;
		int cutOffAge;
		
		
		
		Scanner input = new Scanner(System.in);
				
		System.out.println("\n\n\t***THE TRACK DIVISIONS PROGRAM ***");
		
		do {
		
			System.out.print("\n\tPlease enter the year that you were born: ");
			birthYear = input.nextInt();
		
			System.out.print("\n\tPlease enter the month that you were born (as a number): ");
			birthMonth = input.nextInt();
		
			cutOffAge = SHSAA_YEAR - birthYear;
		
			if (cutOffAge < 11 || cutOffAge > 18) {
				System.out.println("\n\tYou are too old to be competing!");
				
			}
		
		} while (cutOffAge < 11 || cutOffAge > 18);
		
		System.out.println("\n\tIn the 2016/2017 school year, the student athlete turned " + cutOffAge + " years old.");
		
		
		
		if (birthMonth <= 8) {
			do {

				age++;
				division = age;
										
			} while (age != cutOffAge);
			
		}
		
		if (birthMonth > 8) {
			do {
			
				age++;
				division = age - 1;
										
			} while (age != cutOffAge);
			
		}		
			
		switch (division) {
		
			case 11: System.out.println("\n\tWee Pee"); break;
			case 12: System.out.println("\n\tPee Wee"); break;
			case 13: System.out.println("\n\tBantam"); break;
			case 14: System.out.println("\n\tMidget"); break;
			case 15: System.out.println("\n\tJunior"); break;
			case 16: System.out.println("\n\tSenior"); break;
		
		}	
		

		
		
		
		
		
		
		
		
		
		
		
		/*	
		switch (age) {
			case 11:
			
				if (birthMonth <= 8) {			
			
					division = 1;	
				
				} else {
			
					division = 0;
					
				} break;
					
			case 12:
			
				if (birthMonth <= 8) {			
			
					division = 2;	
				
				} else {
			
					division = 1;
					
				} break;
					
			case 13:
			
				if (birthMonth <= 8) {			
			
					division = 3;	
				
				} else {
			
					division = 2;
					
				} break;
					
			case 14:
			
				if (birthMonth <= 8) {			
			
					division = 4;	
		
				} else {
			
					division = 3;
				
				} break;
					
			case 15:
			
				if (birthMonth <= 8) {			
			
					division = 5;	
		
				} else {
			
					division = 4;
					
				} break;
					
			case 16: 
				
				division = 5;
				
				break;
				
			} 
			
					
			
			switch (division) {
			case 0: System.out.println("\n\tWee Pee"); break;
			case 1: System.out.println("\n\tPee Wee"); break;
			case 2: System.out.println("\n\tBantam"); break;
			case 3: System.out.println("\n\tMidget"); break;
			case 4: System.out.println("\n\tJunior"); break;
			case 5: System.out.println("\n\tSenior"); break;
			}
		
		*/
			
		 
			
			
		
		
		
		
		
		
		
		
		
		
		System.out.println("\n");
		
		
		
		
		
	}
	
	
	
	








}





















