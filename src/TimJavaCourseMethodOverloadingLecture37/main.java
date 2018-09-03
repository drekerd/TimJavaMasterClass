package TimJavaCourseMethodOverloadingLecture37;

public class main {

    private static final String INVALID_VALUE_MESSAGE  ="invalid value";

    public static void main(String[] args) {

//        calculateMinutesAndSeconds(610,6);

        int time = calculateMinutesAndSeconds(-1);
        if(time <0){
            System.out.println(INVALID_VALUE_MESSAGE);
        }



    }

    public static int calculateMinutesAndSeconds(int minutes, int seconds){


        if((minutes >= 0) && (seconds>=0) && (seconds <=59)){

            int hour = minutes/60;
            int remainderMinutes = minutes % 60;
            System.out.println(minutes+" minutes and "+seconds+" seconds, are equal to "+hour+" hour "+remainderMinutes+" minutes "+seconds+" seconds.");
            return 1;
        }
        return -1;

    }

    public static int calculateMinutesAndSeconds(int seconds){

        if(seconds>=0){

            int minutes = seconds/60;
            int remainderSeconds = seconds%60;
            System.out.println(seconds+" seconds are "+minutes+" minutes");
            System.out.println("sec" + remainderSeconds);
            return calculateMinutesAndSeconds(minutes,remainderSeconds);
        }
        return -1;
    }

}
