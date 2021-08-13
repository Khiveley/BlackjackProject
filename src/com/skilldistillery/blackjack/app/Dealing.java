package com.skilldistillery.blackjack.app;

import java.util.Scanner;

import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Deck;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Dealing {

	public static void main(String[] args) {
		Dealing handDealt = new Dealing();
		handDealt.run();

	}

	public void run() {
		Deck deck = new Deck();

		Scanner keyboard = new Scanner(System.in);
		boolean ValidInput = false;
		while (!ValidInput) {
			System.out.println("How many cards would you like?");
			try {
				int numberOfCards = keyboard.nextInt();
				keyboard.nextLine();
				if (numberOfCards > 52) {
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter a numerical value less than 52.");
				keyboard.nextLine();
			}
		}
		List<Card> hand = new ArrayList<>();
		int numberOfCards;
		for (int numberOfCardsRequested = 0; numberOfCardsRequested < numberOfCards; numberOfCardsRequested++) {
			hand.add(deck.dealCard());
		}
		for (Card card : hand) {
			System.out.println(card);
		}
	}
}
