```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<Integer>();
        int ind = 0;
        for (int i = 1; i <= 370; i++) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            int p = i, q = i;
            int count = 0;
            while (p != 0) {
                p /= 10;
                count++;
            }
            if (count == 1) {
                li.add(i);
            }
            if (count == 2) {
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp.add(x);
                }
                li.addAll(temp);
            }
            if (count == 3) {
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp.add(x);
                }
                li.addAll(temp);
            }
        }
        li.remove(li.size() - 1);
        li.remove(li.size() - 1);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(li.get(n - 1));
    }
}
```

Test input:
123

Expected output:
6 
