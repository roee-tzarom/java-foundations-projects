// -----------------------------------------------------------------------------
// Spreadsheet engine overview
//
// Ex2Sheet owns the two-dimensional cell table and coordinates every stage of
// evaluation: parsing cell text, resolving cell references, calculating formulas,
// detecting dependency cycles, and persisting non-empty cells to a text file.
//
// Evaluation uses Computable values to keep numbers, text, and formula errors
// distinct. The depth() pass identifies which formulas are ready to evaluate and
// leaves cyclic dependencies at depth -1 so eval() can report them clearly.
// Formula parsing recursively locates the outermost operator, preserving ordinary
// arithmetic precedence and allowing parenthesized subexpressions.
// -----------------------------------------------------------------------------

package Mavo_Le_Hisuve.Ex2;


import Mavo_Le_Hisuve.Ex2.Compute.*;
import Mavo_Le_Hisuve.Ex2.Compute.*;


import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Ex2Sheet implements Sheet {
    private Cell[][] table;


    public Ex2Sheet(int x, int y) {
        table = new SCell[x][y];
        for (int i = 0; i < x; i = i + 1) {
            for (int j = 0; j < y; j = j + 1) {
                table[i][j] = new SCell(Ex2Utils.EMPTY_CELL, this, new CellEntry(i, j));
            }
        }
        eval();
    }


    public Ex2Sheet() {
        this(Ex2Utils.WIDTH, Ex2Utils.HEIGHT);
    }


    public static boolean isNumber(String s) {
        boolean ans = true;
        try {
            double d = Double.parseDouble(s);
        } catch (Exception e) {
            ans = false;
