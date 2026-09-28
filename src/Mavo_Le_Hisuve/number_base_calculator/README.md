# Number-Base Calculator

A Java console project for exploring positional number systems. It validates textual numbers, converts between supported bases and decimal integers, and demonstrates arithmetic with values entered in different representations.

## How the notation works

The calculator accepts ordinary decimal digits and a suffix form that records the source base. For example, `10011b2` denotes binary `10011`, which converts to decimal `19`. `BaseNumberCalculator.number2Int` parses an input value, while `int2Number` formats a nonnegative integer in a requested base from 2 through 16. The class also includes value comparison across representations and a helper that finds the index of the greatest valid value in an array.

`BaseNumberCalculatorApp` provides an interactive flow that asks for two numbers, validates them, and prints conversion and arithmetic results. The separate `BaseNumberCalculatorTest` file contains JUnit 5 cases for valid and invalid representations, conversion, comparison, and maximum selection. The routines use Java `int`, so very large numbers and arbitrary precision are outside the design.

## Run

From the repository root, compile and launch the console application with a JDK:

```bash
mkdir -p out
javac -d out src/Mavo_Le_Hisuve/number_base_calculator/BaseNumberCalculator.java src/Mavo_Le_Hisuve/number_base_calculator/BaseNumberCalculatorApp.java
java -cp out Mavo_Le_Hisuve.number_base_calculator.BaseNumberCalculatorApp
```

JUnit 5 must be configured separately to run the tests. This is a small teaching project rather than a general numeric parsing library.

[Back to the repository overview](../../../README.md).
