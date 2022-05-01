package ch.team7.game;

import java.util.ArrayList;
import java.util.Random;

import ch.team7.model.Card;

public class game {

	private ArrayList<Card> deckList;
	private ArrayList<Card> myCards;
	private ArrayList<Card> opCards;
	
	// BITTE AB HIE @ANDREA
	public void shuffle() {
		ArrayList<Card>tempDeck = new ArrayList<Card>();
		Random random = new Random();
		int randomCardIndex = 0;
		int originalSize = this.myCards.size();
		for(int i = 0; i < originalSize; i++) {
			//generate random index ---> rand.nextInt((max - min) + 1) + min;
			randomCardIndex = random.nextInt((this.myCards.size()-1 - 0) +1) + 0;
			tempDeck.add(this.myCards.get(randomCardIndex));
			//remove from original deck
			this.myCards.remove(randomCardIndex);
		}
	
		this.myCards = tempDeck;
	
	}
	
	public String toString() {
		String cardListOutput = "";
		int i = 0;
		for(Card aCard : this.myCards) {
			cardListOutput += "\n" + i + "-" + aCard.toString();
			i++;
		}
		return cardListOutput;
	
	}
	
	
	
	
	
	//BIS HIE DAMITS KEI PROBLEM GIT BI AU A DERE KLASS DRANNE IG DUE DE AB HIE
	
	
}
