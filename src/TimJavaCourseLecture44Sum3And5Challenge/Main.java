package TimJavaCourseLecture44Sum3And5Challenge;

public class Main {

    public static void main(String[] args) {

        int count = 0, sum = 0;

        for(int i = 1;1<=1000;i++) {
            if (isDividedBy(i)) {
                sum = sum +i;
                count++;

                if(count == 5){
                    break;
                }
            }
        }
        System.out.println(sum);

    }

    public static boolean isDividedBy(int number){

        if(number%3 == 0 && number%5==0){
            return true;
        }
        return false;
    }

}
