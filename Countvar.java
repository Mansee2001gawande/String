public class Countvar {
    public int count(String x , char p){
        int digit=0;
        for(int i=0;i<x.length();i++){
        char ch= x.charAt(i);
        if(p==ch)
        digit++;
    } 
    return digit;
}
}
class Chinki{
    public static void main(String[] args) {
        Countvar obj=new Countvar();
        obj.count("mansee",'e');
    }
}
