package TimJavaCourseLecture45WhileandDoWhile;

public class Main {

    public static void main (String[] args){

        int countStart = 4, end =20;
        int countEven = 0;


        while(countStart <=20){

            countStart++;

            if(!evenNumber(countStart)){
                continue;
            }

            System.out.println("Even Number " + countStart);
            countEven++;
            if (countEven==5){
                break;
            }

        }
        System.out.println("The total of even numbers are "+countEven);


    }

    public static boolean evenNumber(int number){

        if(number%2==0){
            return true;
        }
        return false;
    }

}
