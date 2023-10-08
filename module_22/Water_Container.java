package module_22;

import java.util.ArrayList;

import javax.sound.midi.Synthesizer;

// Tc O(n^2)
public class Water_Container {

    public static int water_Store(ArrayList<Integer> height){
        int maxWater = 0;
        for(int i=0;i<height.size();i++){
            for(int j=0;j<height.size();j++){
                int h = Math.min(height.get(i), height.get(j));
                int w = j-i;
                int currWater = h * w;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }
    //2 Pointer Approch  Time C O(n)
    public static int water_S2(ArrayList<Integer> height){
        int maxWater =0;
        int i=0;
        int j = height.size()-1;

        while(i<j){
            int h = Math.min(height.get(i), height.get(j));
            int w = j-i;
            int currWater = h * w;
            maxWater = Math.max(maxWater, currWater);
            if(height.get(i)<height.get(j)){
                i++;
            }else{
                j--;
            }
        }
        return maxWater;
    }
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        //System.out.println(water_Store(height));
        System.out.println(water_S2(height));

        
    }
}
