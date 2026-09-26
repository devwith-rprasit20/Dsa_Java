package If_Else;

import java.util.Scanner;
public class AbsoluteNumber2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int x = sc.nextInt();
        if (x < 0) x = -x;
        {
            System.out.println(x);
        }



    }   
}
