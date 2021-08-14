package com.skilldistillery.blackjack.entities;

public class Player {

	private Hand hand;
//Player has-a blackjackHand
//	private BlackjackHand playerBlackjackHand;
	
	public Player(BlackjackHand blackjackhand) {
		super();
//		BlackjackHand playerBlackjackHand;
//		this.playerBlackjackHand = blackjackhand;
		
//		playerBlackjackHand = new BlackjackHand();
	}
	public Player() {
	
	}
	@Override
	public String toString() {
		return "Player [blackjackhand=" + hand + "]";
	}
	
}

	//private double chipStack;
	//placeBet();
//	From chipStack decrement an amount (Bet) being at least the table minimum and x as a table maximum.
	//If hand loses, the Bet is placed in the dealerChipStack. If won, the chipStack is increased by amount won. 
	//determine after a working game!
	
	//private splitHand() {
		//or would this be a subroutine of hand? ie when have two Aces or two 8s?
	//System.out.println(Dealer: "You have two Aces? Would you like to split?);
	//System.out.println(Dealer: "You have two 8s? Would you like to split?);
	

