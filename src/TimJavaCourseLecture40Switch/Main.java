package TimJavaCourseLecture40Switch;

public class Main {

    public static void main(String[] args) {

        char charValue = 'H';

        switch(charValue){

            case 'A':
                System.out.println("Value was A");
                break;
            case 'B':
                System.out.println("Value was B");
                break;
            case 'C':
                System.out.println("Value was C");
                break;
            case 'D':
                System.out.println("Value was D");
                break;
            case 'E':
                System.out.println("Value was E");
                break;
            default:
                System.out.println("None of the letters match");
                break;
        }


        String month = "January";

        switch (month.toLowerCase()){

            case "january": case" june":
                System.out.println("January");
                break;
            default:
                System.out.println("no");
        }
    }
}
