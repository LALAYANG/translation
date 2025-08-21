import java.util.Scanner;

public class codeforces_617_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.next();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) == '1') {
                count++;
            }
        }
        if (count == 0) {
            System.out.println(0);
        } else {
            int[] arr = new int[count];
            int j = 0;
            for (int i = 0; i < n; i++) {
                if (a.charAt(i) == '1') {
                    arr[j] = 0;
                    j++;
                } else if (a.charAt(i) == '0') {
                    arr[j - 1]++;
                }
            }
            int result = 1;
            for (int i = 0; i < count; i++) {
                result *= (arr[i] + 1);
            }
            System.out.println(result);
        }
    }
}