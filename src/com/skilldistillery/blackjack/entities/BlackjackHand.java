package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public class BlackjackHand extends Hand {

	private List<Card> blackjackCards;

	public BlackjackHand() {
		this.blackjackCards = new ArrayList<Card>();
	}

	public int getHandValue() {
		int counter = 0;
		for (Card card : cards) {
			counter += card.getValue();
		}
		return counter;
	}

	public boolean isBlackjack() {
		if (getHandValue() == 21 && cards.size() == 2) {
			System.out.println("That's a Blackjack!");
			return true;
		}
		return false;
	}

	public boolean isBust() {
		if (getHandValue() > 21) {
			System.out.println("That's a bust." );
			return true;
		}
		return false;
	}
	
}
