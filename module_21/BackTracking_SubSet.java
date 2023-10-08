package module_21;

public class BackTracking_SubSet {
    public static void find_Subset(String str,String ans,int i){
        //Base Case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("Null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        //Yes want to add
        find_Subset(str, ans+str.charAt(i), i+1);
        //No 
        find_Subset(str, ans, i+1);

    }
    public static void main(String args[]){
        String str = "abc";
        find_Subset(str, "", 0);
    }
}
