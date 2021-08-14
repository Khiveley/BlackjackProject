package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {

	protected List<Card> cards = new ArrayList<Card>();

	public void addCard(Card card) {
		cards.add(card);
	}

	public void clearHand() {
		cards = new ArrayList<Card>();
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
