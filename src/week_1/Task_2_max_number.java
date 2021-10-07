package week_1;

import java.util.Scanner;

public class Task_2_max_number {
    public static void main(String[] args) {

        int max = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Input a first number: ");
        int num1 = in.nextInt();
        System.out.print("Input a second number: ");
        int num2 = in.nextInt();
        System.out.print("Input a third number: ");
        int num3 = in.nextInt();
        System.out.print("Input a fourth number: ");
        int num4 = in.nextInt();

        if (num1 >= num2 && num1 >= num3 && num1 >= num4)
        {
            max++;
        }

        if (num2 >= num1 && num2 >= num3 && num2 >= num4)
        {
            max++;
        }

        if (num3 >= num1 && num3 >= num2 && num3 >= num4)
        {
            max++;
        }

        if (num4 >= num1 && num4 >= num2 && num4 >= num3)
        {
            max++;
        }
        System.out.println("Maximum number of numbers " + max);
    }
}
