package TimJavaCourseExercise10Playingcat;

public class Main {

    public static void main(String[] args) {

        System.out.println(isCatPlaying(false, 0));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {

        if (summer) {
            if (temperature <= 45 && temperature >= 25) {
                return true;
            }
        }
        if (!summer) {
            if(temperature <= 35 && temperature >= 25) {
                return true;
            }
        }
        return false;
    }
}
