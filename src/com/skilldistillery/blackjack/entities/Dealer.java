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
		System.out.println("Your total is: " + player1Hand.getHandValue());
		System.out.println("---------------------------------------------");
		dealerHand.addCard(gameDeck.dealCard());
		System.out.println("Dealer has the " + this.dealerHand.getHand().get(1) + " showing. ");

	}

	public void blackjackCheck() {
			if (dealerHand.getHandValue() == 21 && player1Hand.getHandValue() < 21) {
				System.out.println("The dealer wins.");

			}
	}
public void playerHitOrStay() {
		
		boolean playerContinue = true; 
			Scanner keyboard = new Scanner(System.in);
			while(playerContinue && player1Hand.getHandValue() < 21) {
					System.out.println("Would you like to hit ? Enter Yes or No.");
					String playersChoice = keyboard.nextLine();
					if (playersChoice.equalsIgnoreCase("Yes")) {
						Card card = gameDeck.dealCard();
						player1Hand.addCard(card);
					System.out.println("The dealer has dealt you a: " + card);
					System.out.println("Your total is: " + player1Hand.getHandValue());
						playerContinue = true;
					} else if (playerBlackjackHand.isBust()) {
						System.out.println("You bust.  The dealer wins!");
						playerContinue = false;
					} else {
						keyboard.close();
						playerContinue = false;
						
					}

				}
			}

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
			} else if (dealerHand.isBust()) {
				System.out.println("The Dealer's total is :" + dealerHand.getHandValue());
				System.out.println("The dealer busts!  You win!");
				keepGoing = false;
			} else {
				keepGoing = false;
				System.out.println("The Dealer's total is :" + dealerHand.getHandValue());
				System.out.println("The Dealer stays.");
			}
		}
	}
public void declareWinner() {
	int playerValue = player1Hand.getHandValue();
	int dealerValue = dealerHand.getHandValue();
	if (playerValue > dealerValue && playerValue < 22 && playerValue != dealerValue) {
		System.out.println("You win!");
	}
	else if (dealerValue > playerValue && dealerValue < 22 && dealerValue != playerValue) {
		System.out.println("Dealer win!");
		System.out.println("Thanks for playing Blackjack.");
	}
}
	@Override
	public String toString() {
		return ("Dealer has" + dealerHand.getHand());
	}

}
