//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  StringBuilders, Lists, Sets, & Maps
// Java Week 04 Lab  
//
package week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Week04StringBuilderListSetMapLab {

	public static void main(String[] args) {

		// Solutions by Bob Ruzga Sept 26 2024 Cohort - Week 4 Lab
		//
		// 1. Why would we use a StringBuilder instead of a String?
		// 		a. Instantiate a new StringBuilder
		//		b. Append the characters 0 through 9 to it separated by dashes
		// 				Note:  make sure no dash appears at the end of the StringBuilder
		
		System.out.println("\nWeek 4 Lab - Q1 solution:");
		
		String dash = "-";
		
		StringBuilder stringONums = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			stringONums.append(i);
			if (i < 9) {
				stringONums.append(dash);
			}
		}
		System.out.println(stringONums);

		
		// 2. List of String:
		//		a. Create a list of Strings 
		//		b. Add 5 Strings to it, each with a different length
		System.out.println("\nWeek 4 Lab - Q2 solution:");
		List<String> carList = new ArrayList<String>();
		carList.add("Camero");
		carList.add("Porsche");
		carList.add("Alpha Romeo");
		carList.add("Vega");
		carList.add("Mustang");
		
		System.out.println(carList);

		
		// 3. Write and test a method that takes a list of strings 
		//			and returns the shortest string
		System.out.println("\nWeek 4 Lab - Q3 solution:");
		System.out.println(findShortestCarName(carList));
		

		
		// 4. Write and test a method that takes a list of strings 
		//			and returns the list with the first and last element switched
		System.out.println("\nWeek 4 Lab - Q4 solution:");
		System.out.println(carList + " Before method 4 is run");
		System.out.println(swapFnLName(carList) + " After method 4 is run");

		
		// 5. Write and test a method that takes a list of strings 
		//			and returns a string with all the list elements concatenated to each other,
		// 			separated by a comma
		System.out.println("\nWeek 4 Lab - Q5 solution:");
		System.out.println(combineCarNames(carList));

		
		// 6. Write and test a method that takes a list of strings and a string 
		//			and returns a new list with all strings from the original list
		// 			containing the second string parameter (i.e. like a search method)
		System.out.println("\nWeek 4 Lab - Q6 solution:");
		List<String> searchResults = isItInThere(carList, "om");
		for (String aResult : searchResults) {
			System.out.println(aResult);
		}

		
		// 7. Write and test a method that takes a list of integers 
		//			and returns a List<List<Integer>> with the following conditions specified
		//			for the return value:
		//		a. The first List in the returned value contains any number from the input list 
		//			that is divisible by 2
		//		b. The second List contains values from the input list that are divisible by 3
		//		c. The third containing values divisible by 5, and 
		//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
		System.out.println("\nWeek 4 Lab - Q7 solution:");
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 15, 16, 20, 25, 30);

		List<List<Integer>> sortedNumbers = sortDivisibleNumbers(numbers);
		int count = 1;
		for (List<Integer> list : sortedNumbers) {
			for (Integer number : list) {
				System.out.println(number);
			}
			if (count < sortedNumbers.size()) {
				// System.out.println("Count: " + count + " " + sortedNumbers.size());
				System.out.println("Next list ----------");
			}
			count++;
		}
		

		
		// 8. Write and test a method that takes a list of strings 
		//			and returns a list of integers that contains the length of each string
		System.out.println("\nWeek 4 Lab - Q8 solution:");
		List<Integer> carNameLengths = calcCarNameLengths(carList);
		
		for (Integer i : carNameLengths) {
			System.out.println(i);
		}
		

		// 9. Create a set of strings and add 5 values
		System.out.println("\nWeek 4 Lab - Q9 solution:");

		Set<String> firstNames = new HashSet<String>();
		firstNames.add("Ralph");
		firstNames.add("Karen");
		firstNames.add("George");
		firstNames.add("Jill");
		firstNames.add("Jim");
		
		for (String name : firstNames) {
			System.out.println(name);
		}
		
		// 10. Write and test a method that takes a set of strings and a character 
		//			and returns a set of strings consisting of all the strings in the
		// 			input set that start with the character parameter.
		System.out.println("\nWeek 4 Lab - Q10 solution:");


		
		// 11. Write and test a method that takes a set of strings 
		//			and returns a list of the same strings
		System.out.println("\nWeek 4 Lab - Q11 solution:");
	
		

		// 12. Write and test a method that takes a set of integers 
		//			and returns a new set of integers containing only even numbers 
		//			from the original set
		System.out.println("\nWeek 4 Lab - Q12 solution:");


		
		// 13. Create a map of string and string and add 3 items to it where the key of each
		// 			is a word and the value is the definition of the word
		System.out.println("\nWeek 4 Lab - Q13 solution:");

	
		
		// 14. Write and test a method that takes a Map<String, String> and a string 
		// 			and returns the value for a key in the map that matches the
		// 			string parameter (i.e. like a language dictionary lookup)
		System.out.println("\nWeek 4 Lab - Q14 solution:");

		
		// 15. Write and test a method that takes a List<String> 
		//			and returns a Map<Character, Integer> containing a count of 
		//			all the strings that start with a given character
		System.out.println("\nWeek 4 Lab - Q15 solution:");
		

	}
	
	
	// Method 15:
	
	
	
	// Method 14:
	

	
	// Method 12:
	

	
	// Method 11:
	


	// Method 10:
	

	
	// Method 8:
	public static List<Integer> calcCarNameLengths(List<String> carList) {
		List<Integer> nameLengths = new ArrayList<Integer>();
		
		for (String aCar : carList) {
			nameLengths.add(aCar.length());
		}
		return nameLengths;
	}

	
	// Method 7:
	
	/* I don't understand the question nor the output so I've copied the Lab solution here so I
	// can see what the output looks like. Figure this out:
	 * First List will have 4 arraylists bc of the 4 results.add below:
	 * then if the number of the passed List is div by 2 it will go into the first entry of the 
	 * first array (get(0)). If div by 3 into 2nd(get(1)) array, by 5 into 3rd(get(2)) and if none then 4th(get(3))
	*/
	public static List<List<Integer>> sortDivisibleNumbers(List<Integer> list) {
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		results.add(new ArrayList<Integer>());  // contains the nums div by 2
		results.add(new ArrayList<Integer>());  // contains nums div by 3
		results.add(new ArrayList<Integer>());  // contains nums div by 5
		results.add(new ArrayList<Integer>());  // contains nums not div by 2,3,5

		for (Integer number : list) {
			if (number % 2 == 0) {
				results.get(0).add(number);
			}
			if (number % 3 == 0) {
				results.get(1).add(number);
			}
			if (number % 5 == 0) {
				results.get(2).add(number);
			}
			if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0) {
				results.get(3).add(number);
			}
		}

		return results;
	}

	
	// Method 6:
	public static List<String> isItInThere(List<String> carList, String toFind) {
		List<String> results = new ArrayList<String>();
		
		for ( String aCar : carList) {
			if (aCar.contains(toFind)) {
				results.add(aCar);
			}
		}
		
		return results;
	}

	
	// Method 5:
	public static String combineCarNames(List<String> carList) {
		StringBuilder stringOfCarNames = new StringBuilder();
		int ctr = 1;
		
		for(String aCar : carList) {
			stringOfCarNames.append(aCar);
			if (ctr < carList.size()) {
				stringOfCarNames.append(",");
			}
			ctr++;
		}
		
		return stringOfCarNames.toString();
	}
	
/*  Below is my original code which produced the same result but the above code was presented as
 * the solution and I'm assuming they wanted their code as it uses methods for Lists.
 * 
 * 	public static String combineCarNames(List<String> carList) {
*		String stringOfCarNames = "";
*		int ctr = 0;
*		
*		for (String aCar : carList) {
*			stringOfCarNames = stringOfCarNames + aCar;
*			
*			if (ctr < carList.size()) {
*				stringOfCarNames += ",";
*			}
*			
*			ctr += 1;
*		}
*		return stringOfCarNames;
*	}
*/	
	
	// Method 4:
	public static List<String> swapFnLName(List<String> carList) {
		String holdFirst = carList.get(0);
		
		carList.set(0, carList.get(carList.size()-1));
		carList.set(carList.size()-1, holdFirst);
		
		return carList;
	}
	
	
	// Method 3:
	public static String findShortestCarName(List<String> carList) {
		String shortestName = carList.get(0);
		
		for (String aCarName : carList) {
			if (aCarName.length() < shortestName.length()) {
				shortestName = aCarName;
			}
		}
		return shortestName;
	}
	

}
