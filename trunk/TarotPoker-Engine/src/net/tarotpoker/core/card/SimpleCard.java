package net.tarotpoker.core.card;

import net.tarotpoker.core.Hand;

public class SimpleCard implements ICard {

	private int rank;
	private int suit;
	private String token;

	public SimpleCard(int rank, int suit) {
		this.rank = rank;
		this.suit = suit;
		String.format("%c%02d", SUIT_TOKEN.charAt(suit), rank);
	}
	
	@Override
	public String getToken() {
		return token;
	}

	@Override
	public int getRankValue(Hand hand) {
		return rank;
	}
	
	@Override
	public int getSuitValue(Hand hand) {
		return suit;
	}
}
