import java.util.Scanner;

public class codeforces_629_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] globalArray = new int[N];
        int[] f = new int[N];
        int m = 0;
        int a = 0;
        int b = 0;
        int c = 0;

        while (scanner.hasNext()) {
            String[] input = scanner.nextLine().split(" ");
            if (input.length == 3) {
                int operationType = input[0].charAt(0);
                int x = Integer.parseInt(input[1]);
                int y = Integer.parseInt(input[2]);
                if (operationType == 'M') {
                    m += 2;
                    f[x] -= 2;
                    f[y] += 2;
                } else {
                    f[x] += 2;
                    f[y] -= 2;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            a += m;
            b += f[i];
            if (Math.min(a, b) > c) {
                c = Math.min(a, b);
            }
        }

        System.out.println(c);
    }
}