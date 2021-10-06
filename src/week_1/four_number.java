package week_1;

import java.util.Scanner;

public class four_number {
    /*
     * Даны 4 числа типа int. Сравнить их и вывести наименьшее на консоль.
     */

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

        if (num1 <= num2 && num1 <= num3 && num1 <= num4)
        {
            System.out.println("Number " + num1 + " least ");
        }

        else if (num2 <= num1 && num2 <= num3 && num2 <= num4)
        {
            System.out.println("Number " + num2 + " least ");
        }

        else if (num3 <= num1 && num3 <= num2 && num3 <= num4)
        {

            System.out.println("Number " + num3 + " least ");
        }

        else if (num4 <= num1 && num4 <= num2 && num4 <= num3)
        {

            System.out.println("Number " + num4 + " least ");
        }
        in.close();

    }
}
