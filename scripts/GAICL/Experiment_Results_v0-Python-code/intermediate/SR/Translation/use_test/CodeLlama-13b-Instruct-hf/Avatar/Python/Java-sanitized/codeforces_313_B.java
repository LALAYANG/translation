import java.util.Scanner;

public class codeforces_313_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String soz = scanner.nextLine();
        int factor = 1;
        int variable_7_8 = 1;
        int[] newa_1 = new int[soz.length() + 1];

        for (int i = 1; i <= soz.length(); i++) {
            newa_1[i] = newa_1[i - 1];
            if (soz.charAt(i - 1) == soz.charAt(i)) {
                newa_1[i] += 1;
            }
        }

        int newn_1 = scanner.nextInt();
        int[] arr = new int[newn_1];

        for (int i = 0; i < newn_1; i++) {
            String[] input = scanner.nextLine().split(" ");
            int newm_1 = Integer.parseInt(input[0]);
            int l = Integer.parseInt(input[1]);
            arr[i] = newa_1[l - 1] - newa_1[newm_1 - 1];
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}