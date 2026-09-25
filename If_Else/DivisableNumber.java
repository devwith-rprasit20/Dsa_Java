package If_Else;

import java.util.Scanner;

public class DivisableNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int x = sc.nextInt();
        if (x % 5 == 0) {
            System.out.println("The Number is Divisable By Five");
        } else {
            System.out.println("This Number is not divisable By Five");
        }
    }
}
