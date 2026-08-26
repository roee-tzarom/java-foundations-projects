// -----------------------------------------------------------------------------
// Exercise 3 entry point and utility routines. This file ties together the
// geometry, filtering, and data-structure examples implemented in this package.
// -----------------------------------------------------------------------------

package Mavo_Le_Hisuve.Ex3;




import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


import Mavo_Le_Hisuve.Ex3.pdfUtils.*;
import Mavo_Le_Hisuve.Ex3.pdfUtils.*;


public class Ex3 {
    public static void main(String[] args) {
        ArrayList<GeoShape> arr1 = new ArrayList<GeoShape>();
        arr1.add(new Circle2D(new Point2D(0,0),5));
        arr1.add(new Pizza(new Circle2D(new Point2D(0,0),20),50,90));
        arr1.get(0).area();
        Circle2D d = new Circle2D(new Point2D(0,0),5);
        System.out.println(d.area());






        int n = 3;
        int m = 3;
        int[][] matrix = Q1(n, m);
        System.out.println("ans 1: ");
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        String str = "aaabbbcccxxyaaa";
        System.out.println("ans 2: " + q2(str));
        String s1 = "to be or not to be";
        String s2 = "be";
        System.out.println("ans 3: " + Q5(s1, s2));
        double[] arr = new double[6];
        arr[0] = 1;
        arr[1] = 2;
