//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//
package week03;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
			System.out.println("Q1 Lab3");
			int[] bobsArray1 = {1, 5, 2, 8, 13, 6};
		
		// 2. Print out the first element in the array
			System.out.println("\nQ2 Lab3");
			System.out.println(bobsArray1[0]);
			
		// 3. Print out the last element in the array without using the number 5
			System.out.println("\nQ3 Lab3");
			System.out.println(bobsArray1[bobsArray1.length - 1]);
		
		// 4. Print out the element in the array at position 6, what happens?
			System.out.println("\nQ4 Lab3");
			// System.out.println(bobsArray1[6]);
			System.out.println("Exception is thrown since I'm outside the array");
		
		// 5. Print out the element in the array at position -1, what happens?
			System.out.println("\nQ5 Lab3");
			// System.out.println(bobsArray1[-1]);
			System.out.println("Exception is thrown since I'm outside the array");
		
		// 6. Write a traditional for loop that prints out each element in the array
			System.out.println("\nQ6 Lab3");
			
			for (int i = 0; i < bobsArray1.length; i++) {
				System.out.println("Bob's Array Entry #" + i + " is " + bobsArray1[i]);
			}
			
		// 7. Write an enhanced for loop that prints out each element in the array
			System.out.println("\nQ7 Lab3");
			
			for (int entry : bobsArray1 ) {
				System.out.println("Bob's Array Entry #" + entry + " is " + entry);
			}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
			System.out.println("\nQ8 Lab3");
			
			double sum = 0;
			
			for (int entry : bobsArray1 ) {
				sum += entry;
			}
			
			System.out.println("Sum of all the entries in the array is: " + sum);
		
		// 9. Create a new variable called average and assign the average value of the array to it
			System.out.println("\nQ9 Lab3");
			
			double average = (sum / bobsArray1.length);
						
			System.out.println(bobsArray1.length + " " + sum);
			System.out.println("Average of all the entries in the array is: " + average);
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
			System.out.println("\nQ10 Lab3");
			
			for (int entry : bobsArray1) {
				if (entry % 2 != 0 ) {
					System.out.println("This is an odd number in my array: " + entry);
				}
			}
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
			System.out.println("\nQ11 Lab3");
			
			String [] names = {"Sam", "Sally", "Thomas", "Robert"};
			for (String name : names) {
				System.out.println(name);
			}
		
		// 12. Calculate the sum of all the letters in the new array
			System.out.println("\nQ12 Lab3");
			
			double numLetters = 0;
			
			for (String name : names) {
				numLetters += name.length();
			}
			
			System.out.println("Total number of letters for all the names in the array is: " + numLetters);
		

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
			System.out.println("\nQ13 Lab3");
			
			greeting("Ralphie");
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
			System.out.println("\nQ14 Lab3");
			
			System.out.println(greeting2("Darla"));
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
			System.out.println("\nCompare 13 & 14 Lab3");	
			System.out.println("13 outputs from within the method while 14 needs to have a sysout after it executes");
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
			System.out.println("\nQ15 Lab3");
			String word = "Hello!";
			int letters = 5;
			
			System.out.println(sameCount(word, letters));
				// note: I could have invoked the method with the word & number as parms and skipped variables
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
			System.out.println("\nQ16 Lab3");
			
			String[] lookUpArray = {"bananas", "carrots", "onions", "cherries"};
			String findMe = "garlic";
			
			System.out.println(productLookUp(lookUpArray, findMe));
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
			System.out.println("\nQ17 Lab3");
			
			System.out.println(smallestNumIs(bobsArray1));
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
			System.out.println("\nQ18 Lab3");
			double[] shoppingCosts = {1.99, 2.50, 9.95, .56, 13.75};
			
			System.out.println(whatsMyAvg(shoppingCosts));

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
			System.out.println("\nQ19 Lab3");

			int[] wordLengths = countTheLetters(lookUpArray);
			
			for (int howLong : wordLengths) {
				System.out.println(howLong);
			}
			
				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
			System.out.println("\n20 Lab3");
			
			// using names array from Q11
			
			System.out.println(evenOrOddHigher(names));
			
			
	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
			System.out.println("\nQ21 Lab3");
			System.out.println(isAPalindrome("deb"));
			System.out.println(isAPalindrome("bob"));
		
	}
	

	
	// Method 13:
	public static void greeting(String name) {
		System.out.println("Hello " + name);
		return;
	}
		

	// Method 14:
	public static String greeting2(String name2) {
		return "Hello " + name2 + " !";
	}
	
	// Method 15:
	public static boolean sameCount(String word, int letters) {
		boolean countIsEqual = false;
		
		if (word.length() > letters) {
			countIsEqual = true;
		}
		return countIsEqual;
		// note to myself. I could have simply made the test in the return statement. less code
	}

	
	// Method 16:
	public static boolean productLookUp (String[] products, String findItem) {
		boolean isFound = false;
		
		for (String product : products) {
			if (product.equals(findItem)) {
				isFound = true;
				// alternative -- return true;
			}
		}
		return isFound; // alt - return false;  then I don't need the boolean var here
	}
	
	// Method 17:
	
	public static int smallestNumIs (int[] arrayOfNums) {
		int smallestNum = arrayOfNums[0];
		
		for (int singleNum : arrayOfNums) {
			if (singleNum < smallestNum) {
				smallestNum = singleNum;
			}
		}
		return smallestNum;
	}

	
	// Method 18:
	public static double whatsMyAvg (double[] cartCosts) {
		double sumCart = 0;
		
		for (double itemCost : cartCosts) {
			sumCart += itemCost;
		}
		return sumCart / cartCosts.length;
	}
	
	// Method 19:
	
	public static int[] countTheLetters(String[] wordsArray) {
		int[] wordLength = new int[wordsArray.length];
		
		for (int i = 0; i < wordsArray.length; i++) {
			wordLength[i] = wordsArray[i].length();
		}
		return wordLength;
	} 

	
	// Method 20:
	public static boolean evenOrOddHigher(String[] names) {
		int evenCount = 0;
		int oddCount = 0;
		
		for (String name : names) {
			if (name.length() % 2 == 0) {
				evenCount += name.length();
			} else {
				oddCount += name.length();
			}
		}
		
		return evenCount > oddCount;
	}
	
	// Method 21:
	public static boolean isAPalindrome(String testWord) {
		
		for (int i = 0; i < testWord.length() / 2; i++) {
			if (testWord.charAt(i) != testWord.charAt(testWord.length()-i -1)) {
				return false;
			}
		}
		
		return true;
	}

}
