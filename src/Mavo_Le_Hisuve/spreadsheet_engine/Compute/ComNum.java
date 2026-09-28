// Numeric result representing a literal number entered directly into a cell.

package Mavo_Le_Hisuve.spreadsheet_engine.Compute;


public class ComNum implements Computable{
    private double value;


    public double getNumValue(){
        return value;
    }


    public ComNum (double v) {this.value = v; }
}

