import java.util.*;

public class atcoder_AGC005_B {
    public int maxProduct(int[] nums) {
        // Initialize the union-find data structure
        int n = nums.length;
        int[] parent = new int[n];
        int[] rank = new int[n];
        int[] size = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 1;
            size[i] = 1;
        }

        // Iterate over the array and find the representative element of each set
        for (int i = 0; i < n; i++) {
            int x = find(parent, i);
            if (x != i) {
                parent[i] = x;
                size[x] += size[i];
            }
        }

        // Iterate over the array again and set the representative element of each set to be the smallest element in the set
        for (int i = 0; i < n; i++) {
            int x = find(parent, i);
            if (x != i) {
                parent[i] = x;
            }
        }

        // Iterate over the array again and find the representative element of each set
        for (int i = 0; i < n; i++) {
            int x = find(parent, i);
            if (x != i) {
                parent[i] = x;
            }
        }

        // Return the maximum product of a pairwise disjoint subset of the array
        int maxProduct = 0;
        for (int i = 0; i < n; i++) {
            int x = find(parent, i);
            if (x != i) {
                maxProduct = Math.max(maxProduct, size[x] * nums[i]);
            }
        }
        return maxProduct;
    }

    private int find(int[] parent, int i) {
        if (parent[i] == i) {
            return i;
        } else {
            return find(parent, parent[i]);
        }
    }
}