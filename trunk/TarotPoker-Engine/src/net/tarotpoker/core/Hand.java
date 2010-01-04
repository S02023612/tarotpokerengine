package net.tarotpoker.core;

import net.tarotpoker.core.card.ICard;

public class Hand {


	private ICard[] hand = new ICard[5];
	private int handsize = 0;

	public Hand() {
	}

	/**
	 * Take a card into the hand. If the hand is full, an exception is thrown
	 */
	public void addCard(ICard card) {
		if (handsize == 5) {
			throw new TPRuntimeException("Attempt to add card to full hand");
		}

		for (int x = 0;; x++) {
			if (hand[x] == null) {
				hand[x] = card;
				handsize++;
			}
		}
	}

	
	public int getHandValue() {
		return 0;
	}
}
