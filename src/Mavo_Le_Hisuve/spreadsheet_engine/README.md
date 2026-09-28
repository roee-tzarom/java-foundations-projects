# Spreadsheet Engine

A Java desktop worksheet that evaluates arithmetic formulas and cell references. Its default sheet has 9 columns and 17 rows, with a GUI for editing and inspecting cells. The application is a focused demonstration of parsing, dependency ordering, and object-oriented separation between a model and its interface.

## What happens when a cell changes

`SpreadsheetApp` receives the edit from the GUI and writes the entered text through the `Sheet` interface. `Spreadsheet` stores it in an `SCell`, then calculates what should be displayed. Numeric input can be parsed directly. Input beginning with `=` goes through the formula evaluator, which handles parentheses, `+`, `-`, `*`, `/`, and references such as `A0`. Other input is represented as text or a formula error as appropriate. The classes in `Compute/` provide distinct result types for those cases.

Dependencies matter when formulas refer to one another. The `depth()` method gives cells an evaluation order based on the references it finds. If references form a cycle, they cannot receive a finite depth and the sheet reports a cycle error. Tests include a chain of references and a two-cell cycle. This is an intentionally small formula language, so a reviewer can follow the parser and dependency logic within one core class.

The sheet can save non-empty cells to a text file as coordinate/data records and load that format later. This is persistence for the exercise, not an Excel workbook importer. `SpreadsheetCanvas` supplies the drawing primitives used by the GUI; it is adapted course support code. `SpreadsheetConfig` holds grid dimensions and display constants, while `CellEntry` and `Index2D` represent locations in the grid.

## Run and inspect

Open the repository in a Java IDE with `src/` as a source root. With JDK 21 or newer and a desktop display, run `Mavo_Le_Hisuve.spreadsheet_engine.SpreadsheetApp`. Start reading at `SpreadsheetApp.java` for UI flow and `Spreadsheet.java` for formula and reference logic. `SpreadsheetTest.java` uses JUnit 5 and contains examples of arithmetic, cell references, bounds, and dependency depth.

The current implementation does not provide spreadsheet functions such as `IF` or `SIN`, network collaboration, or `.xlsx` support. The included course reference JAR is preserved for provenance and is not needed to launch the app.

[Back to the repository overview](../../../README.md).
