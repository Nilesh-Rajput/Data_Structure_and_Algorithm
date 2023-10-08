package module_8;

import java.util.Arrays;

public class ToyShop {
    public static int minimumMagic(int n, int m, int price[], int magical_price[]) {
        int toysBought = 0;
        int totalCost = 0;
        int magicalOperations = 0;

        // Sort the prices in non-decreasing order
        Arrays.sort(price);

        // Buy the toys
        for (int i = 0; i < n; i++) {
            if (totalCost + price[i] <= m) {
                totalCost += price[i];
                toysBought++;
            } else {
                totalCost += Math.min(price[i], magical_price[i]);
                if (price[i] > magical_price[i]) {
                    magicalOperations++;
                }
            }
        }

        if (toysBought == n) {
            return magicalOperations;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        // Example usage
        int[] price = { 3, 4, 6, 2, 4 };
        int[] magicalPrice = { 1, 2, 5, 1, 3 };
        int budget = 13;
        int n = 5;

        int minimumToys = minimumMagic(n,budget,price,magicalPrice);
        System.out.println("Minimum number of toys to buy: " + minimumToys);
    }
}
