package Basic;

import java.util.Scanner;

public class P15_RemoveDuplicateString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str= sc.nextLine();

        String output = removeDuplicate(str);
        System.out.println(output);

    }

    public static String removeDuplicate(String str){

        int count =0;
        String resultedString ="";
        if(str==null || str.isEmpty()){
            System.out.println("Enter valid a String !!!!!");
            System.exit(0);
        }

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c != ' ' && resultedString.indexOf(c)== -1){
                resultedString += c;
            }
        }
        return resultedString ;
    }
}
