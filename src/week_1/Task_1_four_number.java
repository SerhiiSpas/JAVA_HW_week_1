package week_1;

import java.util.Scanner;

public class Task_1_four_number {

     //Given 4 numbers of type int. Compare them and print the smallest to the console.


    public static void main(String[] args) {

        /*int num1 = 6;
        int num2 = -9;
        int num3 = 50;
        int num4 = 2;*/

        Scanner in = new Scanner(System.in);
        System.out.print("Input a first number: ");
        int num1 = in.nextInt();
        System.out.print("Input a second number: ");
        int num2 = in.nextInt();
        System.out.print("Input a third number: ");
        int num3 = in.nextInt();
        System.out.print("Input a fourth number: ");
        int num4 = in.nextInt();

        if (num1 <= num2 && num1 <= num3 && num1 <= num4)
        {
            System.out.println("Number " + num1 + " smallest ");
        }

        else if (num2 <= num1 && num2 <= num3 && num2 <= num4)
        {
            System.out.println("Number " + num2 + " smallest ");
        }

        else if (num3 <= num1 && num3 <= num2 && num3 <= num4)
        {

            System.out.println("Number " + num3 + " smallest ");
        }

        else if (num4 <= num1 && num4 <= num2 && num4 <= num3)
        {
            System.out.println("Number " + num4 + " smallest ");
        }

    }
}
