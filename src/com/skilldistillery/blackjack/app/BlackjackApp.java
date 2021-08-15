package com.skilldistillery.blackjack.app;

import com.skilldistillery.blackjack.entities.BlackjackHand;
import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Player;

public class BlackjackApp {
	Player tablePlayer = new Player();
	Dealer tableDealer = new Dealer();
	BlackjackHand tableHand = new BlackjackHand();

	public static void main(String[] args) {

		BlackjackApp blackjackapp = new BlackjackApp();
		blackjackapp.run();

	}

	public void run() {
		tableDealer.topCardDeal();
		tableDealer.secondCardDeal();
		tableHand.isBlackjack();
		
		// I need a Dealer - hand and deck
		// I need a Player - hand only
		// Determine the rules of the game.
//	System.out.println("\u2665 This should be a Hearts suit symbol.");
//    System.out.println("\u2666 This should be a Diamonds suit symbol.");
//    System.out.println("\u2663 This should be a Clubs suit symbol.");
//    System.out.println("\u2660 This should be a Spades suit symbol.");

	}
}
