package BlackJack;

import java.util.ArrayList;
import java.util.Collections;

import BlackJackBase.PCard;
import BlackJackBase.PDeck;

public class BJDeck implements PDeck {

    private ArrayList<BJCard> cards;
    

    //basically just iterates through a list to go 14x4
    public BJDeck() {
        this.cards = new ArrayList<BJCard>();
        for (int i = 1; i <= 14; i++) {
            for (int j = 1; j <= 4; j++) {
                BJCard card = new BJCard(i, j);
                this.cards.add(card);
            }
        }
        
    }


    @Override
    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    @Override
    public void addCard(PCard card) {
        this.cards.add((BJCard) card);
    }

    @Override
    public PCard dealCard() {
        if (this.cards.isEmpty()) {
            return null;
        } else {
            return this.cards.remove(this.cards.size() - 1);
        }
    }

    @Override
    public PCard dealHiddenCard() {
        if (this.cards.isEmpty()) {
            return null;
        } else {
            BJCard card = this.cards.remove(this.cards.size() - 1);
            card.hideCard();
            return card;
        }
    }

    @Override
    public int cardCount() {
        return this.cards.size();
    }
}