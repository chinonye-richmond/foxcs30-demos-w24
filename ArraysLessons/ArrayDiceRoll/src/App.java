import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);
        Random rand = new Random();
        int[] outcomes = new int[13];
        int numRolls;
        int result;

        System.out.print("How many rolls (max 13)? ");
        numRolls = keys.nextInt();
        keys.nextLine(); // clear the scanner

        // Check if out of bounds, set a max and min assumption
        if (numRolls > 13) {
            numRolls = 13;
        }
        else if (numRolls < 0) {
            numRolls = 1;
        }

        // Roll dice and add to outcomes array - Assume two dice
        for (int roll = 0; roll < numRolls; roll++) {
            // roling "two dice" - note nextInt(x) is a number from 0<= num < x

            System.out.print("Roll 1: ");
            int dice1 = rand.nextInt(6) + 1;
            System.out.println(dice1);
            // keys.nextLine(); //Pause for user

            System.out.print("Roll 2: ");
            int dice2 = rand.nextInt(6) + 1;
            System.out.println(dice2);
            // keys.nextLine(); //Pause for user

            result = dice1 + dice2;

            //Store result in the outcomes array
            outcomes[roll] = result;

            System.out.println("Roll number " + roll + " is " + outcomes[roll] + "\n");
        }


        

    }
}
