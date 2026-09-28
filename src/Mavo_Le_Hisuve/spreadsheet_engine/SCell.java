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
    public int getOrder() {
        return order;
    }

    //@Override
    @Override
    public String toString() {
        return getData();
    }

    @Override
    public void setData(String s) {
        line = s;
    }
    @Override
    public String getData() {
        return line;
    }

    @Override
    public int getType() {
        return type;
    }

    @Override
    public void setType(int t) {
        type = t;
    }

    @Override
    public void setOrder(int t) {
        order = t;
    }
}
