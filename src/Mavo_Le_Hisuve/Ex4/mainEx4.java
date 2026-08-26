// -----------------------------------------------------------------------------
// Entry point for Exercise 4. It gathers the exercise-specific operations into
// one executable flow so the required behaviour can be demonstrated directly.
// -----------------------------------------------------------------------------

package Mavo_Le_Hisuve.Ex4;


import static org.junit.Assert.assertTrue;


public class mainEx4 {
    public static int[] maxS(int [] arr){
        if(arr.length == 2){return arr;}
        int start = 0;
        int end = 0;
        int range = arr[1]-arr[0];
        int max = 0,min = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1]-arr[i]==range){end = i+1;}
            if (end-start > max-min){
                min = start;
                max = end;
            } else if (arr[i+1]-arr[i]!=range) {
                start = i;
                end = i+1;
                range = (arr[i+1]-arr[i]);
            }
        }
        int[] ans = newArr(arr,max,min);
        return ans;
    }
    public static int[] newArr(int[] arr,int max,int min){
        int[] ans = new int[((max-min)+1)];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = arr[min+i];
        }
        return ans;
    }
    public static void shuffle(double[] arr){
        int length = arr.length;
        double swap;
        for (int i = 0; i < length; i++) {
