package com.skilldistillery.blackjack.entities;

import java.util.Scanner;
import java.util.List;

public class Dealer extends Player {

//ask player to hit or stay
//compare values of dealer cards against player cards
//reshuffle

//private Dealer dealer1;
	private Player player1;
	private Deck gameDeck;
	private BlackjackHand dealerHand;
	private BlackjackHand player1Hand;
	private List<Card> usedCards;

	public Dealer(Player player1) {
//	this.dealer1 = new Dealer();
		this.player1 = player1;
		this.player1Hand = player1.getPlayerBlackjackHand();
		this.gameDeck = new Deck();
		this.dealerHand = new BlackjackHand();
	}

	public void getNewDeck() {
		gameDeck.shuffle();
	}

	public void topCardDeal() {
		Card card = gameDeck.dealCard();
		System.out.println("The dealer has dealt you a: " + card);
		player1Hand.addCard(card);
		dealerHand.addCard(gameDeck.dealCard());
	}

	public void secondCardDeal() {
		Card card = gameDeck.dealCard();
		System.out.println("The dealer has dealt you a: " + card);
		player1Hand.addCard(card);
		System.out.println(player1Hand.getHandValue());
		dealerHand.addCard(gameDeck.dealCard());
		System.out.println("Dealer has " + this.dealerHand.getHand().get(1) + " showing. ");

	}
//	public void playerHitOrStay() {
//		boolean KeepGoing = true;
//		for (Card card : player1Hand.getHand())
//			System.out.println(card);
//		while(keepGoing) {
			
//		}
//	}

	public void dealerHitOrStay() {
		boolean keepGoing = true;
		for (Card card : dealerHand.getHand())
			System.out.println(card);
		while (keepGoing) {
			if (dealerHand.getHandValue() < 17) {
				Card card = gameDeck.dealCard();
				dealerHand.addCard(card);
				System.out.println("The Dealers has to hit. He dealt a " + card);
				System.out.println("The Dealer's total is :" + dealerHand.getHandValue());
			}
			else if (dealerHand.isBust()){
				System.out.println("The Dealer's total is :" + dealerHand.getHandValue());
				System.out.println("The dealer busts!  You win!");
				keepGoing = false;
			}
			else {
				keepGoing = false;
				System.out.println("The Dealer's total is :" + dealerHand.getHandValue());
				System.out.println("The Dealer stays.");
			}
		}
	}

	@Override
	public String toString() {
		return ("Dealer has" + dealerHand.getHand());
	}

}
