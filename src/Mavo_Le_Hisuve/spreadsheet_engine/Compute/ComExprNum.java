// Numeric result produced when evaluating a spreadsheet expression.

package Mavo_Le_Hisuve.spreadsheet_engine.Compute;


public class ComExprNum  implements Computable{
    private double numValue;


    public double getNumValue(){
        return numValue;
    }


    public ComExprNum(double v) { this.numValue = v; }
}

