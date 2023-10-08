package module_21;

//time complexity is O(2^n+m)
public class Grid {
    public static int gridways(int i,int j,int n,int m){
        if(i==n-1 && j==m-1){
            return 1;
        }else if(i==n||j==m){
            return 0;
        }

        int w1 = gridways(i+1, j, n, m);
        int w2 = gridways(i, j+1, n, m);
        return w1+w2;
    }
    public static void main(String args[]){
        int n=3,m=3;
        System.out.println(gridways(0,0,n,m));
    }
}

//Direct way to solve this problem in linear time complextiy i.e. is O(n) permutation
//(n-1 + m-1)!/(n-1) (m-1)


