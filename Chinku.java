/*public class Chinku {
    public static void main(String args[]){
        int s="i am a good person".length();       //count string name with space.
        System.out.print("length:"+s);
    }
}*/
import java.util.Scanner;
class Chinku{
    public void manne(String t){
        int  s=t.length();
         System.out.print("length:"+s);
    }
}
class Mahan{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a string:= ");
        String t=sc.nextLine();
        Chinku obj=new Chinku();
        obj.manne(t);
    }
}
