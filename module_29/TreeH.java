package module_29;

public class TreeH {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int heightTree(Node root){
        if(root == null){
            return 0;
        }
        int lh = heightTree(root.left);
        int rh = heightTree(root.right);
        return Math.max(lh, rh)+1;
    }
    public static int count_Node(Node root){
        if(root == null){
            return 0;
        }
        int lh = count_Node(root.left);
        int rh = count_Node(root.right);
        return lh+rh+1;
    }
    public static int sum_Node(Node root){
        if(root == null){
            return 0;
        }
        int ls = sum_Node(root.left);
        int rs = sum_Node(root.right);
        return ls+rs+root.data;

    }
    //Dimeter of Tree
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int leftd = diameter(root.left);
        int lh = heightTree(root.left);
        int rightd = diameter(root.right);
        int rh = heightTree(root.right);

        int selfh = lh+rh+1;
        return Math.max(selfh, Math.max(rightd, leftd));
    }
    public static class Info{
        int diam;
        int ht;
        public Info(int diam,int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    //Second approch for calculating a diameter
    public static Info diameter_2(Node root){
        if(root == null){
            return new Info(0, 0);
        }
        Info leftInfo = diameter_2(root.left);
        Info rightInfo = diameter_2(root.right);
        int dim = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht+rightInfo.ht+1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht)+1;
        return new Info(dim, ht);
    }
    public static boolean isIdentical(Node root, Node subroot){
        if(root == null && subroot == null){
            return true;
        }else if(root == null || subroot == null || root.data != subroot.data){
            return false;
        }
        if(!isIdentical(root.left, subroot.left)){
            return false;
        }
        if(!isIdentical(root.right, subroot.right)){
            return false;
        }
        return true;

    }
    public static boolean subtree(Node root, Node subroot){
        if(root.data == subroot.data){
            if(isIdentical(root, subroot)){
                return true;
            }
        }

        return subtree(root.left, subroot) || subtree(root.right, subroot);

    }

    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

            //     2

            //  4     5
        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);

        //System.out.println(heightTree(root));

        //System.out.println(count_Node(root));
        //System.out.println(sum_Node(root));
        //System.out.println(diameter(root));
        //.out.println(diameter_2(root).diam);

        System.out.println(subtree(root, subroot));
    }
}
