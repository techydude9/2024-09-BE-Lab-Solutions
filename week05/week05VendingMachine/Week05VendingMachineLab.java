/*
 * Bob Ruzga's Lab Solution. Note that this is mostly the promineo tech lab solution bc of
 * I am struggling to understand this since there wasn't any questions in the original copy of the lab
 */
package week05.week05VendingMachine;

public class Week05VendingMachineLab {

	public static void main(String[] args) throws Exception{


		/*
		 *  Vending Machine:
		 *
		 *   Create the following four classes:  VendingMachine, ItemSlot, Item, and Return
		 *
		 * 			a. VendingMachine: will contain a Map<String, ItemSlot> where 
		 *								the String will represent the location in the 
		 *								vending machine (i.e. "A4") 
		 *
		 * 			b. ItemSlot:  will contain an item, the item's price, and 
		 *								the quantity of that item in that slot 
		 *
		 * 			c. Item:  will contain a description 
		 *
		 * 			d. Return:  will have a field for an Item and a double for any change. 
		 * 								The Return is what will be returned 
		 *								to each user using the vending machine.
		 *
		 *   VendingMachine should have two methods:
		 *
		 *			a. a method that takes a double (money) and a location (i.e. "A4") 
		 *					and returns a Return containing any change and the item.
		 *					If the supplied money was insufficient to purchase the item, 
		 *					the Return should contain just the money (item should be null).
		 *
		 * 			b. a method that takes an Item, int (quantity), price and string (location) 
		 *					and will create an ItemSlot based on the input.
		 *
		 * 11/01/2024 NOTE: There was nothing below here in the original file. I used the lab
		 * 				solution file to complete this lab. I change the values of the items just to make
		 * 				this
		 */
		
		System.out.println("-------------------------");
		System.out.println("Week 05 Object Lab\n    Vending Machine: ");
		
		System.out.println("-------------------------");
		System.out.println("Question 1 - Create classes & instantiate them");
		System.out.println("\tQuestion a - Vending Machine Creation ");

		/*
		 * Instantiate a Vending Machine here
		 */
		VendingMachine vendingMachine = new VendingMachine();
		System.out.println("\tQuestion b - Item Creation ");

		/*
		 * Instantiate an Item here
		 */
		
		Item item = new Item("Peanut M & Ms");
		
		System.out.println("\tQuestion c - ItemSlot Creation ");

		/*
		 * Instantiate an itemSlot using that item
		 */
		ItemSlot itemSlot = new ItemSlot(item, 2.69, 7);
		
		/*
		 * Instantiate additional items and itemSlots
		 */
		Item item1 = new Item("Bag o Chips");
		ItemSlot itemSlot1 = new ItemSlot(item, 0.75, 5);
		Item item2 = new Item("Water Bottle");
		ItemSlot itemSlot2 = new ItemSlot(item, 4.00, 1);

		System.out.println("\tQuestion d - Return Creation ");
		
		
		System.out.println("-------------------------");		
		System.out.println("Question 2 - Test Vending Machine \n");
		
		/*
		 * Insert Items into Vending Machine
		 */
		
		vendingMachine.insert(item, itemSlot.getQuantity(), "A1", itemSlot.getPrice());
		vendingMachine.insert(item1, itemSlot1.getQuantity(), "A2", itemSlot1.getPrice());
		vendingMachine.insert(item2, itemSlot2.getQuantity(), "A3", itemSlot2.getPrice());
		
		/*
		 * Test out the Vending Machine
		 */
		System.out.println("Vending Machine Purchase:\n------------------------ ");
		double money = 15.51;
		System.out.printf("%s %.2f", "Inserting Money:    " ,money);
		System.out.println("\nBuying:  A1");
		Return newReturn = vendingMachine.purchase(money, "A1");	
		newReturn.describe();
		System.out.println("Buying:  A2");
		newReturn = vendingMachine.purchase(newReturn.change, "A2");	
		newReturn.describe();
		System.out.println("Buying:  A3");
		newReturn = vendingMachine.purchase(newReturn.change, "A3");	
		newReturn.describe();

	
		System.out.println("-------------------------");		
	
	}  // End of main
	
}  //End of Week05VendingMachineLab
