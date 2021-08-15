package com.skilldistillery.blackjack.entities;

import java.util.List;

public class Dealer extends Player{
//Dealer responsibilities are to shuffle, 
//deal a card up to a player
//deal card down to self
//deal card up to player
//deal card up to self
//ask player to hit or stay
//compare values of dealer cards against player cards
//reshuffle
	
//private Dealer dealer1;
private Player player1;
private Deck gameDeck;
private Hand dealerHand;
private Hand player1Hand;
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
//public boolean hitOrStay() {
//	
//}

@Override
public String toString() {
	return ("Dealer has" + dealerHand.getHand());
}

}
