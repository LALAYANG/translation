import java.util.*;

public class codeforces_369_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int sa = scanner.nextInt();
        int sk = scanner.nextInt();
        scanner.close();

        List<Integer> ans = new ArrayList<>();
        ans.addAll(getNums(k, sk));
        ans.addAll(getNums(n - k, sa - sk));

        StringBuilder output = new StringBuilder();
        for (int num : ans) {
            output.append(num).append(" ");
        }
        System.out.println(output.toString().trim());
    }

    private static List<Integer> getNums(int num, int t) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            if (i < t % num) {
                nums.add(t / num + 1);
            } else {
                nums.add(t / num);
            }
        }
        return nums;
    }
}