import java.util.Scanner;

public class Simpleinterest {
    public static void main(String[] args) {
        Scanner pc = new Scanner(System.in);

        System.out.print("Enter the Principal Amount :");
        double p = pc.nextDouble();
        System.out.print("Enter the rate of Interest :");
        double r = pc.nextDouble();
        System.out.print("Enter the Time :");
        double t = pc.nextDouble();
        System.out.print("Simple Interest is :");
        double i = p * t * r / 100;
        System.out.println(i);
    }

}
