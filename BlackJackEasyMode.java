import java.util.ArrayList;
import java.util.Random;
/*
Randomize the Cards of human and computer
converter for the number rolled when random stuff is calculated to cards then print them
see if an object system would work, original then cloning extra cards and their setup
*/
class BlackJackEasyMode {
    public static void main(String[] args) {

        //True creation of the deck


        Random Generator = new Random();
        int UserCard1 = Generator.nextInt(13) + 1; //+1 allows 13 to be generated
        int ComputerCard1 = Generator.nextInt(13) + 1;

        System.out.println("Welcome to the table...");
        System.out.println(UserCard1);
        System.out.println(ComputerCard1);
    }
}