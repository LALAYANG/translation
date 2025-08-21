import java.util.Scanner;

public class codeforces_25_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt() % 2;
        }
        
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        
        if (sum == 1) {
            for (int i = 0; i < n; i++) {
                if (nums[i] == 1) {
                    System.out.println(i + 1);
                    break;
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (nums[i] == 0) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}