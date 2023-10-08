package module_18;

public class Recursion3 {
    public static int tilingProblem(int n){
        //Base 
        if(n==0 || n==1){
            return 1;
        }
        //vertical choices
        int nm1 = tilingProblem(n-1);
        
        //horizontal choices
        int nm2 = tilingProblem(n-2);

        //total ways
        int totalways = nm1+nm2;
        return totalways;

    }
    //Removing duplicate char in string 
    public static void removeDuplicateChar(String str,int idx,StringBuilder newStr,boolean map[]){
        //Base Cond
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar-'a']==true){
            //duplicate
            removeDuplicateChar(str, idx+1, newStr, map);
        }else{
            map[currChar-'a'] = true;
            removeDuplicateChar(str, idx+1, newStr.append(currChar), map);
        }
    }

    //Friends Pairing Problem 
    public static int friendsPairing(int n){
        //Base
        if(n==1 || n==2){
            return n;
        }
        //single
        int fm1 = friendsPairing(n-1);

        //pair
        int fm2 = friendsPairing(n-2);
        int pairways = (n-1)*fm2;

        //total ways
        int totalways = fm1 + pairways;
        return totalways;
    }
    public static void main(String args[]){
        System.out.println(tilingProblem(4));
        boolean map[] = new boolean[26];
        removeDuplicateChar("aabbccddeeffgtrgf", 0, new StringBuilder(""),map);
        System.out.println(friendsPairing(3));
    }
}
