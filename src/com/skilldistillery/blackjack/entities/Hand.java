package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	
	protected List<Card> cards;
	
	public Hand() {
		cards = new ArrayList<Card>();
	}
	
	public void addCard(Card card) {
		cards.add(card);
	}

	{
	}

	public abstract int getHandValue();
	
public List <Card> getHand(){
	return cards;
	}

@Override
public String toString() {
	return cards.toString();
}

}
