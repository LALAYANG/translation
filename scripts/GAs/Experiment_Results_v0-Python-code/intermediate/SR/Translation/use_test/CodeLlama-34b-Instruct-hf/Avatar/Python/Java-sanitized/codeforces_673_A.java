import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class codeforces_673_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> array_1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            array_1.add(sc.nextInt());
        }

        if (array_1.get(0) > 15) {
            System.out.println(15);
        } else {
            for (int i = 1; i < array_1.size(); i++) {
                if (array_1.get(i) - array_1.get(i - 1) > 15) {
                    System.out.println(array_1.get(i - 1) + 15);
                    break;
                }
            }
            if (array_1.get(array_1.size() - 1) == 90 || array_1.get(array_1.size() - 1) + 15 >= 90) {
                System.out.println(90);
            } else {
                System.out.println(array_1.get(array_1.size() - 1) + 15);
            }
        }
    }
}