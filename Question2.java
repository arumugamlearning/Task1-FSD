package TASK1;

import java.util.Scanner;

public class Question2
{
    public static void main(String[] args)
    {
        String check ="Yes";
        do {
            Scanner number = new Scanner(System.in);
            System.out.println("Enter the number to check :");
            int i = number.nextInt();
            if (i >= 0) {
                System.out.println("The number you enter is Positive");
            } else {
                System.out.println("The number you enter is Negative");
            }
            System.out.println("Do you like to continue Yes/No");
            Scanner status = new Scanner(System.in);
            check = status.next();

        }while (check=="No");
    }

}
