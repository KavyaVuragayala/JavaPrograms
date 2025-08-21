package Basic;

import java.util.Scanner;

public class P1_InputFromUser {

    public static void main(String[] args) {

        // How to take input from users

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        System.out.println("Number :"+ number);

        System.out.println("Enter a name ");
        String name = sc.next();
        System.out.println("Name :"+ name );

        System.out.println("Hi Your Name is "+name+ ",Your age is "+ number);

    }
}
