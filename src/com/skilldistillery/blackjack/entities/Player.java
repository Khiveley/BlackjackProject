package com.skilldistillery.blackjack.entities;

import java.util.Scanner;

public class Player {

	protected BlackjackHand playerBlackjackHand;
	
	public Player() {
		this.playerBlackjackHand = new BlackjackHand();
	}
	
	

	
	public BlackjackHand getPlayerBlackjackHand() {
		return playerBlackjackHand;
	}

	public void setPlayerBlackjackHand(BlackjackHand playerBlackjackHand) {
		this.playerBlackjackHand = playerBlackjackHand;
	}

	public void AddCardToPlayerHands(Card addCard) {
		playerBlackjackHand.addCard(addCard);
	}
	@Override
	public String toString() {
		return ("Player has: " + playerBlackjackHand);
	}
	
	
}
