public class Blank {
    
}
    public static void main(String[] args) {
       String  str="67, 89, 23, 67, 12, 55, 66";
       String a []  = str.split(" ");
for (String b:a){
       System.out.print(b);
       }
        int ch[]=new int [a.length];
       for(int i=0;i<ch.length;i++){
       ch[i] = Integer.parseInt(a[i]);
       //System.out.println(ch[i]);
       }
      // int sum=0;
        String sum="";
        for(int i=0;i<ch.length;i++){
            sum=sum+Integer.parseInt(a[i]);//ch[i];
         }
        
       //System.out.println("sum="+sum); */


    }
    
}
