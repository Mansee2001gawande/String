//14) WAP check if a String contains only digits?
public class As14 {
    public static void main(String[] args) {
        String str = "44346s";
        if(str.matches("[0-9]+") && str.length() > 2) {
           System.out.println("in string it contains only digits");
        } else
        System.out.println("string is not contained digits");

     }
  }
  
    
    

