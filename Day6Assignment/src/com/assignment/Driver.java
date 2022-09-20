package com.assignment;

public class Driver {

	public static void main(String[] args) {

		Strings strRev = new Strings();
		System.out.println(strRev.reverse("Mohit Jangid"));
		strRev.countOccurence("Helloooo");

		
		
		
		int[] input = { 1, 4, 5, 6, 2 };
		if (ArrayElements.isFirstAndLastElementSame(input)) {
			System.out.println("Eelements are same !!");
		} else
			System.out.println("Eelements are not same !!");
		
		
		if (strRev.areStringsAnagram("Ca1tek", "tke1ac")) {
			System.out.println("Anagrams");
		} else
			System.out.println("Not Anagrams");
		
		

		try {
			if (!Email.isValid("abc@gmail.com"))
				throw new InvalidEmailException();
			else
				System.out.println("Valid Email Address !! WeLCOME");
		} catch (InvalidEmailException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}

	}

}
