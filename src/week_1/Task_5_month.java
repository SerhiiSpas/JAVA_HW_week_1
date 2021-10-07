package week_1;

import java.util.Scanner;

public class Task_5_month {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of month: ");
        int month = in.nextInt();

        switch (month)
        {
            case 12:
            case 1:
            case 2:
                System.out.print("It is winter now");
                break;

            case 3:
            case 4:
            case 5:
                System.out.print("Spring is now");
                break;

            case 6:
            case 7:
            case 8:
                System.out.print("It is summer now");
                break;

            case 9:
            case 10:
            case 11:
                System.out.print("Now Autumn");
                break;

            default:
                System.out.print("Incorrect month value");
                break;
        }
    }
}
