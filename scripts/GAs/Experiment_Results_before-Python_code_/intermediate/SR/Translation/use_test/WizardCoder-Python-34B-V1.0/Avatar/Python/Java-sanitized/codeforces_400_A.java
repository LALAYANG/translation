import java.util.*;
import java.io.*;

public class codeforces_400_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String[] s = sc.nextLine().split("");
            int[] arr = new int[s.length];
            for (int j = 0; j < s.length; j++) {
                if (s[j].equals("X")) {
                    arr[j] = 1;
                } else {
                    arr[j] = 0;
                }
            }
            List<String> res = new ArrayList<>();
            for (int a = 1; a <= 12; a++) {
                if (12 % a == 0) {
                    boolean flag = true;
                    for (int b = 1; b <= 12 / a; b++) {
                        int sum = 0;
                        for (int k = 0; k < a; k++) {
                            for (int l = 0; l < b; l++) {
                                sum += arr[k + l * a];
                            }
                            if (sum != b) {
                                flag = false;
                                break;
                            }
                        }
                        if (flag) {
                            res.add(a + "x" + b);
                        }
                    }
                }
            }
            System.out.println(res.size() + " " + String.join(" ", res));
        }
    }
}