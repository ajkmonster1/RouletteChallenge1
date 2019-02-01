import java.util.Random;
import java.util.Scanner;

public class RoulleteChallenge {
    public static void main(String[] args) {
        String[] betarr = {"red", "black"};
        String odd;
        String high;
        String low;
        String even;
        int[] arrlow = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
        int[] arrhigh = {19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36};
        int[] arrodd = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35};
        int[] arreven = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36};
        Random r = new Random();
        int b = (r.nextInt(1));
        int a = (r.nextInt(35));
        even = Integer.toString(arreven[a]);
        odd = Integer.toString(arrodd[a]);
        high = Integer.toString(arrhigh[a]);
        low = Integer.toString(arrlow[a]);
        int e = Integer.parseInt(even);
        int o = Integer.parseInt(odd);
        int h = Integer.parseInt(high);
        int l = Integer.parseInt(low);
        Scanner key = new Scanner(System.in);
        System.out.print("Enter the type of bet you would like to place " +
                "(Red|Black|Even|Odd|High|Low): ");
        String bet = key.next();
        Scanner key2 = new Scanner(System.in);
        System.out.print("Enter in your bet amount: ");
        int betamt = key2.nextInt();
        System.out.println("The ball landed on " + a + " " + betarr[b]);
        if (bet.equalsIgnoreCase("red")) {
            if (betarr[b].equalsIgnoreCase(bet)) {
                System.out.println("Congratulations, you've won.");
            } else {
                System.out.println("Sorry, you've lost this bet.");
            }
        } else if (bet.equalsIgnoreCase("black")) {
            if (betarr[b].equalsIgnoreCase(bet)) {
                System.out.println("Congratulations, you've won.");
            } else {
                System.out.println("Sorry, you've lost this bet.");
            }
        } else if (bet.equalsIgnoreCase("even")) {
            if (a == e) {
                System.out.println("Congratulations, you've won.");
            } else {
                System.out.println("Sorry, you've lost this bet.");
            }
        } else if (bet.equalsIgnoreCase("odd")) {
            if (a == o) {
                System.out.println("Congratulations, you've won.");
            } else {
                System.out.println("Sorry, you've lost this bet.");
            }
        } else if (bet.equalsIgnoreCase("high")) {
            if (a == h) {
                System.out.println("Congratulations, you've won.");
            } else {
                System.out.println("Sorry, you've lost this bet.");
            }
        } else if (bet.equalsIgnoreCase("low")) {
            if (a == l) {
                System.out.println("Congratulations, you've won.");
            } else {
                System.out.println("Sorry, you've lost this bet.");
            }
        }

    }
  /*  private static void WinorLose(String bet){
        String[] betarr = {"red", "black"};
        String odd;
        String high;
        String low;
        String even;
        int arrlow[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
        int arrhigh[] = {19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36};
        int arrodd[] = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35};
        int arreven[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36};
        Random r = new Random();
        int b = (r.nextInt(1));
        int a = (r.nextInt(35));
        even = Integer.toString(arreven[a]);
        odd = Integer.toString(arrodd[a]);
        high = Integer.toString(arrhigh[a]);
        low = Integer.toString(arrlow[a]);
        int e = Integer.parseInt(even);
        int o = Integer.parseInt(odd);
        int h = Integer.parseInt(high);
        int l = Integer.parseInt(low);
        System.out.println("The ball landed on " + a + " " + betarr[b]);
        if (bet.equalsIgnoreCase("red")) {
            if (betarr[b].equalsIgnoreCase(bet)) {
                System.out.println("Congratulations, you've won.");
            } else {
                System.out.println("Sorry, you've lost this bet.");
            }
        } else if (bet.equalsIgnoreCase("black")) {
            if (betarr[b].equalsIgnoreCase(bet)) {
                System.out.println("Congratulations, you've won.");
            } else {
                System.out.println("Sorry, you've lost this bet.");
            }
        } else if (bet.equalsIgnoreCase("even")) {
            if (a == e) {
                System.out.println("Congratulations, you've won.");
            } else {
                System.out.println("Sorry, you've lost this bet.");
            }
        } else if (bet.equalsIgnoreCase("odd")) {
            if (a == o) {
                System.out.println("Congratulations, you've won.");
            } else {
                System.out.println("Sorry, you've lost this bet.");
            }
        } else if (bet.equalsIgnoreCase("high")) {
            if (a == h) {
                System.out.println("Congratulations, you've won.");
            } else {
                System.out.println("Sorry, you've lost this bet.");
            }
        } else if (bet.equalsIgnoreCase("low")) {
            if (a == l) {
                System.out.println("Congratulations, you've won.");
            } else {
                System.out.println("Sorry, you've lost this bet.");
            }
        }

    }
    */
}
