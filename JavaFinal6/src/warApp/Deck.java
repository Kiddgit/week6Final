package warApp;

import java.util.ArrayList; 
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards = new ArrayList<>();
	
	private static final String[] cardNums = {"2", "3", "4" ,"5" ,"6" ,"7" ,"8" ,"9" ,"10", "Jack", "Queen", "King", "Ace"};
	 private static final String[] cardNames = {"Spades", "Hearts", "Diamonds", "Clubs"};


public Deck() {
	for (int nameIndex = 0; nameIndex < cardNames.length; nameIndex++ ) {
		String cardNum = cardNames[nameIndex];
	
	
		for (int numIndex = 0; numIndex < cardNums.length; numIndex++) {
			String name = cardNums[numIndex];
			String cardName = name + "of" + cardNum;
			int value = numIndex + 2;
			
			cards.add(new Card(cardName, value));
		}
	}
}

public void shuffle() {
	Collections.shuffle(cards);
}

public Card draw() {
	return cards.remove(0);
	}
}