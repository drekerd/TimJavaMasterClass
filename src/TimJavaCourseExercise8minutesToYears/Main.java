package TimJavaCourseExercise8minutesToYears;

public class Main {


    public static void main(String[] args) {

    printYearsAndDays(0);
    }

    public static void printYearsAndDays(long minutes){

        if(minutes<0){
            System.out.println("Invalid Number");
        }else{
            long hour = minutes /60;
            if (hour>24 || hour == 0){
                long day = hour/24;
                if(day>=365 || day == 0){
                    long year = day / 365;
                    long remamingDays = day%365;
                    System.out.println(minutes+" min = "+year+" y and "+remamingDays+" d");
                }

            }
        }

    }
}

