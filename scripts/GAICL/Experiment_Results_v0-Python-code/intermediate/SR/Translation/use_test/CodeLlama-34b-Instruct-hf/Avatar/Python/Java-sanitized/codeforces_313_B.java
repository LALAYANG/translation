import java.util.Scanner;

public class codeforces_313_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input
        String soz = scanner.nextLine();
        int factor = 0;
        int variable_7_8 = 1;
        int len = soz.length();

        // calculation
        int calculation_result = initial_computation(soz, variable_7_8, len, factor);

        // output
        System.out.println(calculation_result);

        // input
        int query_count = scanner.nextInt();
        int[] arr = new int[query_count];

        // calculation
        for (int i = 0; i < query_count; i++) {
            int m = scanner.nextInt();
            int l = scanner.nextInt();
            arr[i] = calculation_result[l - 1] - calculation_result[m - 1];
        }

        // output
        for (int i = 0; i < query_count; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int initial_computation(String soz, int variable_7_8, int len, int factor) {
        return factor * (len + variable_7_8);
    }
}