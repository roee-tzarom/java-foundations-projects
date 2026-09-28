# Spreadsheet Engine

A small Java desktop spreadsheet with a cell grid, arithmetic formulas, references, cycle/error handling and text-file persistence. The code is under the `Mavo_Le_Hisuve.spreadsheet_engine` package.

## How a cell update flows

1. `SpreadsheetApp` receives a GUI edit and updates the sheet through `Sheet`.
2. `Spreadsheet` stores the raw input in an `SCell` and evaluates dependent content.
3. The evaluator parses arithmetic and references and uses dependency depth to detect cycles.
4. `Compute/` result types separate ordinary numbers or text from formula errors.
5. The GUI chooses what to display for each cell; save/load methods preserve sheet content in a text file.

## Code map

| File or folder | Role |
| --- | --- |
| `SpreadsheetApp.java` | Desktop application entry point and UI event handling |
| `Spreadsheet.java` | Grid, formula evaluation, reference resolution and persistence |
| `SCell.java`, `Cell.java`, `CellEntry.java`, `Index2D.java` | Cell model and coordinate contracts |
| `Compute/` | Numeric, text and error result types |
| `SpreadsheetConfig.java` | Grid and UI constants |
| `SpreadsheetCanvas.java` | Included drawing support adapted from course material |
| `SpreadsheetTest.java` | JUnit behavioral examples |

## Run and limits

Open the repository in a Java IDE, mark `src/` as a source root and run `Mavo_Le_Hisuve.spreadsheet_engine.SpreadsheetApp` with a desktop display. Configure JUnit separately to run `SpreadsheetTest`. The supported formula language covers arithmetic and cell references; general spreadsheet functions, multi-user editing and Excel file formats are outside its scope. The included reference JAR and interfaces are course materials, not a dependency required to launch this implementation.

[Return to the repository overview](../../../README.md).
