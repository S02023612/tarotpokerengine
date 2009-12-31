package net.tarotpoker.core;

public class SimpleCard implements ICard {

	private int rank;
	private int suit;

	public SimpleCard(int rank, int suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	@Override
	public int getRank(Hand hand) {
		return rank;
	}
	
	@Override
	public int getSuit(Hand hand) {
		return suit;
	}
	
	
}
