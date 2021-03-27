public class Pontoon extends CardGame 
{


	public Pontoon (int nplayers)
	{

		super(nplayers);

		this.newDeck = new Deck();

		this.nplayers = nplayers; 	

	}


	/* This method deals the number of initial
	 *  cards to each player in the game.
	 */
	public void dealInitialCards()
	{

		for (int i = 0; i < 2; i++)
		{
			for (int j = 0; j < 2; j++)
			{
				players.get(j).dealToPlayer(newDeck.dealRandomCard());
			}
		}

	}


	/* This method compares the hands of two players. 
	 * If hand1 is better than hand2 the method should
	 * return -1. If hand2 is better than hand1 the method 
	 * should return +1. If the two hands are equal then the 
	 * method should return 0.
	 */
	public int compareHands(Player hand1, Player hand2)
	{
		int rank = 0;
		Pontoon p = new Pontoon(2);


		if (p.isPontoon(hand1) && p.isPontoon(hand2))
			return 0;

		if (p.isPontoon(hand1) && p.isFiveCardTrick(hand2))
			return 1;

		if (p.isFiveCardTrick(hand1) && p.isPontoon(hand2))
			return -1;

		if (p.isFiveCardTrick(hand1) && p.isFiveCardTrick(hand2))
			return 0;

		return rank;
	}

	public boolean isPontoon(Player hand)
	{		

		if (hand.getHandSize() == 2 && hand.getBestNumericalHandValue() == 21)
			return true;
		else
			return false;	
	}

	public boolean isFiveCardTrick(Player hand)
	{
		if (hand.getHandSize() == 5 && hand.getBestNumericalHandValue() == 21)
			return true;
		else
			return false;
	}
}
	
	

	
	

