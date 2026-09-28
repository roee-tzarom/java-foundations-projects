# Java Spreadsheet Engine and Number-Base Calculator

This repository presents two Java projects: a desktop spreadsheet for exploring formulas and cell dependencies, and a console calculator for working with positional number systems. Each project has its own entry point and focused README. The spreadsheet is the larger application and the best place to start if you want to review the design.

## Spreadsheet engine

The [spreadsheet engine](src/Mavo_Le_Hisuve/spreadsheet_engine/) models a worksheet as a two-dimensional collection of cells. A cell can hold plain text, a number, or a formula that begins with `=`. Formulas support arithmetic operators, parentheses, and references to other cells. For example, with `5` in `A0`, the formula `=A0+7` in `B0` evaluates to `12`. The default configuration defines a 9-column by 17-row grid.

The code separates the desktop interface from calculation. `SpreadsheetApp` reads keyboard and mouse actions and draws the sheet through `SpreadsheetCanvas`. `Spreadsheet` owns the grid and implements the `Sheet` contract. Each `SCell` keeps its entered text and display state. The result classes in `Compute/` distinguish numbers, text, and invalid formulas, allowing the interface to show an error rather than treating every input as a numeric value.

References create dependencies between cells. Before calculating the displayed values, the sheet computes dependency depth: a cell that only contains a value can be handled immediately, while a formula referencing another cell waits for that cell. A circular dependency remains unresolved and is marked as a cycle error. The sheet also has text-file save and load methods; its format records coordinates and cell data rather than using an Excel workbook format.

![Spreadsheet GUI example](https://github.com/user-attachments/assets/339f699e-356f-490c-aba2-0c88c8009ec1)

To explore the implementation, begin at `SpreadsheetApp.java`, follow edits into `Spreadsheet.java`, then inspect `SCell.java`, `CellEntry.java`, and the result types under `Compute/`. `SpreadsheetTest.java` contains examples for parsing, arithmetic, references, bounds checks, and cycle depth. The included drawing support and reference artifact originate from the course materials.

## Number-base calculator

The [number-base calculator](src/Mavo_Le_Hisuve/number_base_calculator/) is a separate console project. `BaseNumberCalculator` validates textual numbers, converts them to decimal integers, formats integers in bases 2 through 16, compares values represented in different bases, and finds the greatest valid value in an array. The notation `10011b2`, for instance, represents decimal `19`. `BaseNumberCalculatorApp` provides an interactive two-number flow, while `BaseNumberCalculatorTest` captures conversion and validation cases.

Run the calculator from the repository root with a JDK:

```bash
mkdir -p out
javac -d out src/Mavo_Le_Hisuve/number_base_calculator/BaseNumberCalculator.java src/Mavo_Le_Hisuve/number_base_calculator/BaseNumberCalculatorApp.java
java -cp out Mavo_Le_Hisuve.number_base_calculator.BaseNumberCalculatorApp
```

## Running the spreadsheet and project scope

Open the repository in a Java IDE, mark `src/` as a source root, and run `Mavo_Le_Hisuve.spreadsheet_engine.SpreadsheetApp` in a desktop environment. The spreadsheet uses Java's pattern matching in `switch`, so use JDK 21 or newer. Configure JUnit 5 separately to run both projects' tests. There is no unified Maven or Gradle build file.

These are local academic projects. The spreadsheet supports the formulas implemented in its parser; functions such as `IF` and `SIN`, collaborative editing, and `.xlsx` import/export are outside its scope. The calculator uses ordinary Java integers rather than arbitrary-precision arithmetic. The individual project READMEs provide more detail without requiring a reviewer to navigate unrelated folders.
