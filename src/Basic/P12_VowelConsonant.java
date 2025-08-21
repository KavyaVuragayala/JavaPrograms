package Basic;

import java.util.Scanner;

public class P12_VowelConsonant {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();
        int vowelcount =0;
        int consonantcount =0;

        for(int i=0; i<str.length();i++){
            char c = str.charAt(i);
            if(c == 'a' || c =='e' || c =='i' || c=='o' || c =='u'){
                vowelcount++;
            }else {
                consonantcount++;
            }
        }

        System.out.println("Vowels are : " + vowelcount);
        System.out.println("Consonants are :" + consonantcount);




    }
}
