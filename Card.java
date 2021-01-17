//package com.bham.pij.assignments.pontoon;

//Charalampos 2165173

import java.util.ArrayList;

/* this class represent's a single card */

public class Card {

	// variable suit for a card
	public Suit suit;

	// variable value for a card
	public Value value;

	// a group of suits
	public enum Suit {

		CLUBS, HEARTS, DIAMONDS, SPADES

	};

	// a group of values
	public enum Value {

		ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN,
		EIGHT, NINE, TEN, JACK, QUEEN, KING
	};

	// constructor receive suit, value as parameters
	public Card(Suit s, Value v)
	{
		suit = s;
		value = v;
	}

	// returns card's suit
	public Suit getSuit()
	{
		return suit;
	}

	//return's card's value
	public Value getValue()
	{
		return value;
	}

	// set card a suit
	public void setSuit(Suit s)
	{
		suit = s;
	}

	// set card a value
	public void setValue(Value v)
	{
		value = v;
	}



	/* return's an arraylist of numerical values 
	 * of a card's value */ 
	public ArrayList<Integer> getNumericalValue()
	{	
		ArrayList<Integer> cardValue = new ArrayList<Integer>();

		if(value.equals(Value.TWO))
		{
			cardValue.add(2);
			return cardValue;
		}

		if(value.equals(Value.THREE))
		{
			cardValue.add(3);
			return cardValue;
		}

		if(value.equals(Value.FOUR))
		{
			cardValue.add(4);
			return cardValue;
		}

		if(value.equals(Value.FIVE))
		{
			cardValue.add(5);
			return cardValue;
		}

		if(value.equals(Value.SIX))
		{
			cardValue.add(6);
			return cardValue;
		}

		if(value.equals(Value.SEVEN))
		{
			cardValue.add(7);
			return cardValue;
		}

		if(value.equals(Value.EIGHT))
		{
			cardValue.add(8);
			return cardValue;
		}

		if(value.equals(Value.NINE))
		{
			cardValue.add(9);
			return cardValue;
		}

		if(value.equals(Value.TEN))
		{
			cardValue.add(10);
			return cardValue;
		}

		if(value.equals(Value.JACK) || value.equals(Value.QUEEN)
				|| value.equals(Value.KING))
		{
			cardValue.add(10);
			return cardValue;
		}

		if(value.equals(Value.ACE))
		{
			cardValue.add(1);
			cardValue.add(11);
			return cardValue;
		}

		return cardValue;
	}
}




