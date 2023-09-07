import java.util.Scanner;
public class Position {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter string length");
        int length=sc.nextInt();
        String k[]=new String [length];
        
        System.out.print("enter the string:= ");
        for(int i=0;<=k.length;i++){
         String k[i]=sc.nextLine();
        }
         System.out.print("enter the char to find its index:= ");
        int ch=sc.nextInt();
        char s=(char)(ch);



    }
} 


    /*public class Position {
        public static void main(String[] args) {
    String s="mp09uk3693 on plateform no 4";
     char sp =s.charAt(15);
    System.out.println(sp);
    }
}
   */
