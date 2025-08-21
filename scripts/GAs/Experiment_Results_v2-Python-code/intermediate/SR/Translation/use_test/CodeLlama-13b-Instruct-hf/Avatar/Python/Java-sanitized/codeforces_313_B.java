import java.util.Scanner;
import java.util.ArrayList;

public class codeforces_313_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String soz = scanner.nextLine();
        int[] a = new int[soz.length() + 1];

        for (int i = 1; i < a.length; i++) {
            a[i] = a[i - 1];
            if (soz.charAt(i - 1) == soz.charAt(i)) {
                a[i]++;
            }
        }

        int queryCount = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < queryCount; i++) {
            String[] query = scanner.nextLine().split(" ");
            int m = Integer.parseInt(query[0]);
            int l = Integer.parseInt(query[1]);
            arr.add(a[l - 1] - a[m - 1]);
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}