//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.Random;

class guessingGame
{
    static int numRandom() //custom function

    {
        Random generator = new Random();

        int numRandom = generator.nextInt(100)+1;
        return numRandom;
    }
    public static void main(String[] str)
    {
        // declare variables
        int numRandom;
        int numGuess1;
        int numGuess2;
        int numGuess3;
        String display1 = "GOOD JOB!!";
        String display2 = "Sorry, thats incorrect.";
        String display3 = "The correct number is";
        String greeting1 = "!!!WELCOME TO THE GUESSING GAME!!!";
        String greeting2 = "Where you get three chances to guess a number from 1 to 100 and see if its right.";
        String prompt1 = "Would you like to play?";
        String choice1 = "1. Yes";
        String choice2 = "2. No";
        String prompt2 = "Please enter a number 1 to 100";
        String second = "Please enter your second guess:";
        String last =  "Please enter your final guess:";
        String prompt3 = "Would you like to play again?";
        String goodbye1 = "!!!TOO-DOOS!!!";
        int reply = 0;

        //scanner object
        Scanner keyboard = new Scanner(System.in);

        //Main program
        System.out.println(greeting1);
        System.out.println("");
        System.out.println(greeting2);
        System.out.println("");
        System.out.println(prompt1);
        System.out.println(choice1);
        System.out.println(choice2);
        reply = keyboard.nextInt();

        while(reply==1)
        {
            numRandom = numRandom();  //calling for a random number
            System.out.println(prompt2);
            numGuess1 = keyboard.nextInt();
            System.out.println("");

            System.out.println(second);
            numGuess2 = keyboard.nextInt();
            System.out.println("");

            System.out.println(last);
            numGuess3 = keyboard.nextInt();
            System.out.println("");

            if (numGuess1 == numRandom|| numGuess2 == numRandom || numGuess3 == numRandom)
            {
                System.out.println("");
                System.out.println(display1);
                System.out.println("");
            }
            else
            {
                System.out.println("");
                System.out.println(display2);
                System.out.println("");
                System.out.println(display3+numRandom+".");
                System.out.println("");
            }
            System.out.println(prompt3);
            System.out.println(choice1);
            System.out.println(choice2);
            reply = keyboard.nextInt();

            if (reply==2)
            {
                System.out.println(goodbye1);
            }
        }


    }
}


