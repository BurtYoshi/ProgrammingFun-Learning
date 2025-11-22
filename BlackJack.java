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
        int PlayerWins = 0; //consider deleting
        int ComputerWins = 0; //consider deleting
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
        System.out.println("Welcome to the game of Black Jack...");
        while (LoopGame) {
            //variables here reset at start of loop, others don't
            ArrayList<String> PlayerHand = new ArrayList<>();
            ArrayList<String> ComputerHand = new ArrayList<>();
            int PlayerScore = 0;
            int ComputerScore = 0;

            while (PlayerDrawing) {
                System.out.println("\nHit or Stand?");
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
            System.out.println("Computer's final hand: " + ComputerHand);
            System.out.println("Player's final hand: " + PlayerHand);
            while (Endgame) {
                //Parse hand for a value listed in enum, find index number and add to score
                //switch statements depending on value to add to player score


                //Test of Enum
                CardEnums CardValues = CardEnums.JACK;
                CardEnums CardValues2 = CardEnums.ACE;
                System.out.println(CardValues);
                System.out.println(CardValues2);

                // START OF THE OLD END SYSTEM, ENUM BEING USED BEFORE

                //Bad scoring system (manual win or lose)
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

                //Whether or not to loop the game
                System.out.println("Do you want to play again?");
                UserInput = InputReader.nextLine();
                if (UserInput.equalsIgnoreCase("Yes")) {
                    PlayerDrawing = true;
                    Endgame = false;
                } else if (UserInput.equalsIgnoreCase("No")) {
                    System.out.println("Thank you for playing Black Jack!");
                    LoopGame = false;
                    Endgame = false;
                    InputReader.close();
                }
            }
        }
    }
}