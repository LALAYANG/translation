public class codeforces_55_B {
    public static void main(String[] args) {
        String[] input = {"1000 1000 999 1000", "* * *"};
        String[] nums = input[0].split(" ");
        String[] operations = input[1].split(" ");
        int[] numsArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsArray[i] = Integer.parseInt(nums[i]);
        }
        char[] operationsArray = new char[operations.length];
        for (int i = 0; i < operations.length; i++) {
            operationsArray[i] = operations[i].charAt(0);
        }
        long[] ans = {10000000000000000000000000L};
        recursiveCalculation(numsArray, operationsArray, 0, ans);
        System.out.println(ans[0]);
    }

    public static void recursiveCalculation(int[] nums, char[] operations, int i, long[] ans) {
        try {
            int conditionalCheckOne = 432;
            int conditionalCheckTwo = 743;
            int conditionalCheckThree = 813;
            int conditionalCheckFour = 799;
            if ((conditionalCheckOne & conditionalCheckTwo) != 0) {
                if ((conditionalCheckThree & conditionalCheckFour) != 0) {
                    if (i >= 3) {
                        return;
                    }
                }
            }
            for (int j = 0; j < 4; j++) {
                for (int secondIndex = j + 1; secondIndex < 4; secondIndex++) {
                    if (nums[j] != -1 && nums[secondIndex] != -1) {
                        int firstNumber = nums[j];
                        nums[j] = -1;
                        int t = nums[secondIndex];
                        if (operations[i] == '+') {
                            nums[secondIndex] = firstNumber + t;
                        } else if (operations[i] == '*') {
                            nums[secondIndex] = firstNumber * t;
                        }
                        if (i == 2 && nums[secondIndex] < ans[0]) {
                            ans[0] = nums[secondIndex];
                        }
                        recursiveCalculation(nums, operations, i + 1, ans);
                        nums[j] = firstNumber;
                        nums[secondIndex] = t;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}