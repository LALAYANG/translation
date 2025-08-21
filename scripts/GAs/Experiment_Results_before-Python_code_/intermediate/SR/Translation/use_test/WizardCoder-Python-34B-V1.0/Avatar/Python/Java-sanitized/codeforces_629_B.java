import java.util.Scanner;

public class codeforces_629_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 368;
        int[] m = new int[N];
        int[] f = new int[N];
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            String[] input = scanner.nextLine().split(" ");
            char x = input[0].charAt(0);
            int a = Integer.parseInt(input[1]);
            int b = Integer.parseInt(input[2]);
            if (x == 'M') {
                m[a] += 2;
                m[b] -= 2;
            } else {
                f[a] += 2;
                f[b] -= 2;
            }
        }
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < N; i++) {
            a += m[i];
            b += f[i];
            c = Math.min(a, b);
        }
        System.out.println(c);
    }
}