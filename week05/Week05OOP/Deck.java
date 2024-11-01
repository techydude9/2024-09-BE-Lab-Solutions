package week05.Week05OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
		List<Card> cards = new ArrayList<Card>();
		
		Deck () {
			String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
			String[] numberLits = {"Two", "Three", "Four", "Five", "Six", "Seven",
									"Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
			
			for (String suit : suits) {
				int cardVal = 2;
				for (String cardLit : numberLits) {
					cards.add(new Card(cardLit, suit, cardVal));
					cardVal++;
				}
			}
		}  // End of Deck
		
		public List<Card> getCards() {
			return cards;
		}
		
		public void setCards(List<Card> cards) {
			this.cards = cards;
		}
		
		public void describe() {
			for (Card card : this.cards) {
				card.describe();
			}
		}
		
		public void shuffle() {
			Collections.shuffle(this.cards);
		}
		
		public Card draw() {
			Card card = this.cards.remove(0);
			return card;
	}
}   // end of Deck Class
