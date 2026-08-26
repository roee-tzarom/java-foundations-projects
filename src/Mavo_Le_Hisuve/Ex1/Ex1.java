// -----------------------------------------------------------------------------
// Number-system utilities: arithmetic, maximum selection, and conversions among
// bases 2 through 16. Each method works on textual representations so callers
// can keep the original base alongside the computation.
// -----------------------------------------------------------------------------

package Mavo_Le_Hisuve.Ex1;


public class Ex1 {


    public static int number2Int(String num) {
        int ans = -1;
        if (!isNumber(num)) {
            return ans;
        } else if (!num.contains("b")) {
            ans = Integer.parseInt(num);
        } else {
            String sum = num.substring(0, num.length() - 2);


            char[] c = num.toCharArray();
            int base = 0;
            int last = c.length - 1;
            if (c[last] >= '2' && c[last] <= '9') {
                base += c[last] - '0';
            } else {
                base += c[last] - 'A' + 10;
            }
            ans = toDecimal(sum, base);
        }
        return ans;
    }


    public static int toDecimal(String num, int base) {
        int ans = 0;
        if (num == "0") {
            return ans;
        }
        char[] c = num.toCharArray();
        int last = c.length - 1;
        for (int i = 0; i < c.length; i++) {
            if (c[last - i] >= 'A' && c[last - i] <= 'G') {
                ans = ans + ((c[last - i] - 'A' + 10) * (int) Math.pow(base, i));
