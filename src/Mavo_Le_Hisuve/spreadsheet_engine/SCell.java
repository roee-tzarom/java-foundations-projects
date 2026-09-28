// -----------------------------------------------------------------------------
// Concrete spreadsheet cell. Stores user-entered text together with its display
// category, evaluation order, coordinate, and owning sheet context.
// -----------------------------------------------------------------------------

package Mavo_Le_Hisuve.spreadsheet_engine;


import Mavo_Le_Hisuve.spreadsheet_engine.Compute.ComExprNum;
import Mavo_Le_Hisuve.spreadsheet_engine.Compute.ComText;


public class SCell implements Cell {
    private Spreadsheet sheet;
    private String line;
    private int type;
    private int order;


    public boolean isNumber(String text) {
        return Spreadsheet.isNumber(text);
    }


    public boolean isText(String text) {
        return sheet.compute(text) instanceof ComText;
    }


    public boolean isForm(String text) {
        return sheet.compute(text) instanceof ComExprNum;
    }


    public double computeForm(String form) {
        if (sheet.compute(form) instanceof ComExprNum comExprNum) {
            return comExprNum.getNumValue();
        }
        return -1;
    }


    public SCell(String s,Spreadsheet sheet,CellEntry cellEntry) {
        this.sheet = sheet;
        setData(s);
    }


    @Override
