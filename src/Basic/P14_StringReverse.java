package Basic;

import java.util.Scanner;

public class P14_StringReverse {

    public static void main(String[] args) {
        String reverse;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str= sc.nextLine();
        reverse = reversedString(str);
        System.out.println(reverse);

    }

    public static String reversedString(String str){

        String ReversedString = "";
        if(str == null || str == ""){
            System.out.println("Please Enter a String !!!!!");
            System.exit(0);
        }

        for(int i=str.length()-1 ; i>=0;i--) {
            ReversedString= ReversedString + str.charAt(i);

        }

        return ReversedString;
    }

}

