package If_Else;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");

        int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("This Number is Even Number ");
        }

        else {
            System.out.println("This Number is Odd Number ");
        }

    }
}