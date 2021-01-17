//package com.bham.pij.assignments.pontoon;

//Charalampos 2165173

import java.util.ArrayList;

/* This is an abstract class that will be used as the base 
 * class for other card game classes.
 */

public abstract class CardGame 
{
	public Player player1;
	public Player player2;	
	public Deck newDeck;
	protected ArrayList<Player> players;
	protected int nplayers;
	/* This constructor creates the deck and sets the number of 
	 * players for this game.
	 */
	public CardGame(int nplayers)
	{
		
		this.newDeck = new Deck();	
		this.nplayers = nplayers;
		
		this.players = new ArrayList<Player>();
		
		for(int i = 0; i < nplayers; i++)
		{
			players.add(new Player("Players"));
		}

	}

	/* This abstract method deals the number of initial cards to 
	 * each player in the game.
	 */
	public abstract void dealInitialCards();

	// This abstract method compares the hands of two players.
	public abstract int compareHands(Player hand1, Player hand2);

	// returns the deck.
	public Deck getDeck()
	{
		return newDeck;	
	}

	/* This method gets the player at the index. This method 
	 * assumes you have added the correct number of 
	 * players to the game.
	 */
	public Player getPlayer(int i)
	{
		ArrayList<Player> players = new ArrayList<Player>();
		Player player1 = new Player("Player_1");
		Player player2 = new Player("Player_2");
		
		players.add(player1);
		players.add(player2);
		
		return players.get(i);
	}

	// gets the number of players in the game.
	public int getNumPlayers()
	{
		int x = 0;
		for (int i = 0; i < players.size(); i++)
		{
			x += i;
		}
		return x;
	}
}