package TASK1;

import java.util.Scanner;

public class Question4
{
    public static void main(String[] args)
    {
        int[] num_list ={1000,201,300};
        if(num_list[0]>num_list[1])
        {
            if(num_list[0]>num_list[2])
            {
                System.out.println(num_list[0]+" is the bigger number among three");
            }
        }
        else
        {
            if(num_list[1]>num_list[2])
            {
                System.out.println(num_list[1]+" is the bigger number among three");
            }
            else
            {
                System.out.println(num_list[2]+" is the bigger number among three");
            }

            }
        }
    }

