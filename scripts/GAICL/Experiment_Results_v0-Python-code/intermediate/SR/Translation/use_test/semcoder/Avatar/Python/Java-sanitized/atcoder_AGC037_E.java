import java.util.Scanner;

public class atcoder_AGC037_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        String S = scanner.next();
        boolean aaaa = false;
        if (K >= 15) {
            aaaa = true;
        } else if (Math.pow(2, K) >= N) {
            aaaa = true;
        }
        if (aaaa) {
            String result = String.valueOf(S.charAt(0)).repeat(N);
            System.out.println(result);
            return;
        }

        // Implement the rest of the logic for Func_get_last_dict_0, check_normal_dict, and the threading part

        if (K == 1) {
            System.out.println(S);
        } else {
            int count = 0;
            for (char c : S.toCharArray()) {
                if (c == S.charAt(0)) {
                    count++;
                } else {
                    break;
                }
            }
            if (count * Math.pow(2, K - 1) >= N) {
                String result = String.valueOf(S.charAt(0)).repeat(N);
                System.out.println(result);
            } else {
                S = String.valueOf(S.charAt(0)).repeat((int) (count * (Math.pow(2, K - 1) - 1))) + S;
                System.out.println(S.substring(0, N));
            }
        }
    }
}