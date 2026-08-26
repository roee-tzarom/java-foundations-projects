// -----------------------------------------------------------------------------
// Demonstration entry point for the number-system utilities. It exercises the
// public operations with representative values and formats their results.
// -----------------------------------------------------------------------------

package Mavo_Le_Hisuve.Ex1;
import java.util.Scanner;


public class Ex1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = "", num2 = "", quit = "quit";


        while (!num1.equals(quit) && !num2.equals(quit)) {
            System.out.println();
            System.out.println("Ex1 class solution:");
            System.out.println("Enter a string as number#1 (or \"quit\" to end the program): ");
            num1 = sc.next();


            if (!num1.equals(quit)) {
                boolean isNum1Valid = Ex1.isNumber(num1);
                int value1;
                if (isNum1Valid) {
                    value1 = Ex1.number2Int(num1);
                } else {
                    value1 = -1;
                }
                System.out.println("num1= " + num1 + " is number: " + isNum1Valid + " , value: " + value1);


                if (isNum1Valid) {
                    System.out.println("Enter a string as number#2 (or \"quit\" to end the program): ");
                    num2 = sc.next();


                    if (!num2.equals(quit)) {
                        boolean isNum2Valid = Ex1.isNumber(num2);
                        int value2;
                        if (isNum2Valid) {
                            value2 = Ex1.number2Int(num2);
                        } else {
                            value2 = -1;
                        }
