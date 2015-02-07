package chibill.additionaloreingots.common;

public enum Type {
	BLOCK("block"),
	ORE("ore"),
	COMPRESSED("block"),
	MECHINE("mechine"),
	ITEM("item"),
	DUST("dust"),
	PILE("pile"),
	INGOT("ingot"),
	NUGGET("nugget");
	
	private final String stringValue;
	private Type(final String s) { stringValue = s; }
	public String toString() { return stringValue; }
}