// Text result representing content that is neither a formula nor a number.

package Mavo_Le_Hisuve.Ex2.Compute;


public class ComText implements Computable {
    public String text;


    public String getText(){
        return text;
    }


    public  ComText (String text) {this.text = text; }
}

