import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/* Future Features: (all updates are kind of on pause until I learn more about lists/arrays)
Randomize the human and player cards
general rules such as ace cards being either 11 or 1 depending on whether hand total is above 21
Draws cards for the user when prompted but draws all of the computer's cards when user choice time is over */
class BlackJack {
    public static void main(String[] args) {
        //creation of the  arrays for the deck
        String [] suits = {"Hearts", "Clubs", "Diamonds", "Spades"};
        String [] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String [] deck = new String[suits.length*ranks.length];
        int index = 0;
        //actual creation of the deck
        for (String suit : suits)  {
            for (String rank : ranks) {
                deck[index] = rank + " of " + suit;
                //System.out.println(rank + " of " + suit); //Test to make sure loop works properly
                index++;
            }
        }
        Random CardDrawer = new Random();
        //Creation of the player's and computer's hand
        ArrayList<String> UserHand = new ArrayList<>();
        UserHand.add(CardDrawer.nextInt(53));
        System.out.println();

        String [] userhand = new String[5];
        String [] computerhand = new String[5];

        //Code to test if the array is working properly
        String UserCard1 = deck[CardDrawer.nextInt(53)];
        String ComputerCard1 = deck[CardDrawer.nextInt(53)];
        System.out.println(UserCard1);
        System.out.println(ComputerCard1);
    }
}