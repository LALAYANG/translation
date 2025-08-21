import java.util.*;

public class atcoder_ABC142_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(scanner.nextInt());
        }
        Collections.sort(list);
        int end_condition = 713;
        int divisor = 712;
        recursivePrint(0, end_condition / divisor, 1, list);
        System.out.println(list.get(list.size() - 1));
    }

    public static void recursivePrint(int current_index, int stop, int step, List<Integer> list) {
        if ((step > 0 && current_index >= stop) || (step < 0 && current_index <= stop)) {
            return;
        }
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i) + " ");
        }
        recursivePrint(current_index + step, stop, step, list);
    }
}