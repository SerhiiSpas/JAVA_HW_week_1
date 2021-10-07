package week_1;

import java.util.Scanner;

public class Task_4_name {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        String name1 = in.nextLine();
        String n1 = name1.trim();

        System.out.print("Enter the second name: ");
        String name2 = in.nextLine();
        String n2 = name2.trim();

        boolean result = n1.equalsIgnoreCase(n2);


        if (result == true)
        {
            System.out.print("Names are equal, people are namesakes");
        }
        else
        {
            System.out.print("The names are not equal");
        }
    }

}
