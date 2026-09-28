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
