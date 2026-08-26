// -----------------------------------------------------------------------------
// Concrete spreadsheet cell. Stores user-entered text together with its display
// category, evaluation order, coordinate, and owning sheet context.
// -----------------------------------------------------------------------------

package Mavo_Le_Hisuve.Ex2;


import Mavo_Le_Hisuve.Ex2.Compute.ComExprNum;
import Mavo_Le_Hisuve.Ex2.Compute.ComText;


public class SCell implements Cell {
    private Ex2Sheet sheet;
    private String line;
    private int type;
    private int order;


    public boolean isNumber(String text) {
        return Ex2Sheet.isNumber(text);
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


    public SCell(String s,Ex2Sheet sheet,CellEntry cellEntry) {
        this.sheet = sheet;
        setData(s);
    }


    @Override
