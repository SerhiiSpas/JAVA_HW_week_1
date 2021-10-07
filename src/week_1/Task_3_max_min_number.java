package week_1;

import java.util.Scanner;

public class Task_3_max_min_number {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a first number: ");
        int num1 = in.nextInt();
        System.out.print("Input a second number: ");
        int num2 = in.nextInt();
        System.out.print("Input a third number: ");
        int num3 = in.nextInt();
        System.out.print("Input a fourth number: ");
        int num4 = in.nextInt();
        System.out.print("Input a fourth number: ");
        int num5 = in.nextInt();

        /*----------smallest---------*/
        if (num1 <= num2 && num1 <= num3 && num1 <= num4 && num1 <= num5)
        {
            System.out.println("Number " + num1 + " smallest ");
        }

        else if (num2 <= num1 && num2 <= num3 && num2 <= num4 && num2 <= num5)
        {
            System.out.println("Number " + num2 + " smallest ");
        }

        else if (num3 <= num1 && num3 <= num2 && num3 <= num4 && num3 <= num5)
        {
            System.out.println("Number " + num3 + " smallest ");
        }

        else if (num4 <= num1 && num4 <= num2 && num4 <= num3 && num4 <= num5)
        {
            System.out.println("Number " + num4 + " smallest ");
        }

        else if (num5 <= num1 && num5 <= num2 && num5 <= num3 && num5 <= num4)
        {
            System.out.println("Number " + num5 + " smallest ");
        }
        /*----------the biggest---------*/
        if (num1 >= num2 && num1 >= num3 && num1 >= num4 && num1 >= num5)
        {
            System.out.println("Number " + num1 + " the biggest ");
        }
        else if (num2 >= num1 && num2 >= num3 && num2 >= num4 && num2 >= num5)
        {
            System.out.println("Number " + num2 + " the biggest ");
        }
        else if (num3 >= num1 && num3 >= num2 && num3 >= num4 && num3 >= num5)
        {
            System.out.println("Number " + num3 + " the biggest ");
        }
        else if (num4 >= num1 && num4 >= num2 && num4 >= num3 && num4 >= num5)
        {
            System.out.println("Number " + num4 + " the biggest ");
        }
        else if (num5 >= num1 && num5 >= num2 && num5 >= num3 && num5 >= num4) {
            System.out.println("Number " + num5 + " the biggest ");
        }
    }
}
