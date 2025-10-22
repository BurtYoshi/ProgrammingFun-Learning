import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
/* Future Features:
general rules such as ace cards being either 11 or 1 depending on whether hand total is above 21
Draws cards for the user when prompted but draws all of the computer's cards when user choice time is over */
//Figure out how to score the cards, use index number maybe? */
public class BlackJack {
        //Set up for creation of player and computer's hands
    public static void main(String[] args) {
        //creation of the arrays for the deck, need to change these to lists later
        ArrayList<String> suit = new ArrayList<>(Arrays.asList("Diamonds", "Hearts", "Clubs", "Spades"));
        ArrayList<String> rank = new ArrayList<>(Arrays.asList("Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"));
        ArrayList<String> deck = new ArrayList<>();
        for (String suits : suit) {
            for (String ranks : rank) {
                deck.add(ranks + " of " + suits);
                //System.out.println(ranks + " of " + suits);
            }
        }
        //Set up for creation of the player and computer's hands
        Random CardDrawer = new Random();
        ArrayList<String> PlayerHand = new ArrayList<>();
        ArrayList<String> ComputerHand = new ArrayList<>();
        int RandomIndex;
        String DrawnCard;
        //Creation of player and computer hand, going to be changed, this is just to make sure drawing is correct
        for (int i = 0; i < 5; i++) {
            RandomIndex = CardDrawer.nextInt(deck.size());
            DrawnCard = deck.remove(RandomIndex);
            PlayerHand.add(DrawnCard);
        }
        for (int i = 0; i < 5; i++) {
            RandomIndex = CardDrawer.nextInt(deck.size());
            DrawnCard = deck.remove(RandomIndex);
            ComputerHand.add(DrawnCard);
        }
        System.out.println("Computer's current hand: " + ComputerHand);
        System.out.println("Player's current hand: " + PlayerHand);
        System.out.println("Computer's current hand: " + ComputerHand);
        System.out.println("Player's current hand: " + PlayerHand);
    }
}