package com.skilldistillery.blackjack.app;

//import com.skilldistillery.blackjack.entities.BlackjackHand;
import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Player;

public class BlackjackApp {
	Player tablePlayer = new Player();
	Dealer tableDealer = new Dealer(tablePlayer);

	public static void main(String[] args) {

		BlackjackApp blackjackapp = new BlackjackApp();
		blackjackapp.run();
		blackjackapp.goodbye();

	}

	public void run() {
		tableDealer.getNewDeck();
		tableDealer.topCardDeal();
		tableDealer.secondCardDeal();
		tableDealer.blackjackCheck();
		tableDealer.playerHitOrStay();
		tableDealer.playerBustCheck();
		tableDealer.dealerHitOrStay();
		tableDealer.declareWinner();
	}

	public void goodbye() {
		System.out.println("---------------------------------------------");
		System.out.println("Thank you for playing Blackjack. We hope you'll play again soon!");
	}
}
