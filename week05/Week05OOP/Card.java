// Bob Ruzga Week 5 OOP Lab Solution
// 11/01/2024


package week05.Week05OOP;

public class Card {
	String name;
	String suit;
	int value;
	
	public Card(String name, String suit, int value) {
		this.name = name;
		this.suit = suit;
		this.value = value;
	}

	// getters & setters section
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSuit() {
		return suit;	
	}
	
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	public int getValue() {
		return value;	
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	// describe() method
	public void describe() {
		System.out.println(this.name + " of " + this.suit + " has a value of: " + this.value);
	}
}  // end of Card class
