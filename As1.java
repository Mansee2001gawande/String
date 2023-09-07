/*5) Write a java program to reverse each word of String.
	Sample Input: “Java Is Plateform Independent”   */


    public class As1 {
    public static void main(String[] args) {
        String str = "Java Is Platform Independent";

        String[] word = str.split(" ");

        for (int i = 0; i < word.length; i++) {
            String rev = " ";
            for (int j = 0; j < word[i].length(); j++){
            char r = word[i].charAt(j);
            System.out.print(str.charAt(j));
             rev = r + rev;
             }
             System.out.print(" "+rev);
        }
     }
 } /*

 class As1{
    public static void main(String[] args) {
        String str="JAVA IS PLATEFORM INDEPENDENT";
        String word[]=str.split(" ");

        for(int i = 0; i < word.length ;i++){
            String rev=" ";
            for(int j=0 ;j < word[i].length() ;j++){
                char ch=word[i].charAt(j);
                System.out.print(str.charAt(j));

                rev=ch+rev;
            }
            System.out.print(" "+rev);
        }
    }
 }  */
            


