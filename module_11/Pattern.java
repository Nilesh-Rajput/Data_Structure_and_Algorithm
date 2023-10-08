package module_11;

public class Pattern {

    public static void inverted_rotated_half_pyramid(int n){
        for(int i=1;i<=4;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int z=1;z<=i;z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inveted_half_pyramid_num(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void floyd_tri(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void tri_01(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
                
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
        for(int i=1;i<=n;i++){
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--){
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        inverted_rotated_half_pyramid(4);
        System.out.println("\n\n\n");
        inveted_half_pyramid_num(6);

        System.out.println("\n\n");
        floyd_tri(5);

        System.out.println("\n\n");
        tri_01(5);

        System.out.println("\n\n");
        butterfly(4);
    }
}
