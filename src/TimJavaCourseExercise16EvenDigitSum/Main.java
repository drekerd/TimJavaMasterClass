package TimJavaCourseExercise16EvenDigitSum;

public class Main {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(-1024));

    }

    public static int getEvenDigitSum(int number){

        if(number < 0){
            return -1;
        }

        int sum = 0;
        int isEven = 0;

        while(number > 0){

            isEven = number%10;
            if(isEven%2 == 0){
                sum = sum + isEven;
            }

            number = number / 10;

        }

        return sum;
    }

}
