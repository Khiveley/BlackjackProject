package com.skilldistillery.blackjack.app;

import com.skilldistillery.blackjack.entities.BlackjackHand;
import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Player;

public class BlackjackApp {
	Player tablePlayer = new Player();
	Dealer tableDealer = new Dealer(tablePlayer);

	public static void main(String[] args) {

		BlackjackApp blackjackapp = new BlackjackApp();
		blackjackapp.run();

	}

	public void run() {
		tableDealer.getNewDeck();
		tableDealer.topCardDeal();
		tableDealer.secondCardDeal();
//		tablePlayer.hitorstay
		tableDealer.dealerHitOrStay();
		
	
//	System.out.println("\u2665 This should be a Hearts suit symbol.");
//    System.out.println("\u2666 This should be a Diamonds suit symbol.");
//    System.out.println("\u2663 This should be a Clubs suit symbol.");
//    System.out.println("\u2660 This should be a Spades suit symbol.");

	}
}
