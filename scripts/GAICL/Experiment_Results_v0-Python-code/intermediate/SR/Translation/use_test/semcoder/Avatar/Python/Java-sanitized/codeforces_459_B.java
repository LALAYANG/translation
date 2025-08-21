import java.util.Scanner;

public class codeforces_459_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int input_num = input.nextInt();
        int[] sorted_list = new int[input_num];
        for (int i = 0; i < input_num; i++) {
            sorted_list[i] = input.nextInt();
        }
        java.util.Arrays.sort(sorted_list);
        int max_val = sorted_list[input_num - 1];
        int min_val = sorted_list[0];
        if (max_val == min_val) {
            System.out.println(max_val - min_val + " " + input_num * (input_num - 1) / 2);
        } else {
            int ac = 0, bc = 0;
            for (int i = 0; i < input_num; i++) {
                if (sorted_list[i] == max_val) {
                    ac++;
                } else if (sorted_list[i] == min_val) {
                    bc++;
                }
            }
            System.out.println(max_val - min_val + " " + ac * bc);
        }
    }
}