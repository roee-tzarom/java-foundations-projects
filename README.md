# Java Foundations: Spreadsheet Engine and Number-Base Calculator

Two named Java projects anchor this coursework collection: an interactive spreadsheet and a number-base calculator. Additional geometry, data-structure and algorithm exercises remain in their original course folders. The projects are learning implementations, with their behavior and limitations described below so a reviewer can move directly from the overview to runnable code.

## Start here

| Project | What it does | Entry point |
| --- | --- | --- |
| [Spreadsheet engine](src/Mavo_Le_Hisuve/spreadsheet_engine/) | Edits a cell grid, evaluates arithmetic formulas and references, reports formula/cycle errors, and saves or loads sheet content | `Mavo_Le_Hisuve.spreadsheet_engine.SpreadsheetApp` |
| [Number-base calculator](src/Mavo_Le_Hisuve/number_base_calculator/) | Parses and converts textual numbers in supported bases and runs an interactive arithmetic example | `Mavo_Le_Hisuve.number_base_calculator.BaseNumberCalculatorApp` |
| `src/Mavo_Le_Hisuve/Ex3/` | Geometry, filters, lists and trees | Independent examples |
| `src/Mavo_Le_Hisuve/Ex4/` | Additional array and algorithm practice | Independent examples |
| `src/Architecture/` | Student-grade modeling exercise | Independent example |

## Spreadsheet architecture

`SpreadsheetApp` renders the grid and sends edits to the `Sheet` interface. `Spreadsheet` owns the two-dimensional cells, resolves references and coordinates recalculation and text-file persistence. `SCell` stores each cell's raw content and its relationship to the sheet. Types in `Compute/` distinguish numeric results, text and formula errors. A dependency-depth pass identifies formulas that can be evaluated and marks circular references as errors. The parser covers arithmetic and cell references; it does not implement general spreadsheet functions such as `IF` or `SIN`.

The GUI uses the included `SpreadsheetCanvas` drawing support, adapted from course material. The original course interfaces, support code and reference artifact remain alongside the implementation. The screenshot below shows the intended desktop interface.

![Spreadsheet GUI example](https://github.com/user-attachments/assets/339f699e-356f-490c-aba2-0c88c8009ec1)

## Run the projects

Use a JDK and run these commands from the repository root. The calculator has no external runtime dependency:

```bash
mkdir -p out
javac -d out src/Mavo_Le_Hisuve/number_base_calculator/BaseNumberCalculator.java src/Mavo_Le_Hisuve/number_base_calculator/BaseNumberCalculatorApp.java
java -cp out Mavo_Le_Hisuve.number_base_calculator.BaseNumberCalculatorApp
```

For the spreadsheet, open the repository in a Java IDE with `src/` marked as a source root and run `Mavo_Le_Hisuve.spreadsheet_engine.SpreadsheetApp`. It requires a desktop display. `SpreadsheetTest.java` and `BaseNumberCalculatorTest.java` use JUnit; configure the relevant JUnit dependency in the IDE before running them. There is no unified Maven or Gradle build for the full coursework repository.

## Read the code

For the spreadsheet, start with `SpreadsheetApp.java`, then follow the `Sheet` interface into `Spreadsheet.java`, `SCell.java` and `Compute/`. For the calculator, begin with `BaseNumberCalculatorApp.java` and inspect the conversion and validation methods in `BaseNumberCalculator.java`. Each named project also has its own README with a focused file map and execution notes.

## Scope and provenance

This repository contains independent academic exercises and some supplied course scaffolding. The spreadsheet is a local desktop application, not a replacement for Excel or a multi-user service. The calculator demonstrates base conversion rather than an arbitrary-precision numeric library. The remaining `Ex3`/`Ex4` folders have not been renamed as part of this focused cleanup; their code is unrelated to the two projects above.
