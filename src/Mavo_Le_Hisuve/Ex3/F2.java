// Function helper used by the exercise to encapsulate a reusable mathematical mapping.

package Mavo_Le_Hisuve.Ex3;
import Mavo_Le_Hisuve.Ex3.pdfUtils.Parabula;


import java.util.ArrayList;




// ans 15:
public class F2 implements Parabula {
    private double a, b, c;


    public F2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public double f(double x) {
        return a * x * x + b * x + c;
    }


    @Override
    public Parabula add(Parabula p) {
        double[] otherCoffs = p.get();
        double newA = this.a + otherCoffs[0];
        double newB = this.b + otherCoffs[1];
        double newC = this.c + otherCoffs[2];
        return new F2(newA, newB, newC);
    }


    @Override
    public double[] get() {
        return new double[] {a, b, c};
    }


    @Override
