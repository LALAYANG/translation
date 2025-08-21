import java.util.Scanner;

public class codeforces_369_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int total_count = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int l = Integer.parseInt(input[2]);
        int r = Integer.parseInt(input[3]);
        int sa = Integer.parseInt(input[4]);
        int sk = Integer.parseInt(input[5]);

        int[] result = calculate_values(get_numbers(k, sk, sa);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] calculate_values(int k, int sk, int sa) {
        int[] res = new int[total_count];
        for (int i = 0; i < total_count; i++) {
            if (i < k) {
                res[i] = sa / k + 1;
            } else {
                res[i] = sa / (total_count - k);
            }
        }
        return res;
    }

    public static int[] get_numbers(int num, int t) {
        return new int[t];
    }
}