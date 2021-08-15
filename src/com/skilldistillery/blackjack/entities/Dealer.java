package com.skilldistillery.blackjack.entities;

public class Dealer extends Player{

private Dealer dealer1;
private Player player1;
private Deck gameDeck;
private Hand dealerHand;

public Dealer() {
	this.dealer1 = new Dealer();
	this.player1 = new Player();
	this.gameDeck = new Deck();
	this.dealerHand = new BlackjackHand();
}

public void getNewDeck() {
	gameDeck.shuffle();
}

public void topCardDeal() {
	gameDeck.dealCard();
	player1.AddCardToPlayerHands(gameDeck.dealCard());
	System.out.println(player1.toString());
	gameDeck.dealCard();
	dealer1.AddCardToPlayerHands(gameDeck.dealCard());
}
public void secondCardDeal() {
	gameDeck.dealCard();
	player1.AddCardToPlayerHands(gameDeck.dealCard());
	System.out.println(player1.toString());
	gameDeck.dealCard();
	dealer1.AddCardToPlayerHands(gameDeck.dealCard());
	System.out.println(dealer1.toString());
}

@Override
public String toString() {
	return ("Dealer has" + playerBlackjackHand);
}

}
