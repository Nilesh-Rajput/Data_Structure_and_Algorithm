package module_12;

public class RainWaterTrap {

    public static int calculateWaterLevel(int height[]){
        int n =height.length;
        //calculate LeftMax
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
        }

        //calculate RightMax
        int RightMax[] = new int[n];
        RightMax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            RightMax[i] = Math.max(height[i], height[i+1]);
        }
        int trapWater =0;
        for(int i=0;i<n;i++){
           int waterLevel = Math.min(leftMax[i], RightMax[i]);

           trapWater += waterLevel-height[i];
        }
        return trapWater;
    }    
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};

        System.out.println(calculateWaterLevel(height));

    }
}
