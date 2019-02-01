import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class RoulleteChallenge {
    public static void main(String[] args) {
        String[] betarr = {"red", "black"};
        String odd;
        String high;
        String low;
        String even;
        String play;
        int win =0;
        int lose= 0;
        double betamt;
        double betamt2 = 0;
        int[] arrlow = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
        int[] arrhigh = {19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36};
        int[] arrodd = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35};
        int[] arreven = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36};

        System.out.println("Welcome to Roulette!");
        do {
            Random r = new Random();
            int b = (r.nextInt(1));
            int a = (r.nextInt(35));
            Scanner key = new Scanner(System.in);
            System.out.print("Enter the type of bet you would like to place " +
                    "(Red|Black|Even|Odd|High|Low): ");
            String bet = key.next();
            Scanner key2 = new Scanner(System.in);
            System.out.print("Enter in your bet amount: ");
            betamt = key2.nextDouble();
            System.out.println("The ball landed on " + a + " " + betarr[b]);
            boolean contains;
            if (IntStream.of(arrlow).anyMatch(x -> x == a)) contains = true;
            else contains = false;
            boolean contains1;
            if (IntStream.of(arrhigh).anyMatch(x -> x == a)) contains1 = true;
            else contains1 = false;
            boolean contains2;
            if (IntStream.of(arrodd).anyMatch(x -> x == a)) contains2 = true;
            else contains2 = false;
            boolean contains3;
            if (IntStream.of(arreven).anyMatch(x -> x == a)) contains3 = true;
            else contains3 = false;
            if (bet.equalsIgnoreCase("red") && (betarr[b].equalsIgnoreCase(bet))) {
                System.out.println("Congratulations, you've won.");
                win = win + 1;
                betamt2 = betamt * 2;
                System.out.println("You currently have: $" + betamt2);
            } else if (bet.equalsIgnoreCase("black") && (betarr[b].equalsIgnoreCase(bet))) {
                System.out.println("Congratulations, you've won.");
                win = win + 1;
                betamt2 = betamt2 +(betamt * 2);
                System.out.println("You currently have: $" + betamt2);
            } else if (bet.equalsIgnoreCase("even") && contains3) {
                System.out.println("Congratulations, you've won.");
                win = win + 1;
                betamt2 = betamt2 + (betamt * 2);
                System.out.println("You currently have: $" + betamt2);
            } else if (bet.equalsIgnoreCase("odd") && contains2) {
                System.out.println("Congratulations, you've won.");
                win = win + 1;
                betamt2 = betamt2 +  (betamt * 2);
                System.out.println("You currently have: $" + betamt2);
            } else if (bet.equalsIgnoreCase("high") && contains1) {
                System.out.println("Congratulations, you've won.");
                win = win + 1;
                betamt2 = betamt2 + (betamt * 2);
                System.out.println("You currently have: $" + betamt2);
            } else if (bet.equalsIgnoreCase("low") && contains) {
                System.out.println("Congratulations, you've won.");
                win = win + 1;
                betamt2 = betamt2+ (betamt * 2);
                System.out.println("You currently have: $" + betamt2);
            } else {
                System.out.println("Sorry, you lost the best.");
                lose = lose + 1;
                betamt2 = betamt2 - betamt;
                System.out.println("You currently have: $" + betamt2);
            }
            Scanner key1 = new Scanner(System.in);
            System.out.println("Would you like to play again? Y/N : ");
            play = key1.next();
        } while(!play.equalsIgnoreCase("N"));
        System.out.println("Thanks for playing!");
        System.out.println("You've won:"+win+ " games and You've lost:"+lose+" games." );
    }
}
