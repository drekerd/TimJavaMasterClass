package TimJavaCourseExercise15FirstAndLastDigitSum;

public class Main {

    public static void main(String[] args) {


        System.out.println(sumFirstAndLastDigit(5));

    }

    public static int sumFirstAndLastDigit(int number) {

        if(number < 0){
            return -1;
        }

        int last = number % 10;
        while (number > 0) {

            if (number < 10) {
                break;
            }

            number = number / 10;

        }

        number = number + last;

        return number;

    }
}
