package TimJavaCourseExercise12NumberOfDaysInMonth;

public class Main {

    public static void main(String[] args) {

        System.out.println(getDaysInMonth(2, 0));

    }

    public static boolean isLeapYear(int year) {

        if (year <= 0 || year > 9999) {
            return false;
        }
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
           return true;
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        int nr =31;

        if(month<=0 || month >12){
            return -1;
        }

        if (year < 1 || year > 9999) {
            return -1;
        }
        if (isLeapYear(year)) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println(31);
                    nr = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println(30);
                    nr = 30;
                    break;
                case 2:
                    System.out.println(29);
                    nr = 29;
                    break;
            }
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println(31);
                    nr= 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println(30);
                    nr= 30;
                    break;
                case 2:
                    System.out.println(28);
                    nr= 28;
                    break;
            }

        }
        return nr;
    }
}
