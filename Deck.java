import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	public ArrayList<Card> cards = new ArrayList<Card>();

	public Deck() 
	{	
		
		this.cards = new ArrayList<Card>();	
		
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 13; j++)
			{
				this.cards.add(new Card(Card.Suit.values()[i], Card.Value.values()[j]));
			}
		}
	}
	
	//Use to print out deck
	public String toString(){
		String cardListOutput = "";
		int i = 0;
		for(Card aCard : this.cards)
		{
			cardListOutput += "\n" + i + "-" +  aCard.getValue() + "-" + aCard.getSuit();
			i++;
		}
		return cardListOutput;
	}
	
	
	/* This method re-creates a full deck of cards in an 
	 * existing deck. This method will always result in the
	 * creation of 52 distinct cards in the deck. */

	public void reset() 
	{

		
	this.cards = new ArrayList<Card>();	

		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 13; j++)
			{
				this.cards.add(new Card(Card.Suit.values()[i], Card.Value.values()[j]));
			}
		}
	}

	public void shuffle() 
	{
		Collections.shuffle(cards);
	}

	
	// This method returns the card at the given index.
	public Card getCard(int i)
	{
		return this.cards.get(i);
	}

	
	/* This method deals a random card. A random card should be
	 * selected from those remaining in the deck and returned. 
	 * The selected card should be removed from the deck. */
	public Card dealRandomCard()
	{
		Collections.shuffle(cards);
		Card cardDeal = cards.get(0);
		cards.remove(0);
		return cardDeal;
	}
	
	
	/* Returns the number of cards currently 
	in the deck. */
	public int size()
	{
		return this.cards.size();
	}
}
