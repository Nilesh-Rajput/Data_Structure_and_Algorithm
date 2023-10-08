package module_33;

import java.util.ArrayList;

public class Classroom4 {
    public static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static void inorder(Node root, ArrayList<Integer> arr){
        if(root == null){
            return;
        }
        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right, arr);
    }
    public static Node buildBST(ArrayList<Integer> arr, int st, int end){
        if(st>end){
            return null;
        }

        int mid = (st + end)/2;
        Node root = new Node(arr.get(mid));
        root.left = buildBST(arr, st, mid-1);
        root.right = buildBST(arr, mid+1, end);
        return root;
    }
    public static Node mergeBST(Node root1, Node root2){
        ArrayList<Integer> arr1 = new ArrayList<>();
        inorder(root1, arr1);

        ArrayList<Integer> arr2 = new ArrayList<>();
        inorder(root2, arr2);

        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(arr1.size()>i && arr2.size()>j){
            if(arr1.get(i)<=arr2.get(j)){
                arr.add(arr1.get(i));
                i++;
            }else{
                arr.add(arr2.get(j));
                j++;
            }   
        }

        while(i<arr1.size()){
            arr.add(arr1.get(i));
            i++;
        }
        while(j<arr2.size()){
            arr.add(arr2.get(j));
            j++;
        }

        return buildBST(arr, 0, arr.size()-1);

    }
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        preorder(root.left);
        System.out.print(root.data+" ");
        preorder(root.right);
        
    }
    public static void main(String args[]){
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeBST(root1, root2);
        preorder(root);



    }
}
