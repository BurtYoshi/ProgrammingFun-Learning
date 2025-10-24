import java.util.*; //Simplifies 4 imports into 1 import

public class BlackJack {
    //Set up for creation of player and computer's hands
    public static void main(String[] args) {
        //creation of the arrays for the deck
        ArrayList<String> suit = new ArrayList<>(Arrays.asList("Diamonds", "Hearts", "Clubs", "Spades"));
        ArrayList<String> rank = new ArrayList<>(Arrays.asList("Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"));
        ArrayList<String> deck = new ArrayList<>();
        String UserInput;
        boolean PlayerDrawing = true;
        boolean ComputerDraw = true;
        boolean Endgame = true;
        Scanner InputReader = new Scanner(System.in);

        for (String suits : suit) {
            for (String ranks : rank) {
                deck.add(ranks + " of " + suits);
                //System.out.println(ranks + " of " + suits); tests creation of deck, not needed
            }
        }
        //Set up for creation of the player and computer's hands
        Random CardDrawer = new Random();
        ArrayList<String> PlayerHand = new ArrayList<>();
        ArrayList<String> ComputerHand = new ArrayList<>();
        int RandomIndex;
        String DrawnCard;

        //START OF THE ACTUAL GAME
        while (PlayerDrawing) { //responses do not work
            System.out.println("Hit or Stand");
            UserInput = InputReader.nextLine();
            //Draws card when "hit", ends when "stand"
            if (UserInput.equals("Hit") || UserInput.equals("hit")) {
                for (int i = 0; i < 1; i++) {
                    RandomIndex = CardDrawer.nextInt(deck.size());
                    DrawnCard = deck.remove(RandomIndex);
                    PlayerHand.add(DrawnCard);
                    System.out.println("New card: " + DrawnCard);
                    System.out.println("Current deck: " + PlayerHand);
                }
            } else if (UserInput.equals("Stand") || UserInput.equals("stand")) {
                PlayerDrawing = false;
            } else {
                PlayerDrawing = false;
            }
        }
        while (ComputerDraw) {
            for (int i = 0; i < 3; i++) { //Draws computer hand
                RandomIndex = CardDrawer.nextInt(deck.size());
                DrawnCard = deck.remove(RandomIndex);
                ComputerHand.add(DrawnCard);
            }
            ComputerDraw = false;
        }
        while (Endgame) {
            System.out.println("Computer's final hand: " + ComputerHand);
            System.out.println("Player's final hand: " + PlayerHand);
            System.out.println("You have won/lost!");
            Endgame = false;
        }
    }
}