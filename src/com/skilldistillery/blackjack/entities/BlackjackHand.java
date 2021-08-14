package com.skilldistillery.blackjack.entities;

public class BlackjackHand extends Hand {

	public BlackjackHand() {
		BlackjackHand blackjackhand = new BlackjackHand();
	}
	public int getHandValue() {
		int counter = 0;
		for(Card card: cards){
				counter += card.getValue();
			}
		return counter;
	}
	public boolean isBlackjack() {
		if(getHandValue() == 21 && cards.size()== 2) {
			System.out.println("That's a Blackjack!");
			return true;
		}
		return false;
	}
	public boolean isBust() {
		if(getHandValue() > 21) {
			System.out.println("That's a bust.");
			return true;
		}
		return false;
	}
}
