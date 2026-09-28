# Java Foundations Projects

Coursework in Java spanning base-number arithmetic, a small spreadsheet engine, geometry and data-structure exercises. The main project is the spreadsheet in `src/Mavo_Le_Hisuve/Ex2/`.

## Project guide

| Folder | Contents |
| --- | --- |
| `src/Mavo_Le_Hisuve/Ex1/` | Interactive number-base parsing, conversion and arithmetic |
| `src/Mavo_Le_Hisuve/Ex2/` | Grid of cells, formula calculation, references, cycle/error detection, text-file save/load and a desktop GUI |
| `src/Mavo_Le_Hisuve/Ex3/` | Geometry shapes and filters, arrays, lists, trees and other exercises |
| `src/Mavo_Le_Hisuve/Ex4/` | Additional array and algorithm practice |
| `src/Architecture/` | A separate student-grade exercise |

### Spreadsheet design

`Ex2Sheet` owns the cell grid and coordinates formula evaluation, reference resolution, dependency ordering and persistence. `SCell` stores cell content and display type; the `Compute/` classes distinguish numbers, text and formula errors. `Ex2GUI` renders and edits the grid using the included `StdDrawEx2` support class. The evaluator covers arithmetic operators and cell references; functions such as `if` or `sin` are explicitly outside the implemented feature set.

![Spreadsheet GUI example](https://github.com/user-attachments/assets/339f699e-356f-490c-aba2-0c88c8009ec1)

## Run a focused example

With a JDK installed, the Ex1 console program can be compiled without the other exercises:

```bash
javac -d out src/Mavo_Le_Hisuve/Ex1/Ex1.java src/Mavo_Le_Hisuve/Ex1/Ex1Main.java
java -cp out Mavo_Le_Hisuve.Ex1.Ex1Main
```

For the spreadsheet GUI, run `Mavo_Le_Hisuve.Ex2.Ex2GUI` from a Java IDE with `src/` marked as the source root. Test files use JUnit; configure that dependency separately before running them. The repository contains course-provided interfaces, support classes and test material alongside original exercise code.


## Spreadsheet workflow

The spreadsheet is the most substantial part of this repository. A user edits a cell through `Ex2GUI`; `Ex2Sheet` stores the grid and asks `SCell` to classify its content. Plain numbers and text can be displayed directly. A formula is parsed as an arithmetic expression, and references cause the evaluator to inspect other cells. Dependency depth and cycle checks prevent a circular chain from being treated as a numeric result. Error types distinguish invalid formulas and circular references. The sheet can save and load a text representation, so a session is not limited to the GUI runtime.

The GUI uses `StdDrawEx2`, which is included with the course material. The engine and UI are separable when reading the code: start with `Ex2Sheet.java`, then `SCell.java` and the `Compute/` package, and finally `Ex2GUI.java`. `Ex2SheetTest.java` captures expected spreadsheet behavior.

## Other exercises and provenance

`Ex1` implements base-number parsing and arithmetic as a console exercise. `Ex3` explores geometric types, filters and data structures. `Ex4` and `Architecture/` contain separate algorithm and student-grade exercises. These directories are independent assignments rather than layers of one application. The repository also includes teaching interfaces, drawing support and test scaffolding; inspect file headers when attributing an individual component.

## Practical limits

The formula language is intentionally narrower than Excel or Google Sheets: basic arithmetic and cell references are the useful path, while functions such as `sin` and `if` are not implemented. There is no Maven or Gradle project file tying all exercises together, so an IDE with `src/` as the source root is the simplest way to explore the larger coursework. A JDK and a configured JUnit dependency are needed to run the corresponding tests.
