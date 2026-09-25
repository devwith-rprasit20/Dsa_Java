import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radious : ");
        double r = sc.nextDouble();
        double a = 3.14 * r * r;
        System.out.print("Area is :");
        System.out.println(a);

    }

}
