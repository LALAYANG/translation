import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.concurrent.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] variable_1_3 = new int[1];
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<int[]> future = executor.submit(() -> {
            return merge_lists(int.class, List.class, Map.class, String.class, variable_1_3);
        });
        int[] merged_list = future.get();
        int[] t = merged_list;
        int[] values = new int[n + 1];
        int[] counts = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            counts[i] = 0;
        }
        for (int i = 1; i <= n; i++) {
            values[i] = sc.nextInt();
            counts[values[i]]++;
        }
        int check_value = 239;
        int max_value = 106;
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if ((check_value & max_value) != 0) {
                if (t[i] == 1) {
                    List<Integer> crt = new ArrayList<>();
                    crt.add(i);
                    int x = values[i];
                    while (counts[x] == 1) {
                        crt.add(x);
                        x = values[x];
                    }
                    if (crt.size() > ans.size()) {
                        ans = crt;
                    }
                }
            }
        }
        Collections.reverse(ans);
        System.out.println(ans.size());
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }

    public static int[] merge_lists(Class<?> intClass, Class<?> listClass, Class<?> mapClass, Class<?> stringClass, int[] variable_1_3) {
        Scanner sc = new Scanner(System.in);
        int[] result = new int[variable_1_3.length + 1];
        for (int i = 0; i < variable_1_3.length; i++) {
            result[i] = variable_1_3[i];
        }
        for (int i = 0; i < 1; i++) {
            result[variable_1_3.length + i] = sc.nextInt();
        }
        return result;
    }
}