import java.util.ArrayList;
import java.util.Collections;

/* this class represent's the player's hand */
/* a hand is a collection of cards held by a player */


public class Player {
	

	// variable for player's name
	public String name;
	
	// represents the player's hand
	 ArrayList<Card> hand = new ArrayList<Card>();
	 
	// stores the player's name.
	public Player(String name) 
	{
		this.name = name;
	}

	// returns player's name
	public String getName()
	{
		return name;
	}

	// it adds a card to a player's hand
	public void dealToPlayer(Card card)
	{
		hand.add(card);
	}
	
	public String toString(){
		String cardListOutput = "";
		int i = 0;
		for(Card aCard : this.hand)
		{
			cardListOutput += "\n" + i + "-" +  aCard.getValue() + "-" + aCard.getSuit();
			i++;
		}
		return cardListOutput;
	}

	// removes a card from a player's hand.
	public void removeCard(Card card)
	{
		this.hand.remove(card);

	}

	/* This method returns all of the possible numerical 
	values of a hand */
	public ArrayList<Integer> getNumericalHandValue()
	{

		int sum = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		int sum5 = 0;
		int sum6 = 0;
		int aces = 0;
		
		ArrayList<Integer> HandList = new ArrayList<Integer>();

		for (Card cardHand : this.hand)
		{
			if (cardHand.getValue().equals(Card.Value.TWO))
				sum += 2;
			if (cardHand.getValue().equals(Card.Value.THREE))
				sum += 3;
			if (cardHand.getValue().equals(Card.Value.FOUR))
				sum += 4;
			if (cardHand.getValue().equals(Card.Value.FIVE))
				sum += 5;
			if (cardHand.getValue().equals(Card.Value.SIX))
				sum += 6;
			if (cardHand.getValue().equals(Card.Value.SEVEN))
				sum += 7;
			if (cardHand.getValue().equals(Card.Value.EIGHT))
				sum += 8;
			if (cardHand.getValue().equals(Card.Value.NINE))
				sum += 9;
			if (cardHand.getValue().equals(Card.Value.TEN))
				sum += 10;
			if (cardHand.getValue().equals(Card.Value.JACK))
				sum += 10;
			if (cardHand.getValue().equals(Card.Value.QUEEN))
				sum += 10;
			if (cardHand.getValue().equals(Card.Value.KING))
				sum += 10;
			if (cardHand.getValue().equals(Card.Value.ACE))
				aces++;

		}

		if (aces == 0)
		{
			HandList.add(sum);
			return HandList;
		}

		if (aces == 1)
		{
			sum2 = sum + 1;
			sum3 = sum + 11; 
			HandList.add(sum2);
			HandList.add(sum3);
			Collections.sort(HandList);
			return HandList;	

		}


		if (aces == 2)
		{
			sum2 = sum + 1 + 1;
			sum3 = sum + 1 + 11;
			sum4 = sum + 11 + 11;
			
			HandList.add(sum2);
			HandList.add(sum3);
			HandList.add(sum4);
			
			Collections.sort(HandList);
			return HandList;	
		}

		if (aces == 3)
		{
			sum2 = sum + 1 + 1 + 1;
			sum3 = sum + 1 + 1 + 11;
			sum4 = sum + 1 + 11 + 11;
			sum5 = sum + 11 + 11 + 11;
			
			HandList.add(sum2);
			HandList.add(sum3);
			HandList.add(sum4);
			HandList.add(sum5);
			Collections.sort(HandList);

			return HandList;
		}

		if (aces == 4)
		{
			sum2 = sum + 1 + 1 + 1 + 1;
			sum3 = sum + 1 + 1 + 1 + 11;
			sum4 = sum + 1 + 1 + 11 + 11;
			sum5 = sum + 1 + 11 + 11 + 11;
			sum6 = sum + 11 + 11 + 11 + 11;
			HandList.add(sum2);
			HandList.add(sum3);
			HandList.add(sum4);
			HandList.add(sum5);
			HandList.add(sum6);

			Collections.sort(HandList);

			return HandList;
		}
		
		return HandList;

	}
		
	/* returns the maximum numerical value of the 
  	player's hand of cards */
	public int getBestNumericalHandValue()
	{
		int BestHand;

		ArrayList<Integer> HandValue = new ArrayList<Integer>();
		
		HandValue = this.getNumericalHandValue();

		BestHand = Collections.max(HandValue);
		
		return BestHand;
	}
	
	// Returns the cards in the player's hand.
	public ArrayList<Card> getCards()
	{
		return this.hand;
	}

	/* Returns the number of cards in the 
    player's hand. */
	public int getHandSize()
	{
		return this.hand.size();
	}
}
