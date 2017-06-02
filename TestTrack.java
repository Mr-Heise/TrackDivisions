
/*
 
 The magic cut-off date regarding ages for track is their age as of August 31 of the current school year.

 Senior - 16 and over
 
 Junior - under 16
 
 Midget under 15
 
 Bantam under 14
 
 Pee Wee under 13

 Wee Pee under 12
 
 
 */

import java.util.Scanner;

public class TestTrack{

	public static void main(String[] args){
	
		final int SHSAA_YEAR = 2016;
		final int SHSAA_MONTH = 8;
		
		System.out.println("\n\t*** TRACK DIVISIONS PROGRAM *** \n");
		
		int birthYear;
		
		int birthMonth;
		
		int age;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("\n\tPlease enter the year that you were born --> ");
		birthYear = input.nextInt();
		
		System.out.print("\n\tPlease enter the month that you were born --> ");
		birthMonth = input.nextInt();
		
		
		age = SHSAA_YEAR - birthYear;
		
		
		System.out.println("\n\tIn " + SHSAA_YEAR +", you turn(ed) " + age + " years old.");
		
		if (age >= 17){
		
			System.out.println("\n\tSenior");
		
		}
		
		else if (age == 16){
		
			if (birthMonth <= SHSAA_MONTH){
			
				System.out.println("\n\tSenior");
			
			} else {
			
				System.out.println("\n\tJunior");
			
			}
		
		} else if (age == 15){
		
			if (birthMonth <= SHSAA_MONTH){
			
				System.out.println("\n\tJunior");
			
			} else {
			
				System.out.println("\n\tMidget");
			
			}
		
		
		} else if (age == 14){
		
			if (birthMonth <= SHSAA_MONTH){
			
				System.out.println("\n\tJunior");
			
			} else {
			
				System.out.println("\n\tBantam");
			
			}
		
		} else if (age == 13){
		
			if (birthMonth <= SHSAA_MONTH){
			
				System.out.println("\n\tBantam");
			
			} else {
			
				System.out.println("\n\tPee Wee");
			
			}
		
		} else if (age == 12) {
		
			if (birthMonth <= SHSAA_MONTH){
			
				System.out.println("\n\tPee Wee");
			} else{
			
				System.out.println("\n\tWee Pee");
			}
		}
		
		System.out.println();
		
		
		
	
	
	
	}



}
