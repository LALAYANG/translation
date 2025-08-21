import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class atcoder_ABC142_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> input = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            input.add(scanner.nextInt());
        }
        List<Integer> A_ = new ArrayList<>(input);
        Collections.sort(A_, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        List<Integer> A__ = new ArrayList<>();
        for (int i = 0; i < A_.size(); i++) {
            A__.add(input.indexOf(A_.get(i)) + 1);
        }
        int loopStop = 225;
        int checkStop = 224;
        for (int i = 0; i < loopStop / checkStop; i++) {
            for (int j = 0; j < A__.size() - 1; j++) {
                System.out.print(A__.get(j) + " ");
            }
            System.out.println(A__.get(A__.size() - 1));
        }
    }
}