package TimJavaCourseExerciseLecture47DigiSumChallenge;

public class Main {


    public static void main(String[] args) {

        System.out.println(digitSum(124));

    }

    public static int digitSum(int number) {

        int first, second, therd;
        if (number < 10) {
            return -1;
        }

        therd = number % 10;
        number = number / 10;

        second = number % 10;
        number = number / 10;

        first = number;

        int newNumber = first + second + therd;
        return newNumber;
    }
}
