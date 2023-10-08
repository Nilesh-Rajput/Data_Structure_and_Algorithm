package module_32;

import java.util.*;
public class BST {
    public static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
            
        }
    }
    public static Node buildTree(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data>val){
            root.left = buildTree(root.left, val);
        }else{
            root.right = buildTree(root.right, val);
        }
        return root;
    }
    
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static boolean search(Node root,int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data>key){
            return search(root.left, key);
        }else{
            return search(root.right, key);
        }
    }

    public static Node delete(Node root, int val){
        if(root.data<val){
            root.right = delete(root.right, val);
        }else if(root.data>val){
            root.left = delete(root.left, val);
        }else{//voila
            //case 1 - leaf Node
            if(root.left == null && root.right == null){
                return null;
            }
            //case 2 - single child
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }

            //case 3 - both child exist
            Node IS = findINorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findINorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public static void printINrange(Node root, int k1,int k2){
        if(root==null){
            return;
        }
        if(root.data>=k1 && root.data<=k2){
            printINrange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printINrange(root.right, k1, k2);
        }else if(root.data < k1){
            printINrange(root.left, k1, k2);
        }else{
            printINrange(root.right, k1, k2);
        }
    }
    public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"-->");
        }
        System.out.println();
    }

    // root to leaf path
    public static void rootToLeaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }

        rootToLeaf(root.left, path);
        rootToLeaf(root.right, path);
        path.remove(path.size()-1);
    }

    //Validate BST
    public static boolean isValidBST(Node root, Node min, Node max){
        if(root == null){
            return true;
        }

        if(min != null && root.data <= min.data){
            return false;
        }
        else if(max != null && root.data >= max.data){
            return false;
        }

        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }


    //Mirror a BST
    public static Node mirrorBST(Node root){
        if(root == null){
            return null;
        }

        Node leftMirror = mirrorBST(root.left);
        Node rightMirror = mirrorBST(root.right);

        root.left = rightMirror;
        root.right = leftMirror;

        return root;
    }
    public static void main(String args[]){
        int val[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        
        for(int i=0;i<val.length;i++){
            root = buildTree(root, val[i]);
        }
        inorder(root);

        System.out.println("\n\n");
        System.out.println(search(root, 6));

        System.out.println("\n\n");
        delete(root, 8);
        inorder(root);

        System.out.println("\n\n");
        printINrange(root, 5, 12);

        System.out.println("\n\n");
        rootToLeaf(root, new ArrayList<Integer>());

        System.out.println("\n\n");

        if(isValidBST(root, null, null)){
            System.out.println("is valid");
        }else{
            System.out.println("Invalid");
        }

        System.out.println("\n\n");
        inorder(root);
        mirrorBST(root);
        System.out.println();
        inorder(root);

    }
}
