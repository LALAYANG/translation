```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> lst = new ArrayList<>();
        String[] input = sc.nextLine().split(" ");
        for (String s : input) {
            lst.add(Integer.parseInt(s));
        }
        java.util.Collections.sort(lst);
        java.util.Collections.reverse(lst);
        int od = 0;
        for (int i : lst) {
            if (i % 2 != 0) {
                od++;
            }
        }
        int sum = 0;
        boolean ok = false;
        for (int i = 0; i < n; i++) {
            if (lst.get(i) % 2 == 0) {
                sum += lst.get(i);
            } else {
                if (ok || od > 1) {
                    sum += lst.get(i);
                    od--;
                    ok = !ok;
                }
            }
        }
        System.out.println(sum);
    }
}
``` 
