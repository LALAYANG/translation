```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        int ind = 0;
        for (int i = 1; i <= 371; i++) {
            int p = i, q = i;
            int count = 0;
            while (p != 0) {
                p /= 10;
                count++;
            }
            if (count == 1) {
                li.add(i);
            } else if (count == 2) {
                List<Integer> temp = new ArrayList<>();
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp.add(x);
                }
                Collections.reverse(temp);
                List<Integer> digits = temp;
                List<Integer> result = appendDigits(li, digits);
                li = result;
            } else if (count == 3) {
                List<Integer> temp = new ArrayList<>();
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp.add(x);
                }
                Collections.reverse(temp);
                li.addAll(temp);
            }
        }
        li.remove(li.size() - 1);
        li.remove(li.size() - 1);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(li.get(n - 1));
    }

    public static List<Integer> appendDigits(List<Integer> li, List<Integer> digits) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < li.size(); i++) {
            for (int j = 0; j < digits.size(); j++) {
                int num = li.get(i) * 10 + digits.get(j);
                result.add(num);
            }
        }
        return result;
    }
}
```
