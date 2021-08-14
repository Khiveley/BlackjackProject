package com.skilldistillery.blackjack.entities;

public class Player {

	protected BlackjackHand playerBlackjackHand = new BlackjackHand();
	
	public Player(BlackjackHand playerBlackjackHand) {
		super();
		this.playerBlackjackHand = playerBlackjackHand;
	}
	public Player() {
	
	}
	public void AddCardToPlayerHands(Card addCard) {
		playerBlackjackHand.addCard(addCard);
	}
	@Override
	public String toString() {
		return "Player [playerBlackjackHand=" + playerBlackjackHand + "]";
	}
	
	
}

	//private double chipStack;
	//placeBet();
//	From chipStack decrement an amount (Bet) being at least the table minimum and x as a table maximum.
	//If hand loses, the Bet is placed in the dealerChipStack. If won, the chipStack is increased by amount won. 
	//determine after a working game!
	

	

