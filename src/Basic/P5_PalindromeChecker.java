package Basic;

import java.util.Scanner;

public class P5_PalindromeChecker {
    public static void main(String[] args) {

        // Create a program that checks whether a given string is a palindrome
        //Use an if-else statement to determine if the string is a palindrome.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String str = sc.next();
        int n = str.length();
        char[] c = str.toCharArray();
        boolean isPalindrome = false;

        for(int i =0; i<n /2 ; i++){

            if(c[i]==c[n-i-1]){
                isPalindrome = true;
                break;
            }

        }

        if(isPalindrome){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }


    }

}
