package TASK1;

import java.util.Scanner;
import java.util.ArrayList;
public class Question3
{
    public static void main(String[] args)
    {
        int reverse = 0;
        Scanner number=new Scanner(System.in);
        System.out.println("Enter number to reverse :");
       int num = number.nextInt();;
        System.out.println("Original Number: " + num);

        // run loop until num becomes 0
        while(num != 0) {

            // get last digit from num
            int digit = num % 10;
            reverse = reverse * 10 + digit;

            // remove the last digit from num
            num /= 10;
        }

        System.out.println("Reversed Number: " + reverse);


    }
}
