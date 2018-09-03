package TimJavaCourseRandomStuff;

import com.sun.javafx.binding.StringFormatter;

public class Main {


    public static void main(String[] args) {

        for(int i = 8; i >= 2; i--){

            System.out.println("10,000 at "+i+"% interest = "+ String.format("%.2f",calculateInterestRate(10000.0,i)));
        }

    }

    public static double calculateInterestRate(double amount, double interest){

        return amount * (interest/100);
    }

}
