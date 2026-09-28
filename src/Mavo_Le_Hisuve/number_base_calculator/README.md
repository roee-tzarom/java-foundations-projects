# Number-Base Calculator

A console-oriented Java exercise for validating textual numbers, converting among supported bases and applying arithmetic to the converted values. The project lives in the `Mavo_Le_Hisuve.number_base_calculator` package.

## Main files

| File | Responsibility |
| --- | --- |
| `BaseNumberCalculator.java` | Validation, conversion, comparison and arithmetic helpers |
| `BaseNumberCalculatorApp.java` | Interactive terminal entry point |
| `BaseNumberCalculatorTest.java` | JUnit examples for parsing and conversion |

The textual format can include a base suffix, such as `10011b2` for a base-two number. The app asks for two values and displays derived results. Inspect the validation method before using an input format outside the provided examples; this is course-level integer arithmetic, not a general number parser.

## Run

From the repository root with a JDK:

```bash
mkdir -p out
javac -d out src/Mavo_Le_Hisuve/number_base_calculator/BaseNumberCalculator.java src/Mavo_Le_Hisuve/number_base_calculator/BaseNumberCalculatorApp.java
java -cp out Mavo_Le_Hisuve.number_base_calculator.BaseNumberCalculatorApp
```

The tests require JUnit separately. [Return to the repository overview](../../../README.md).
