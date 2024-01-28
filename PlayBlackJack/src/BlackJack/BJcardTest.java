package BlackJack;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

import org.junit.jupiter.api.Test;

class BJcardTest {

	@Test
    void testHideCard() {
        BJCard card = new BJCard(BJCard.ACE, BJCard.SPADE);
        card.hideCard();
        assertTrue(card.isHidden());
    }

    @Test
    void testShowCard() {
        BJCard card = new BJCard(BJCard.ACE, BJCard.SPADE);
        card.hideCard();
        card.showCard();
        assertFalse(card.isHidden());
    }

    @Test
    void testIsHidden() {
        BJCard card = new BJCard(BJCard.ACE, BJCard.SPADE);
        assertFalse(card.isHidden());
        card.hideCard();
        assertTrue(card.isHidden());
    }

    @Test
    void testGetText() {
        BJCard card = new BJCard(BJCard.ACE, BJCard.SPADE);
        assertEquals("A♠", card.getText());
    }

    @Test
    void testGetFontColor() {
        BJCard spadeCard = new BJCard(BJCard.ACE, BJCard.SPADE);
        BJCard heartCard = new BJCard(BJCard.ACE, BJCard.HEART);

        assertEquals(Color.BLACK, spadeCard.getFontColor());
        assertEquals(Color.RED, heartCard.getFontColor());
    }

    @Test
    void testGetFaceColor() {
        BJCard spadeCard = new BJCard(BJCard.ACE, BJCard.SPADE);
        BJCard heartCard = new BJCard(BJCard.ACE, BJCard.HEART);

        assertEquals(Color.WHITE, spadeCard.getFaceColor());
        assertEquals(Color.WHITE, heartCard.getFaceColor());
    }

    @Test
    void testGetBackColor() {
        BJCard card = new BJCard(BJCard.ACE, BJCard.SPADE);
        assertEquals(Color.WHITE, card.getBackColor());
    }

    @Test
    void testGetBorderColor() {
        BJCard spadeCard = new BJCard(BJCard.ACE, BJCard.SPADE);
        BJCard heartCard = new BJCard(BJCard.ACE, BJCard.HEART);

        assertEquals(Color.BLACK, spadeCard.getBorderColor());
        assertEquals(Color.RED, heartCard.getBorderColor());
    }

    @Test
    void testGetStripeColor() {
        BJCard spadeCard = new BJCard(BJCard.ACE, BJCard.SPADE);
        BJCard heartCard = new BJCard(BJCard.ACE, BJCard.HEART);

        assertEquals(Color.BLACK, spadeCard.getStripeColor());
        assertEquals(Color.RED, heartCard.getStripeColor());
    }

    @Test
    void testBJcard() {
        BJCard card = new BJCard(BJCard.ACE, BJCard.SPADE);
        assertEquals(BJCard.ACE, card.getRank());
        assertEquals(BJCard.SPADE, card.getSuit());
        assertFalse(card.isHidden());
    }

    @Test
    void testGetRank() {
        BJCard card = new BJCard(BJCard.KING, BJCard.DIAMOND);
        assertEquals(BJCard.KING, card.getRank());
    }

    @Test
    void testSetRank() {
        BJCard card = new BJCard(BJCard.ACE, BJCard.SPADE);
        card.setRank(BJCard.KING);
        assertEquals(BJCard.KING, card.getRank());
    }

    @Test
    void testGetSuit() {
        BJCard card = new BJCard(BJCard.ACE, BJCard.SPADE);
        assertEquals(BJCard.SPADE, card.getSuit());
    }

    @Test
    void testSetSuit() {
        BJCard card = new BJCard(BJCard.ACE, BJCard.SPADE);
        card.setSuit(BJCard.HEART);
        assertEquals(BJCard.HEART, card.getSuit());
    }
}
