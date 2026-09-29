# Number-Base Calculator

A Java console application for validating and converting positional numbers. It accepts decimal values and values marked with a source-base suffix, then performs comparisons and arithmetic through integer conversion.

## Input notation

`10011b2` means the digit sequence `10011` in base 2, equivalent to decimal `19`. The parser validates each digit against the declared base before converting it. Formatting supports bases 2 through 16.

## Main operations

| Method | Purpose |
| --- | --- |
| `number2Int` | Convert a supported textual representation to a decimal integer |
| `toDecimal` | Convert digits from a supplied base |
| `isNumber` | Validate an input string |
| `int2Number` | Format an integer in a selected base |
| `equals` | Compare values written in different representations |
| `maxIndex` | Find the greatest valid value in an array |

`BaseNumberCalculatorApp` guides a user through entering two values and viewing conversion and arithmetic results. `BaseNumberCalculatorTest.java` has JUnit 5 checks for valid and invalid strings and conversions.

## Run

From the repository root with a JDK:

```bash
mkdir -p out
javac -d out src/Mavo_Le_Hisuve/number_base_calculator/BaseNumberCalculator.java src/Mavo_Le_Hisuve/number_base_calculator/BaseNumberCalculatorApp.java
java -cp out Mavo_Le_Hisuve.number_base_calculator.BaseNumberCalculatorApp
```

The implementation uses Java `int`, so it does not provide arbitrary-precision arithmetic. The calculator is independent of the spreadsheet application in the same repository.

[Back to the Java projects](../../../README.md).
