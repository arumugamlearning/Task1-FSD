package TASK1;

import java.util.Scanner;

public class Question5
{
    public static void main(String[] args) {
        System.out.println("Enter the puchased amount:");
        Scanner objamount=new Scanner(System.in);
        float total;
        int amount = objamount.nextInt();
        if(amount<500)
        {
            System.out.println("Total Payable amount is :"+amount);
        } else if (amount>500 && amount<1000)
        {
            total = amount - (float) (amount*10)/100;
            System.out.println("Total Payable amount after 10% discount is :"+ total);
        }
        else
        {
            total=amount - (float) (amount*20)/100;
            System.out.println("Total Payable amount after 20% discount is :"+total);
        }

    }
}
