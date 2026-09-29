# Java Applications: Spreadsheet and Number Systems

Two independent Java applications developed during Computer Science studies at Ariel University. The spreadsheet explores formula evaluation and cell dependencies through a desktop interface; the number-base calculator focuses on validating and converting positional representations. The spreadsheet is the larger system and a good starting point for reviewing the design.

## Spreadsheet engine

The [spreadsheet engine](src/Mavo_Le_Hisuve/spreadsheet_engine/) displays a 9-column by 17-row worksheet. Cells can contain text, numbers or arithmetic formulas beginning with `=`. Formulas support operators, parentheses and references to other cells. For example, if `A0` contains `5`, entering `=A0+7` in `B0` displays `12`.

The implementation separates presentation from calculation:

```text
SpreadsheetApp / SpreadsheetCanvas
              ↓ edits and rendering
         Sheet interface
              ↓
      Spreadsheet + SCell
              ↓
      formula/result types
```

`SpreadsheetApp` handles interaction, `Spreadsheet` owns the grid and evaluates values, and the classes under `Compute/` represent numeric results, text and formula errors. Reference depth determines evaluation order. If cells depend on one another in a cycle, the sheet reports a cycle error rather than silently displaying an arbitrary value. Text-file save and load preserve cell coordinates and entered data; this is a project-specific format, not an Excel workbook.

![Spreadsheet interface](https://github.com/user-attachments/assets/339f699e-356f-490c-aba2-0c88c8009ec1)

**Run it:** open the repository in a Java IDE, mark `src/` as a source root and run `SpreadsheetApp` in a desktop environment. Use JDK 21 or newer. `SpreadsheetTest.java` contains JUnit 5 checks for parsing, arithmetic, references and dependency depth.

## Number-base calculator

The [number-base calculator](src/Mavo_Le_Hisuve/number_base_calculator/) is a separate console application. It validates number strings, converts between decimal integers and bases 2 through 16, compares representations and identifies the greatest valid value in a collection. The suffix notation `10011b2` means binary `10011`, or decimal `19`.

```bash
mkdir -p out
javac -d out src/Mavo_Le_Hisuve/number_base_calculator/BaseNumberCalculator.java src/Mavo_Le_Hisuve/number_base_calculator/BaseNumberCalculatorApp.java
java -cp out Mavo_Le_Hisuve.number_base_calculator.BaseNumberCalculatorApp
```

`BaseNumberCalculatorApp` provides the interactive flow. `BaseNumberCalculatorTest.java` contains JUnit 5 cases for valid and invalid inputs, conversion and comparison.

## Navigate the repository

| Start here | Then inspect | Question answered |
| --- | --- | --- |
| `SpreadsheetApp.java` | `Spreadsheet.java`, `SCell.java` | How does a user edit become a displayed value? |
| `Spreadsheet.java` | `Compute/`, `SpreadsheetTest.java` | How are formulas, references and cycles handled? |
| `BaseNumberCalculatorApp.java` | `BaseNumberCalculator.java` | How are values parsed and converted? |

The applications do not share a build system; configure JUnit 5 separately for tests. Formula functions, `.xlsx` import/export and arbitrary-precision arithmetic are outside the implemented scope.
