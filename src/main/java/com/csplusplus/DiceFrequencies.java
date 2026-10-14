
package com.csplusplus;

import java.util.Scanner;

public class DiceFrequencies {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of dice rolls: ");
        int rolls = input.nextInt();

        rollDice(rolls);
    }

    public static void rollDice(int rolls) {
        int ones = 0;
        int twos = 0;
        int threes = 0;
        int fours = 0;
        int fives = 0;
        int sixes = 0;

        for (int i = 0; i < rolls; i++) {
            int roll = (int) (Math.random() * 6) + 1;

            switch (roll) {
                case 1:
                    ones++;
                    break;
                case 2:
                    twos++;
                    break;
                case 3:
                    threes++;
                    break;
                case 4:
                    fours++;
                    break;
                case 5:
                    fives++;
                    break;
                case 6:
                    sixes++;
                    break;
            }
        }

        System.out.println("Number of sixes: " + sixes);
        System.out.println("Number of fives: " + fives);
        System.out.println("Number of fours: " + fours);
        System.out.println("Number of threes: " + threes);
        System.out.println("Number of twos: " + twos);
        System.out.println("Number of ones: " + ones);
    }
}
