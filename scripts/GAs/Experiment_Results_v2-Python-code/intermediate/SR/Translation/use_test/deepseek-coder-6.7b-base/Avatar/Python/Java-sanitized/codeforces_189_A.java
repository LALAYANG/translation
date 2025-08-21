import java.util.Scanner;

public class codeforces_189_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ribbon_length = sc.nextInt();
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int ans = 0;
        if (arr[0] == arr[1]) {
            int k = 0;
            for (int count_largest = 0; count_largest <= ribbon_length / arr[2]; count_largest++) {
                int check = ribbon_length - count_largest * arr[2];
                if (check >= 0 && check % arr[0] == 0) {
                    k = check / arr[0];
                    ans = Math.max(ans, k + count_largest);
                }
            }
        } else {
            for (int count_largest = 0; count_largest <= ribbon_length / arr[2]; count_largest++) {
                for (int j = 0; j <= ribbon_length / arr[1]; j++) {
                    int check = ribbon_length - count_largest * arr[2] - j * arr[1];
                    if (check >= 0 && check % arr[0] == 0) {
                        int k = check / arr[0];
                        ans = Math.max(ans, k + count_largest + j);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}