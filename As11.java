//11) Input name of a person and count how many vowels it contains. Use String class methods.
public class As11 {
   public static void main(String[] args) {
    String str="chinki";
    int count=0;
    //char vowel[]={'a','A','e','E','I','i','O','o','U','u'};
      for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='a'||str.charAt(i)=='A'||str.charAt(i)=='e'||str.charAt(i)=='E'||str.charAt(i)=='I'
        ||str.charAt(i)=='i'||str.charAt(i)=='O'||str.charAt(i)=='o'||str.charAt(i)=='U'||str.charAt(i)=='u')
               count++;
      }
        System.out.println(count);

}
}