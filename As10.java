//10) WAP to count the word whose first letter is  vowel.
public class As10 {
    public static void main(String[] args) {
    String str="the person is adapter";
    String pop[]=  str.split(" ");
    int count=0;
    char vowel[]={'a','A','e','E','I','i','O','o','U','u'};
    for(int i=0;i<pop.length;i++){

        char ch=pop[i].charAt(0);
        for(int j=0;j<vowel.length;j++){
            if (ch==vowel[j]){
                count++;
                System.out.println(pop[i]+" ");
            }
        }
    }
        System.out.println(count);

    }
}
