package TimJavaCourseExercise7AreaCalculator;

public class AreaCalculator {

    private static final String INVALID_VALUE = "Invalid value";


    public static void main(String[] args) {

        System.out.println(area(5.0));
        System.out.println(area(5.0,4.0));
    }

    public static double area(double radius){

        if(radius<0){
            return -1;
        }

        double areaC = (radius*radius) * 3.14159;

        return areaC;
    }

    public static double area(double x, double y){

        if(x<0 || y<0){
            return -1;
        }

        double area = x*y;
        return area;
    }
}
