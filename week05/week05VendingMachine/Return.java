package week05.week05VendingMachine;

public class Return {
	Item item;
	double change;
	
	Return() {
		
	}
	
	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public double getChange() {
		return change;
	}

	public void setChange(double change) {
		this.change = change;
	}
	
	public void describe() {
		System.out.println("\tItem: " + item.getDescription());
		System.out.println("\tChange: " + change);
		}


}  // End of Return Class
