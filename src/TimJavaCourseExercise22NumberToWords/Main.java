package TimJavaCourseExercise22NumberToWords;

public class Main {

    public static void main(String[] args) {

//        System.out.println(reverse(12));
//        System.out.println(getDigitCount(100));

        numberToWords(0);
    }

    public static int reverse(int number) {

        int lastDigit = 0, reverse = 0;

        if (number > 0) {

            while (number > 0) {
                lastDigit = number % 10;

                reverse = (reverse * 10) + lastDigit;
                number = number / 10;
            }

        } else {

            while (number < 0) {

                lastDigit = number % 10;

                reverse = (reverse * 10) + lastDigit;
                number = number / 10;

            }
//
        }

        return reverse;

    }

    public static int getDigitCount(int number) {

        int count = 0;

        if(number == 0){
            return 1;
        }

        if(number < 0){
            return -1;
        }

        while (number > 0) {
            count++;
            number = number / 10;

        }

        return count;


    }


    public static void numberToWords(int number) {

        int finalNumber = reverse(number);
        int digiCount = getDigitCount(number);
        int getDigit;
        StringBuilder numberString = new StringBuilder();

        if (number > 0) {

            do {


                getDigit = finalNumber % 10;
                finalNumber = finalNumber / 10;

                switch (getDigit) {
                    case 1:
                        numberString.append("One");
                        break;
                    case 2:
                       numberString.append("Two");
                        break;
                    case 3:
                        numberString.append("Three");
                        break;
                    case 4:
                        numberString.append("Four");
                        break;
                    case 5:
                        numberString.append("Five");
                        break;
                    case 6:
                        numberString.append("Six");
                        break;
                    case 7:
                        numberString.append("Seven");
                        break;
                    case 8:
                        numberString.append("Eight");
                        break;
                    case 9:
                        numberString.append("Nine");
                        break;
                    default:
                        numberString.append("Zero");
                        break;


                }


                digiCount--;

                if(digiCount!=0){
                    numberString.append("\n");
                }

            } while (digiCount > 0);
            System.out.println(numberString);

        }else{
            System.out.println("Invalid Value");
        }


    }
}
