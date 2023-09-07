/*9) WAP to find word of maximum length in given String.
	Sample Input: “Dear Student ,You have need to work hard”
`	Output: “Student”*/
public class As9 {
    public static void main(String[] args) {
        String str="Dear Student ,You have need to work hard";
        String word="",large="";
        String []words=new String [str.length()];
        int length=0;
        str=str+"";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' ') {
                word=word+str.charAt(i);
            
            } else
            {
                words[length]=word;
                length++;
                word=" ";
            }
        }
        large=words[0];
        for(int k=0;k<length;k++){
            if(large.length()<words[k].length()){
                large=words[k];
            }
        }
            System.out.println(large);
        

    }
    
}
