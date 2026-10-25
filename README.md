# Build a simple calculator

A console calculator. It shows a menu, reads two numbers and prints the answer with 2 decimals, like `12.00 + 3.50 = 15.50`.

The menu comes back after every answer, until the user picks Exit. A wrong menu number or dividing by zero prints a clear message, never a wrong answer.

## Features

- Show a menu: 1 Add, 2 Subtract, 3 Multiply, 4 Divide, 5 Exit.
- Read the user's choice and two numbers with `Scanner`.
- Print the result with 2 decimal places: `12.00 + 3.50 = 15.50`, `100.00 - 45.50 = 54.50`, `4.00 * 5.00 = 20.00` or `22.00 / 7.00 = 3.14`.
- Show the menu again after every calculation, until the user picks 5.
- For a choice outside 1 to 5, print `Please choose a number from 1 to 5.` and show the menu again.
- Never divide by zero: print `Cannot divide by zero.` instead.

## How to run

```
javac *.java
java Calculator
```

## Sample run

```
=== Simple Calculator ===

1. Add
2. Subtract
3. Multiply
4. Divide
5. Exit
Choose an option (1-5): 1
First number: 12
Second number: 3.5
12.00 + 3.50 = 15.50

1. Add
2. Subtract
3. Multiply
4. Divide
5. Exit
Choose an option (1-5): 4
First number: 10
Second number: 0
Cannot divide by zero.

1. Add
2. Subtract
3. Multiply
4. Divide
5. Exit
Choose an option (1-5): 5
Goodbye!
```

## Author

priyaKun
