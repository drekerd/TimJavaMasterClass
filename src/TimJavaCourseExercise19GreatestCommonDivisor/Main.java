package TimJavaCourseExercise19GreatestCommonDivisor;

public class Main {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(81,153));

    }

    public static int getGreatestCommonDivisor(int number1, int number2){

        int run = 0;

        if(number1 < 10 || number2 < 10){
            return -1;
        }

        if(number1 > number2){
             run = number1;
        }else{
             run = number2;
        }

        for(int i = run;i>0;i--){

            if(number1%i == 0 && number2%i == 0){
                return i;
            }

        }
        return -1;
    }
}
