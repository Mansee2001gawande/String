//12) Input data exactly in the following format, and print sum of all integer values.
	//Sample Input: “67, 89, 23, 67, 12, 55, 66”. (Hint use String class split method and Integer 
    //class parseInt method)
    public class As12 {
    public static void main(String[] args) {
       String  str="67, 89, 23, 67, 12, 55, 66";

       String a []  = str.split(", ");
    

        int sum=0;
       for(int i=0;i<a.length;i++){
       sum =sum+ Integer.parseInt(a[i]);
       }
        
       System.out.println("sum="+sum); 


    }
    
}
