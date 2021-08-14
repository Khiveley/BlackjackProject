package com.skilldistillery.blackjack.entities;

public class Dealer extends Player{

private Deck gameDeck = new Deck();

public void getNewDeck() {
	gameDeck.shuffle();
}

public void topCardDeal() {
	gameDeck.dealCard();
}
}
