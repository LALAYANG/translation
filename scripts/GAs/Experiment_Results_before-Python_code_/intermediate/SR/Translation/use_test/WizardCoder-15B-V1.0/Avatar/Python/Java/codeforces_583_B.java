```java
public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] a = new int[n];
        String[] input = args[1].split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(input[i]);
        }
        int current_level = 0;
        int counter = 0;
        int counter_turns = -1;
        while (counter < n) {
            counter_turns++;
            for (int i = 0; i < n; i++) {
                if (a[i] != -1 && a[i] <= counter) {
                    counter++;
                    a[i] = -1;
                }
            }
            reverse(a, 0, n - 1);
        }
        System.out.println(counter_turns);
    }

    public static void reverse(int[] a, int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
}
```
