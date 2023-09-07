// /6) Write a java program to find all possible palindrom of given String.
import java.util.Scanner;
public class As6 {
    public static void main(String[] args) {
      String str = "madam";
      String reversestr = "";
      int strlength=str.length();
        

            for(int j=(strlength-1);j>=0;j--){
            reversestr=reversestr+str.charAt(j);
        }
            String temp="";
            if(str==reversestr)
                System.out.print("String is palindrome");
            else
            System.out.print("string is not palindrome");
            
    }
    
} 


