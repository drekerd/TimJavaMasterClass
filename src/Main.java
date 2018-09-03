public class Main {


    public static void main(String[] args) {

//        System.out.println(Double.toString(caclFeetAndInchestoCentimeters(-10,6)));
        System.out.println(Double.toString(caclFeetAndInchestoCentimeters(100)));

    }


    public static double caclFeetAndInchestoCentimeters(double in, double ft){

              double cm;
        if(ft >= 0  && in >= 0 && in <=12){

            cm = in / 0.39370;
            System.out.println(in + " inches is equal to "+cm+" cm");
            cm = ft * 30.48;
            System.out.println(ft + " feet is equal to "+cm+"cm");
            return 1;

        }
            return -1;
    }

    public static double caclFeetAndInchestoCentimeters(int in){

        double ft;
        if(in >= 0){

            ft = in * 12;
            System.out.println(in + " inches is equal to "+ft+"ft");
            return caclFeetAndInchestoCentimeters(in,ft);


        }
        return -1;
    }




}
