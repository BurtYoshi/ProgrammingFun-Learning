import java.util.*; //Simplifies 4 imports into 1 import
//Scoring: Parse the strings in the deck and maybe create another deck to compare to and depending
//on the index number +1 it calculates the value of the hand (without Ace score variation)
public class BlackJack {
    public static void main(String[] args) {
        //creation of arrays for deck
        ArrayList<String> suit = new ArrayList<>(Arrays.asList("Diamonds", "Hearts", "Clubs", "Spades"));
        ArrayList<String> rank = new ArrayList<>(Arrays.asList("Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"));
        ArrayList<String> deck = new ArrayList<>();
        String UserInput;
        int PlayerWins = 0;
        int ComputerWins = 0;
        boolean LoopGame = true;
        boolean PlayerDrawing = true;
        boolean ComputerDraw = true;
        boolean Endgame = true;
        Scanner InputReader = new Scanner(System.in);
        //Set up for creation of player and computer's hands
        Random CardDrawer = new Random();
        int RandomIndex;
        String DrawnCard;

        for (String suits : suit) {
            for (String ranks : rank) {
                deck.add(ranks + " of " + suits);
                //System.out.println(ranks + " of " + suits); tests creation of deck, not needed
            }
        }
        while (LoopGame) {
            //variables here reset at start of loop, others don't
            ArrayList<String> PlayerHand = new ArrayList<>();
            ArrayList<String> ComputerHand = new ArrayList<>();
            while (PlayerDrawing) {
                System.out.println("Hit or Stand");
                UserInput = InputReader.nextLine();
                //Draws card when "hit", ends when "stand"
                if (UserInput.equalsIgnoreCase("Hit")) {
                    for (int i = 0; i < 1; i++) {
                        RandomIndex = CardDrawer.nextInt(deck.size());
                        DrawnCard = deck.remove(RandomIndex);
                        PlayerHand.add(DrawnCard);
                        System.out.println("New card: " + DrawnCard);
                        System.out.println("Current deck: " + PlayerHand);
                    }
                } else if (UserInput.equalsIgnoreCase("Stand")) {
                    PlayerDrawing = false;
                }
                ComputerDraw = true;
            }
            while (ComputerDraw) {
                for (int i = 0; i < 4; i++) { //Draws computer hand
                    RandomIndex = CardDrawer.nextInt(deck.size());
                    DrawnCard = deck.remove(RandomIndex);
                    ComputerHand.add(DrawnCard);
                }
                ComputerDraw = false;
                Endgame = true;
            }
            while (Endgame) {
                System.out.println("Computer's final hand: " + ComputerHand);
                System.out.println("Player's final hand: " + PlayerHand);
                System.out.println("Did you win? (No auto scoring yet)");
                UserInput = InputReader.nextLine();
                if (UserInput.equalsIgnoreCase("Yes")) {
                    PlayerWins++;
                    System.out.println("Congrats on your win!");
                    System.out.println("Current record: " + PlayerWins + " to " + ComputerWins);
                } else if (UserInput.equalsIgnoreCase("No")) {
                    ComputerWins++;
                    System.out.println("Better luck next time!");
                    System.out.println("Current record: " + PlayerWins + " to " + ComputerWins);
                }
                System.out.println("Do you want to play again?");
                UserInput = InputReader.nextLine();
                if (UserInput.equalsIgnoreCase("Yes")) {
                    PlayerDrawing = true;
                    Endgame = false;
                } else if (UserInput.equalsIgnoreCase("No")) {
                    System.out.println("Thank you for playing BlackJack!");
                    LoopGame = false;
                    Endgame = false;
                    InputReader.close();
                }
            }
        }
    }
}