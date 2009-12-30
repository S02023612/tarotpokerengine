package net.tarotpoker.core;

public interface ICard {
	/*
	 * The first iteration of this class used enums.  I shied away from enums at the end
	 * for performance reasons for embedded devices.  Enums, while snazzy and cool, can
	 * be expensive, especially for the ordinal lookups that we'll be doing.
	 */
	
	// SUITS
	public static final int S_NONE = 0;
	public static final int S_CUPS = 1;
	public static final int S_WANDS = 2;
	public static final int S_PENTS = 3;
	public static final int S_SWORDS = 4;
	public static final int S_TRUMPS = 5;
	
	// RANKS
	public static final int R_WILD = -1;
	public static final int R_NULL = 0;
	public static final int R_BUG = 1;
	public static final int R_2 = 2;
	public static final int R_3 = 3;
	public static final int R_4 = 4;
	public static final int R_5 = 5;
	public static final int R_6 = 6;
	public static final int R_7 = 7;
	public static final int R_8 = 8;
	public static final int R_9 = 9;
	public static final int R_10 = 10;
	public static final int R_J = 11;
	public static final int R_Q = 12;
	public static final int R_K = 13;
	public static final int R_A = 14;

	
	
	public enum Suit {
		S_CUPS, S_SWORDS, S_WANDS, S_PENTS, S_NONE;
	}
	
	public enum Rank {
		
	}
}
