package TimJavaCourseExercise13SumOdd;

public class Main {

    public static void main(String[] args) {


        System.out.println(sumOdd(100,1000));
    }

    public static boolean isOdd(int num){

        if(num%2 != 0 && num>0){
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end){

        int sum=0;
        if(end >= start && start>0) {

            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum = sum + i;
                }
            }
            return sum;
        }else{
            return -1;
        }

    }
}
