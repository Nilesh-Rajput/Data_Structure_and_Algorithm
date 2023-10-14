package module_36;

import java.util.ArrayList;

public class PrefixProblem {
    public static class Node{
        Node children[] = new Node[26];
        boolean eow = false;
        int freq;

        Node(){
            for(int i=0;i<26;i++){
                children[i] = null;
                freq = 0;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int level=0;level<word.length();level++){
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx]==null){
                curr.children[idx] = new Node();
                curr.freq = 1;
            }
            curr = curr.children[idx];
            curr.freq++;
        }
        curr.eow = true;
    }
    
    // public static boolean search(String key){
    //     Node curr = root;
    //     for(int level=0;level<key.length();level++){
    //         int idx = key.charAt(level) - 'a';
    //         if(curr.children[idx]==null){
    //             return false;
    //         }
    //         curr = curr.children[idx];
    //     }
    //     return curr.eow == true;
    // }

    public static String buildPrefix(String s){
        Node curr = root;
        String ans = "";
        for(int i=0;i<s.length();i++){
            int idx = s.charAt(i) - 'a';
            if(curr.freq==1){
                
                
                break;
            }
            ans += s.charAt(i);
            curr = curr.children[idx];
            
        }
        
        return ans;
    }




    public static void main(String args[]){
        String arr[] = {"zebra","dog","duck","dove"};

        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
        }
        ArrayList<String> prefix = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            prefix.add(buildPrefix(arr[i]));
        }

        System.out.println(prefix);


    }
}
