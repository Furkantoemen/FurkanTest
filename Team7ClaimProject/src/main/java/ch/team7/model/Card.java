package ch.team7.model;

public class Card {
	//@Autor Robin
	private Race race;
	private int value;
	
	public Card(Race race, int value) {
		this.race = race;
		this.value = value;
	}

	public Race getRace() {
		return race;
	}

	public void setRace(Race race) {
		this.race = race;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	


}
