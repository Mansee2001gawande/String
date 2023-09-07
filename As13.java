/*13)WAP check if two Strings are anagrams of each other?
(Hint Anagram words: LISTEN - SILENT 
				  TRIANGLE - INTEGRAL)*/
public class As13 {
    public static void main(String[] args) {
        String s1="triangle";
        String s2="integral";
        
        int a=0;
        int b=0;

        for(int i=0;i<s1.length();i++){
            a=a +s1.charAt(i);
            System.out.println(s1.charAt(0));
        }
            for(int j=0;j<s2.length();j++){
            b=b +s1.charAt(j);
        }
        if(a==b)
            System.out.println("no is anagram");
        
        else
        System.out.println("no is not anagram");

    }
}
