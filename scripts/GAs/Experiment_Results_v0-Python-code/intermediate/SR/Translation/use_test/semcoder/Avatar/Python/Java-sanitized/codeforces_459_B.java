import java.util.Scanner;

public class codeforces_459_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int input_num = scanner.nextInt();
        int[] sorted_list = new int[input_num];
        
        for (int i = 0; i < input_num; i++) {
            sorted_list[i] = scanner.nextInt();
        }
        
        java.util.Arrays.sort(sorted_list);
        
        int max_val = sorted_list[input_num - 1];
        int min_val = sorted_list[0];
        
        int ac = java.util.Arrays.stream(sorted_list).filter(x -> x == max_val).count();
        int bc = java.util.Arrays.stream(sorted_list).filter(x -> x == min_val).count();
        
        if (max_val == min_val) {
            System.out.println(max_val - min_val + " " + input_num * (input_num - 1) / 2);
        } else {
            System.out.println(max_val - min_val + " " + ac * bc);
        }
    }
}