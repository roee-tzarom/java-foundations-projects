// -----------------------------------------------------------------------------
// Spreadsheet API: defines the operations available to callers of a worksheet,
// including cell access, evaluation, bounds checks, and file persistence.
// -----------------------------------------------------------------------------

package Mavo_Le_Hisuve.Ex2;


import java.io.IOException;


/**
 * ArielU. Intro2CS, Ex2: https://docs.google.com/document/d/1-18T-dj00apE4k1qmpXGOaqttxLn-Kwi/edit?usp=sharing&ouid=113711744349547563645&rtpof=true&sd=true
 * DO NOT CHANGE THIS INTERFACE:
 *
 * This interface represents a simple SpreadSheet, which include a 2D
 * array of Cells, with get & set methods for each cell (int x, int y), as well as width, height of this SpreadSheet.
 * The main methods of the interface are:
 *
 * String eval(int x, int y), computes the actual String which should be presented in the x,y cell.
 *
 * eval(), computes the actual 2D array of Strings which should be presented of the SpreadSheet.
 *
 * int[][] depth(), computes a 2D array of the same dimension as this SpreadSheet, each entry holds its dependency depth.
 */
public interface Sheet {
    /**
     * Check is the x,y coordinate is with in this table.
     * @param x - integer, x-coordinate of the table (starts with 0).
     * @param y - integer, y-coordinate of the table (starts with 0).
     * @return true iff the x,y coordinate is a valid entry (cell) with in this spreadsheet.
     */
    boolean isIn(int x, int y);


    /**
     * @return the dimension (length) of the x-coordinate of this spreadsheet.
     *
     */
    public int width();


    /**
     * @return the dimension (length) of the y-coordinate of this spreadsheet.
     */
