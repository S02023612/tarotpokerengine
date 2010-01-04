package net.tarotpoker.core;

import java.util.Random;

import net.tarotpoker.core.card.ICard;
import net.tarotpoker.core.card.SimpleCard;

public class Deck {

	private static final int DECKSIZE = 65;

	/*
	 * The prototype deck of cards. Since cards never change (only their order),
	 * the cards are created once and kept here. We want to support multiple
	 * concurrent games, so we use the protodeck to feed the various decks.
	 */
	private static final ICard[] PROTODECK = new ICard[DECKSIZE];

	/*
	 * The shuffled deck of cards, built from the protodeck.
	 */
	private final ICard[] deck = new ICard[DECKSIZE];

	/*
	 * The last card in the deck, by index
	 */
	private int deckend = DECKSIZE;

	private final Random random = new Random();
	
	static {
		buildDeck();
	}

	public Deck() {
		System.arraycopy(PROTODECK, 0, deck, 0, DECKSIZE);
	}

	private static void buildDeck() {
		int index = 0;
		for (int suit = ICard.S_CUPS; suit <= ICard.S_TRUMPS; suit++) {
			for (int rank = ICard.R_2; rank <= ICard.R_A; rank++) {
				PROTODECK[index++] = new SimpleCard(rank, suit);
			}
		}
	}
	
	/**
	 * Mostly used for debugging/testing purposes.  This will return the
	 * card at position "index".
	 * @param index
	 */
	public ICard cardAt(int index) {
		return deck[index];
	}
	
	/**
	 * Deals one card from the deck.  Once dealt, it is effectively removed
	 * from the deck.
	 */
	public ICard deal() {
		int chosenIndex = random.nextInt(deckend--);
		ICard chosenCard = deck[chosenIndex];		
		deck[chosenIndex] = deck[deckend];
		
		return chosenCard;
	}

}
