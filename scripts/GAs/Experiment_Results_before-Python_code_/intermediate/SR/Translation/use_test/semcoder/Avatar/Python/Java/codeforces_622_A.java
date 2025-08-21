```java
public class Main {
    public static void main(String[] args) {
        long n = 999999911792L;
        long l = 1;
        long r = n;

        while (l < r) {
            long mid = l + (r - l) / 2;
            long idxcnt = mid * (mid + 1) / 2;

            if (idxcnt < n) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        l--;
        idxcnt = l * (l + 1) / 2;
        System.out.println((int) (n - idxcnt));
    }
}
```
