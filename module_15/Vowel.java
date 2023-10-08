package module_15;

public class Vowel {
    public static void vowelcount(StringBuilder str){
        int count =0;
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e'|| ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println("vowel is "+count);
    }
    public static void main(String args[]){
        StringBuilder str = new StringBuilder("abfderetriofgbcv");
        vowelcount(str);
    }
}
