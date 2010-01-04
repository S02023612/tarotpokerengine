package net.tarotpoker.core;

public class HandValue {

	/*
	 * Order of hands. Like in ICard, this used to be an enum. However, for
	 * efficiency and the ability to inline, this was turned into final int.
	 */
	public static final int H_VOID = 0;
	public static final int H_HIGH = 1;
	public static final int H_PAIR = 2;
	public static final int H_2PAIR = 3;
	public static final int H_RAINBOW = 4;
	public static final int H_THREE = 5;
	public static final int H_STRAIGHT = 6;
	public static final int H_FULL = 7;
	public static final int H_FLUSH = 8;
	public static final int H_FOUR = 9;
	public static final int H_STRFLUSH = 10;
	public static final int H_FIVE = 11;


}
