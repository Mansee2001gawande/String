import java.util.Scanner;
class Capital{
    public void kk(String p){
       // String s2=p.toUpperCase();
        String s3=p.toLowerCase();
        String s4=p;
        int    l=p.length();
        System.out.println((s3)+" length= "+(l));
        if(s3==s4){                                 //mansee!=Mansee
            System.out.println("TRUE");
        } else
        System.out.println("false");
    } 
}
class Chetna{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the String:= ");
        String p=sc.nextLine();
        Capital obj=new Capital();
        obj.kk(p);
    }
}