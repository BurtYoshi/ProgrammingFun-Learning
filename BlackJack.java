import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
//Figure out how to score the cards, separate method for scoring the cards
public class BlackJack {
    public static void main(String[] args) {
        //Creation of arraylists for the deck
        ArrayList<String> suit = new ArrayList<>(Arrays.asList("Diamonds", "Hearts", "Clubs", "Spades"));
        ArrayList<String> rank = new ArrayList<>(Arrays.asList("Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"));
        ArrayList<String> deck = new ArrayList<>();
        //True creation of the deck
        for (String suits : suit) {
            for (String ranks : rank) {
                deck.add(ranks + " of " + suits);
            }
        }
        //Set up for creation of player and computer's hands
        Random CardDrawer = new Random();
        ArrayList<String> PlayerHand = new ArrayList<>();
        ArrayList<String> ComputerHand = new ArrayList<>();
        int RandomIndex;
        String DrawnCard;
        //True start of the game
    }
}