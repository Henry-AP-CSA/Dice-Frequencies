
package com.csplusplus;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Execution(ExecutionMode.SAME_THREAD)
public class testCases {

    @Test
    void main_printsAllSixDiceFrequencies() {
        String output = runProgram(10);

        assertTrue(hasCount(output, "ones"), output);
        assertTrue(hasCount(output, "twos"), output);
        assertTrue(hasCount(output, "threes"), output);
        assertTrue(hasCount(output, "fours"), output);
        assertTrue(hasCount(output, "fives"), output);
        assertTrue(hasCount(output, "sixes"), output);
    }

    @Test
    void rollDice_countsAddUpToTen() {
        assertEquals(10, getTotal(runProgram(10)));
    }

    @Test
    void rollDice_countsAddUpToFifty() {
        assertEquals(50, getTotal(runProgram(50)));
    }

    @Test
    void rollDice_countsAddUpToFourHundred() {
        assertEquals(400, getTotal(runProgram(400)));
    }

    private String runProgram(int rolls) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        try {
            System.setIn(new ByteArrayInputStream(
                (rolls + "\n").getBytes(StandardCharsets.UTF_8)
            ));

            System.setOut(new PrintStream(
                output, true, StandardCharsets.UTF_8
            ));

            DiceFrequencies.main(new String[0]);

        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }

        return output.toString(StandardCharsets.UTF_8);
    }

    private boolean hasCount(String output, String side) {
        Pattern pattern = Pattern.compile(
            "(?i)Number of " + side + "\\s*:\\s*\\d+"
        );

        return pattern.matcher(output).find();
    }

    private int getTotal(String output) {
        String[] sides = {
            "ones", "twos", "threes",
            "fours", "fives", "sixes"
        };

        int total = 0;

        for (String side : sides) {
            Pattern pattern = Pattern.compile(
                "(?i)Number of " + side + "\\s*:\\s*(\\d+)"
            );

            Matcher matcher = pattern.matcher(output);

            assertTrue(
                matcher.find(),
                "Missing count for " + side + ". Output:\n" + output
            );

            total += Integer.parseInt(matcher.group(1));
        }

        return total;
    }
}
