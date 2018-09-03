package TimJavaCourseExercise17SharedDigit;

public class Main {


    public static void main(String[] args) {

        System.out.println(hasSharedDigit(01,14));

    }

    public static boolean hasSharedDigit(int number1, int number2) {

        int number1Hold1, number1Hold2;
        int number2Hold1, number2Hold2;

        number1Hold1 = number1%10;
        number1Hold2 = number1/10;
        number2Hold1 = number2%10;
        number2Hold2 = number2/10;

        System.out.println("number 1 hold 1 "+number1Hold1);
        System.out.println("number 1 hold 2 "+number1Hold2);
        System.out.println("number 2 hold 1 "+number2Hold1);
        System.out.println("number 2 hold 2 "+number2Hold2);

        if(number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99){
            return false;
        }
        else if (number1Hold1 == number2Hold1 || number1Hold1 == number2Hold2 || number1Hold2 == number2Hold1 || number1Hold2 == number2Hold2){
            return true;
        }
    return false;
    }


}
