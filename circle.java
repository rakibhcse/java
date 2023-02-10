import java.util.Scanner;

public class circle {

        public static void main(String[] args) {
            Scanner input =new Scanner(System.in);
            double radius ,area;
            System.out.println("Enter radius:");
            radius=input.nextDouble();
            //System.out.println("enter height:");
           //height=input.nextdouble();
            area=3.1416*radius*radius;
            System.out.println("Area of a circle="+area);
        }
    }


