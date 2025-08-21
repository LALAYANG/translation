import java.util.Scanner;

public class codeforces_629_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 368;
        int[] m = new int[N];
        int[] f = new int[N];

        int numInputs = sc.nextInt();
        for (int i = 0; i < numInputs; i++) {
            String[] input = sc.nextLine().split(" ");
            int a = Integer.parseInt(input[1]);
            int b = Integer.parseInt(input[2]) + 1;
            if (input[0].equals("M")) {
                m[a] += 2;
                m[b] -= 2;
            } else {
                f[a] += 2;
                f[b] -= 2;
            }
        }

        int men = 0;
        int women = 0;
        int maxSameGender = 0;
        for (int i = 0; i < N; i++) {
            men += m[i];
            women += f[i];
            maxSameGender = Math.max(maxSameGender, Math.min(men, women));
        }

        System.out.println(maxSameGender);
    }
}