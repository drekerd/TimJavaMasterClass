package TimJavaCourseExerciseExircise14Palindrome;

import com.sun.jdi.IntegerValue;

public class Main {

    public static void main(String[] args) {


//        System.out.println(isPalindrome(2002));

    }

    public static boolean isPalindrome(int number){

        int revNumber=0,temp=number;
        System.out.println("rev inicio "+revNumber);
        System.out.println("temp " + temp);

        while(number!=0) {

            int unitDigit = number%10;

            System.out.println("unit "+ unitDigit);
            System.out.println("unit "+ number%10);

            revNumber = revNumber*10 + unitDigit;
            System.out.println("rev "+revNumber);

            number = number/10;

        }

        if(revNumber==temp) {

            return true;

        }

        return false;

    }



    public static boolean isPalindromeSecond(int number){



        if(number<0){
            number = number - (number+number);

        }


        String original;
        int count;
        String originalNumber = "";
        original = Integer.toString(number);
        char[] reverse = new char[original.length()];
        char[] charOrigi = new char[original.length()];





        count = 0;
        for(int i=0;i<=original.length()-1;i++) {
            count++;
            reverse[i] = original.charAt(original.length()-count);

        }
        if(originalNumber.valueOf(reverse).equals(Integer.toString(number))){
            return true;
        }
        return false;
    }

}
