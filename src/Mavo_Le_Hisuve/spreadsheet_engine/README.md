# Spreadsheet Engine

A Java desktop worksheet that connects a visible cell grid to a formula evaluator. The application keeps input, display state and calculation separate, so the path from a user edit to a computed cell can be followed through clear components.

## Features

- A 9-column by 17-row worksheet with keyboard and mouse interaction.
- Text, numeric values and formulas beginning with `=`.
- Arithmetic operators, parentheses and references such as `A0`.
- Dependency-depth calculation for formulas that refer to other cells.
- Detection of circular references and formula errors.
- Save and load through a simple text format containing coordinates and cell data.

For example, put `5` in `A0` and `=A0+7` in `B0`; the displayed result is `12`.

## Architecture

```text
SpreadsheetApp → Sheet interface → Spreadsheet grid
       │                               ├─ SCell values
       └─ SpreadsheetCanvas           └─ Compute result types
```

`SpreadsheetApp` handles interaction. `Spreadsheet` implements the `Sheet` contract and owns the cells. `SCell` tracks entered content and calculated display state. The types in `Compute/` distinguish numbers, text and formula errors. Reference depth determines which cells can be evaluated first; cycles have no finite order and are shown as an error.

## Run and inspect

Open the repository in a Java IDE, mark `src/` as a source root and run `SpreadsheetApp` with JDK 21 or newer and a desktop display. Configure JUnit 5 separately to run `SpreadsheetTest.java`.

For a code review, start with `SpreadsheetApp.java`, follow an edit into `Spreadsheet.java`, then inspect `SCell.java` and the result types. The tests cover parsing, references, bounds and cycle depth.

The save format is specific to this application. It does not read or write `.xlsx` files, and the formula parser supports only the operators implemented in the source.

[Back to the Java projects](../../../README.md).
