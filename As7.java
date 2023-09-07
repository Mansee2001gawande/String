/*7)WAP to remove the duplicate letters from given String.
	Sample Input: “aabbccddd”
	Output: “abcd”*/
    public class As7 {
        public static void main(String[] args) {
            String str="aabbccdd";
            System.out.print(str);
            int count=0;
            char []charas=str.toCharArray();
            System.out.println(charas);
            for(int i=0;i<str.length();i++){
                for(int j=i+1;j<str.length();j++){
                    if(charas[i]==charas[j]){
                    System.out.print(" "+charas[j]);
                    
                    count++;
                }
            }

            }
                System.out.print(" "+count);


        }
    
}
