# APCSA: Dice Roll Frequency

## Overview

In this assignment, you will write a Java program that simulates rolling a six-sided die multiple times and calculates how frequently each side appears.

Your program will ask the user how many times they want to roll the die, generate a random value between 1 and 6 for each roll, and keep track of the total number of times each value appears.

For example, if the die is rolled 600 times, your program might produce the following output:

```text
Number of sixes: 98
Number of fives: 98
Number of fours: 98
Number of threes: 110
Number of twos: 116
Number of ones: 80
```

Because the rolls are random, your results will likely differ each time the program runs.

## Getting Started

### Option 1: GitHub Codespaces (Recommended)

1. Click the green **Code** button on this repository.
2. Select the **Codespaces** tab.
3. Click **Create codespace on main**.
4. Wait for the environment to build (approximately 2 minutes the first time).
5. Open `DiceFrequencies.java` and complete the provided methods.

> **Note:** If the Java extension shows errors on first load, press `Ctrl+Shift+P` (Windows) or `Cmd+Shift+P` (Mac) and run **Developer: Reload Window**.

### Option 2: Local Development

1. Clone the repository using GitHub Desktop.
2. Open the project in VS Code.
3. Make sure the required Java extensions are installed.
4. Open `DiceFrequencies.java` and begin working on the assignment.

## Assignment Requirements

### 1. `main` Method

Your `main` method must:

- Use a `Scanner` to ask the user how many times they want to roll the die.
- Read the number of rolls entered by the user.
- Call `rollDice`, passing the number of rolls as an argument.

### 2. `rollDice` Method

Your `rollDice` method must:

- Accept the number of rolls as an `int` parameter.
- Use a loop to simulate the specified number of six-sided die rolls.
- Use `Math.random()` to generate each random roll.
- Keep track of how many times each value from 1 through 6 appears.
- Print the final frequency totals for each side after all rolls are completed.

Your output must include the following labels:

```text
Number of sixes:
Number of fives:
Number of fours:
Number of threes:
Number of twos:
Number of ones:
```

The labels should match exactly so the automated tests can recognize them.

### Important Notes

- Each die roll must produce an integer from **1 through 6**, inclusive.
- Each roll should be counted exactly once.
- Your program must work for different numbers of rolls, not just 600.
- The six frequency totals must add up to the number of rolls entered by the user.
- The frequency of each side will vary because the rolls are random.

## Running Tests

The repository includes a `testCases.java` file that automatically checks your program.

### In VS Code / Codespaces

1. Open `testCases.java`.
2. Run its `main` method using the green play button, or run the file from the terminal.
3. Review the test results.
4. Fix any failing tests and run them again.

If you are using the terminal, compile both Java files together:

```bash
javac DiceFrequencies.java testCases.java
```

Then run the test cases:

```bash
java testCases
```

### What the Tests Check

The automated tests run your program with several input values, including:

- **10 rolls**
- **50 rolls**
- **400 rolls**

The tests check that:

- Your program accepts the provided input.
- Your program prints all six required frequency labels.
- Each label is followed by a numeric count.
- The six counts add up to the number of rolls requested.

Because the die rolls are random, the tests do not expect specific frequencies for individual sides.

A successful test run should display `[PASS]` for every test.

## Scoring

Your program will be evaluated based on the assignment requirements and the provided automated tests.

Potential grading criteria include:

- Correctly collecting the number of rolls using `Scanner`.
- Correctly generating random die rolls using `Math.random()`.
- Accurately tracking the frequency of each possible roll.
- Printing all six frequency totals with the required labels.
- Correctly implementing and calling the required methods.
- Passing the provided test cases.

Refer to your instructor's rubric for the official point breakdown.

## Important Constraint

**The provided `DiceFrequencies` class and its required methods must be implemented and functional when you submit your assignment.**

Your solution must include:

- `public static void main(String[] args)`
- `public static void rollDice(int rolls)`

Do not rename these methods or change their required method signatures. The automated tests rely on the class and method structure provided in the starter code.

## Common Mistakes

- **Incorrect random range:** Make sure your random roll produces values from 1 to 6, not 0 to 5.
- **Incorrect frequency counts:** Every roll must increment exactly one counter.
- **Incorrect loop count:** The loop must execute exactly as many times as the user requested.
- **Missing output labels:** Use the exact required labels, such as `Number of ones:` and `Number of sixes:`.
- **Incorrect method call:** Pass the user's roll count into `rollDice`.
- **Incorrect totals:** The sum of all six frequency counts should equal the number of rolls.
- **Testing only one input:** Test different roll counts to ensure your program works for different inputs.
- **Expecting identical results:** Random rolls will produce different frequency totals on different runs.

## Submission

Before submitting:

1. Complete the required methods in `DiceFrequencies.java`.
2. Run `testCases.java` and verify that all tests pass.
3. Make sure your output includes all six sides and their frequency totals.
4. Confirm that the six counts add up to the requested number of rolls.
5. Save your changes.
6. Submit your completed assignment using the submission process specified by your instructor or repository.

Only submit the files requested by your instructor.

## Credit

This repository template was modified from [CS-Plus-Plus](https://github.com/cs-plus-plus).
