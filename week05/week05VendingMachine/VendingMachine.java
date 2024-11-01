package week05.week05VendingMachine;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
	Map<String, ItemSlot> itemLocation;

	VendingMachine() {
		this.itemLocation = new HashMap<>();
	}
	
	public Map<String, ItemSlot> getItemLocation() {
		return itemLocation;
	}


	public void setItemLocation(String itemName, ItemSlot itemSlot) {
		this.itemLocation.put(itemName,  itemSlot);
	}

	public Return purchase (double money, String location) {
		// find the item in the map using the location String
		ItemSlot itemSlot = itemLocation.get(location);
		Return newReturn = new Return();
		// If there are items AND there is enough money, process this.
		if ((itemSlot.quantity > 0) &&	(money - itemSlot.price > 0)) {
			newReturn.change = money - itemSlot.price;
			newReturn.item = itemLocation.remove(location).getItem();
		} else {
			newReturn.change = money;
			// there is a bug here such that if this else is taken, an exception is thrown
			// bc there isn't an item to get which throws the exception. Not sure how 
			// to resolve this.
		}
		
		
		return newReturn;
	}
	
	public void insert (Item item, int quantity, String location, double price) {
		ItemSlot itemSlot = new ItemSlot(item, price, quantity);
		itemLocation.put(location,  itemSlot);
	}

	
}  // End of VendingMachine Class
