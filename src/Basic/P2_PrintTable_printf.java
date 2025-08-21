package Basic;

import java.util.Scanner;

public class P2_PrintTable_printf {
    public static void main(String[] args) {

        // Table Print using System.out.printf

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        for(int i=1 ; i<=10 ;i++){
            System.out.printf("%d x %d = %d \n" , number , i , number*i);
        }

    }
}
