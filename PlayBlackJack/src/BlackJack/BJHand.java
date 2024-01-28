package BlackJack;

import java.util.ArrayList;

import BlackJackBase.PCard;
import BlackJackBase.PHand;

public class BJHand implements PHand {

    private ArrayList<PCard> cards;

    public BJHand() {
        this.cards = new ArrayList<PCard>();
    }

    public void clear() {
        this.cards.clear();
    }

    @Override
    public void addCard(PCard card) {
        this.cards.add(card);
    }

    @Override
    public PCard getCard(int index) {
        return this.cards.get(index);
    }


    @Override
    public int getSize() {
        return this.cards.size();
    }

    @Override
    public PCard removeCard(int index) {
        if (index < 0 || index >= this.cards.size()) {
            return null;
        } else {
            return this.cards.remove(index);
        }
    }

    @Override
    public int getValue() {
        int total = 0;
        int aceCount = 0;
        for (PCard card : this.cards) {
            if (card instanceof BJCard) {
                BJCard bjCard = (BJCard) card;
                int rank = bjCard.getRank();
                if (rank == 1) {
                    aceCount++;
                    total += 11;
                } else if (rank >= 10) {
                    total += 10;
                } else {
                    total += rank;
                }
            }
        }
        while (total > 21 && aceCount > 0) {
            total -= 10;
            aceCount--;
        }
        return total;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (PCard card : this.cards) {
            sb.append(card.getText()).append("");
        }
        return sb.toString();
    }
}