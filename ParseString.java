/*
 * ParseString.java
 * Mr. Heise
 * CSC30
 * Start Date: Wednesday 7 June 2017
 * This program simulates processing a line of text from a text file.
 */




/**
 * The ParseString class simulates processing a line of text from a text file.
 */


public class ParseString {

	public static void main(String[] args){
	
		String lineOfText = "Babyak,Akilah,2000,6,June";
		
		String lastName;
		String firstName;
		
		int birthYear;
		int birthMonth;
		
		int comma;
			
		
	
		// Identify last name.
		
		comma = lineOfText.indexOf(",");
		
		lastName = lineOfText.substring(0,comma);
		
		System.out.println("\n\tlastName = " + lastName);
		
		
		
		lineOfText = lineOfText.substring(comma + 1);
		
		
		// Identify first name.
		
		
		comma = lineOfText.indexOf(",");
		
		firstName = lineOfText.substring(0,comma);
		
		System.out.println("\n\tfirstName = " + firstName);
		
		
		
		lineOfText = lineOfText.substring(comma + 1);
		
		
		// Identify the birth year.
		
		
		comma = lineOfText.indexOf(",");
		
		birthYear = Integer.parseInt(lineOfText.substring(0,comma));
		
		System.out.println("\n\tbirthYear = " + birthYear);
		
		
	
		lineOfText = lineOfText.substring(comma + 1);
	
		
		// Identify the birth month.
		
		
		comma = lineOfText.indexOf(",");
		
		birthMonth = Integer.parseInt(lineOfText.substring(0,comma));
		
		System.out.println("\n\tbirthMonth = " + birthMonth);
		
		
		
		
	
	
	
	}


}
