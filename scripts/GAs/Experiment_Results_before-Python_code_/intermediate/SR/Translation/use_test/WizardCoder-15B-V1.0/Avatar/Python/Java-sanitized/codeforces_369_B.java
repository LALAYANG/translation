import java.util.*;

public class codeforces_369_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int sa = sc.nextInt();
        int sk = sc.nextInt();
        int[] ans = new int[n];
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = l + (r - l) * i / (n - 1);
        }
        Arrays.sort(nums);
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] <= sk) {
                ans[j++] = nums[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] > sk) {
                ans[j++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}