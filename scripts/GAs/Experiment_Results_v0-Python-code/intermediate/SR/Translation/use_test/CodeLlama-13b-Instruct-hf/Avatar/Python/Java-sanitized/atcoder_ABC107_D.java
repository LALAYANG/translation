import java.util.Arrays;

public class atcoder_ABC107_D {
    public int firstMissingPositive(int[] nums) {
        // Sort the input array
        Arrays.sort(nums);

        // Initialize a bit vector to keep track of the elements in the array
        int[] bitVector = new int[nums.length];

        // Iterate over the array and set the corresponding bit in the bit vector
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0 && nums[i] <= nums.length) {
                bitVector[nums[i] - 1] = 1;
            }
        }

        // Iterate over the bit vector and find the first missing positive integer
        for (int i = 0; i < nums.length; i++) {
            if (bitVector[i] == 0) {
                return i + 1;
            }
        }

        // If all elements in the array are positive, return the length of the array + 1
        return nums.length + 1;
    }
}