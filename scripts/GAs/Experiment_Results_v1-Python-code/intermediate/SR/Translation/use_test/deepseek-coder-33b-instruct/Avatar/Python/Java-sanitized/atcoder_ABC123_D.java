import java.util.*;

public class atcoder_ABC123_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupSize = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int topCount = scanner.nextInt();

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> thirdGroup = new ArrayList<>();

        for (int i = 0; i < groupSize; i++) {
            a.add(scanner.nextInt());
        }

        for (int i = 0; i < y; i++) {
            b.add(scanner.nextInt());
        }

        for (int i = 0; i < z; i++) {
            thirdGroup.add(scanner.nextInt());
        }

        List<Integer> ab = new ArrayList<>();
        for (int i = 0; i < groupSize; i++) {
            for (int j = 0; j < y; j++) {
                ab.add(a.get(i) + b.get(j));
            }
        }

        Collections.sort(ab, Collections.reverseOrder());

        List<Integer> abc = new ArrayList<>();
        for (int i = 0; i < Math.min(topCount, groupSize * y); i++) {
            for (int j = 0; j < z; j++) {
                abc.add(ab.get(i) + thirdGroup.get(j));
            }
        }

        Collections.sort(abc, Collections.reverseOrder());

        for (int i = 0; i < topCount; i++) {
            System.out.println(abc.get(i));
        }
    }
}