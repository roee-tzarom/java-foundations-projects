// Numeric result produced when evaluating a spreadsheet expression.

package Mavo_Le_Hisuve.Ex2.Compute;


public class ComExprNum  implements Computable{
    private double numValue;


    public double getNumValue(){
        return numValue;
    }


    public ComExprNum(double v) { this.numValue = v; }
}

