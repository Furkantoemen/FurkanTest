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
		int originalSize = this.deckList.size();
		for(int i = 0; i < originalSize; i++) {
			//generate random index ---> rand.nextInt((max - min) + 1) + min;
			randomCardIndex = random.nextInt((this.deckList.size()-1 - 0) +1) + 0;
			tempDeck.add(this.deckList.get(randomCardIndex));
			//remove from original deck
			this.deckList.remove(randomCardIndex);
		}
	
		this.deckList = tempDeck;
	
	}
	//Karten anzeigen
	public String toString() {
		String cardListOutput = "";
		for(Card aCard : this.deckList) {
			cardListOutput += "\n" + aCard.toString();
		}
		return cardListOutput;
	
	}
	
	public void removeCard (int i) {
		this.deckList.remove(i);
	}
	
	public Card getCard (int i) {
		return this.deckList.get(i);
	}
	
	public void addCard(Card addCard) {
		this.deckList.add(addCard);
	}
	
	//draws from the deck
	public void draw(game comingFrom) {
		this.deckList.add(getCard(0));
		comingFrom.removeCard(0);
	}
	
		
	
	
	
	//BIS HIE DAMITS KEI PROBLEM GIT BI AU A DERE KLASS DRANNE IG DUE DE AB HIE
	
	public void createFullDeck() {
	// TODO Auto-generated method stub
	}

}
