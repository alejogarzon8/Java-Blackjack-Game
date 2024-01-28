package BlackJack;


import java.awt.Color;

import BlackJackBase.PGame;
import BlackJackTest.DeckTest;


public class PlayBlackJack {
    public static void main(String[] args) {
        BJDeck deck = new BJDeck();
//        DeckTest.run(deck);
        

        BJHand KoopsCards = new BJHand();
        
        
        
        BJHand KoopsDealer = new BJHand();

        PGame game = PGame.run(deck,KoopsDealer,KoopsCards);

        game.setBackground(Color.BLACK);
		game.setBannerColor(Color.GRAY);
		game.setBannerTextColor(Color.WHITE);
		game.setStatusTextColor(Color.WHITE);
		game.setButtonColor(Color.ORANGE);
		game.setButtonHighlightColor(Color.ORANGE);
		game.setButtonTextColor(Color.BLACK);

		game.setFont("Times New Roman");


    }

}