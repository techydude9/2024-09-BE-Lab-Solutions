package recipes;

import java.sql.Connection;
import java.time.LocalTime;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import recipes.dao.DbConnection;
import recipes.entity.Recipe;
import recipes.exception.DbException;
import recipes.service.RecipeService;

public class Recipes {
	private Scanner scanner = new Scanner(System.in);
	private RecipeService recipeService = new RecipeService();
	
	// @formatter:off
	private List<String> operations = List.of(
			"1) Create and populate all tables",
			"2) Add a recipe",
			"3) List recipes"
	);
	// @formatter:on
		
	public static void main(String[] args) {
		// test line from week 8: DbConnection.getConnection();
		new Recipes().displayMenu();

	}  // end of main
	
	
	private void displayMenu() {
		boolean done = false;
		
		while(!done) {
			try {
			int operation = getOperation();
			
			switch(operation) {
			
			case -1:
				done = exitMenu();
				break;
				
			case 1:
				createTables();
				break;
				
			case 2:
				addRecipe();
				break;
				
			case 3:
				listRecipes();
				break;
				
			default:
				System.out.println("\n" + operation +  " is not valid. Try again.");
			} // end of switch
			
			} catch(Exception e) {
				System.out.println("\nError: " + e.toString() + " Try again.");
			}	// end of try/catch
			
		} // end of while	
	} // end of displayMenu


	private void listRecipes() {
		List<Recipe> recipes = recipeService.fetchRecipes();
		
		System.out.println("\nRecipes:");
		
		recipes.forEach(recipe -> System.out.println("   " + 
				recipe.getRecipeId() + ": " + recipe.getRecipeName()));
		
	} // end of listRecipes method ----


	private void addRecipe() {
		String name = getStringInput("Enter the recipe name");
		String notes = getStringInput("Enter the recipe notes");
		Integer numServings = getIntInput("Enter number of servings");
		Integer prepMinutes = getIntInput("Enter prep time in minutes");
		Integer cookMinutes = getIntInput("Enter cook time in minutes");
		
		LocalTime prepTime = minutesToLocalTime(prepMinutes);
		LocalTime cookTime = minutesToLocalTime(cookMinutes);
		
		Recipe recipe = new Recipe();
		
		recipe.setRecipeName(name);
		recipe.setNotes(notes);
		recipe.setNumServings(numServings);
		recipe.setPrepTime(prepTime);
		recipe.setCookTime(cookTime);
		
		Recipe dbRecipe = recipeService.addRecipe(recipe);
		System.out.println("You added this recipe:\n" + dbRecipe);
		
		
	} // end of addRecipe


	private LocalTime minutesToLocalTime(Integer numMinutes) {
		int min = Objects.isNull(numMinutes) ? 0 : numMinutes;
		int hours = min / 60;
		int minutes = min % 60;
		
		return LocalTime.of(hours, minutes);
	} // end of minutesToLocalTime


	private void createTables() {
		recipeService.createAndPopulateTables();
		System.out.println("\nTables created and populated");
		
	} // end of createTables


	private boolean exitMenu() {
		System.out.println("\nExiting the menu. TTFN!");
		return true;
	} // end of exitMenu


	private int getOperation() {
		printOperations();
		Integer op = getIntInput("\nEnter an operation number (press Enter to quit)");
		
		return Objects.isNull(op) ? -1 : op;
	} // end of getOperation

	private void printOperations() {
		System.out.println();
		System.out.println("Here's what you can do:");
		
		operations.forEach(op -> System.out.println("   " + op));
		} // end of printOperations

	private Integer getIntInput(String prompt) {
		String input = getStringInput(prompt);
		
		if(Objects.isNull(input)) {
			return null;
		} 

		try {
			return Integer.parseInt(input);
		} 
		catch(NumberFormatException e) {
			throw new DbException(input + " is not a valid number.");
		}
	} // end of getIntInput
	
	private Double getDoubleInput(String prompt) {
		String input = getStringInput(prompt);
		
		if(Objects.isNull(input)) {
			return null;
		} 

		try {
			return Double.parseDouble(input);
		} 
		catch(NumberFormatException e) {
			throw new DbException(input + " is not a valid number.");
		}
	} // end of getDoubleInput


	private String getStringInput(String prompt) {
		System.out.print(prompt + ": ");
		String line = scanner.nextLine();
		
		return line.isBlank() ? null : line.trim();
	} // end of getStringInput


}  // end of Recipes class
