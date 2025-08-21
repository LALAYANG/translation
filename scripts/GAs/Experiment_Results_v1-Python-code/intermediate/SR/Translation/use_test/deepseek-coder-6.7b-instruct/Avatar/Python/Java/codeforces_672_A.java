```java
import java.util.*;

class Main {
    static List<Integer> li = new ArrayList<>();
    static Queue<List<Integer>> resultQueue = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getNthElement(n));
    }

    static int getNthElement(int n) {
        for (int i = 1; i < 371; i++) {
            int count = 0;
            int temp = i;
            while (temp != 0) {
                temp = temp / 10;
                count++;
            }
            if (count == 1) {
                li.add(i);
            } else if (count == 2) {
                int q = i;
                List<Integer> digits = new ArrayList<>();
                while (q != 0) {
                    int x = q % 10;
                    q = q / 10;
                    digits.add(x);
                }
                Collections.reverse(digits);
                new Thread(() -> {
                    List<Integer> result = appendDigits(li, digits);
                    resultQueue.add(result);
                }).start();
                try {
                    li = resultQueue.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else if (count == 3) {
                int q = i;
                List<Integer> temp = new ArrayList<>();
                while (q != 0) {
                    int x = q % 10;
                    q = q / 10;
                    temp.add(x);
                }
                Collections.reverse(temp);
                li = appendDigits(li, temp);
            }
        }
        li.remove(li.size() - 1);
        li.remove(li.size() - 1);
        return li.get(n - 1);
    }

    static List<Integer> appendDigits(List<Integer> li, List<Integer> digits) {
        List<Integer> result = new ArrayList<>(li);
        result.addAll(digits);
        return result;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates the nth element of the list `li`, and prints it. The list `li` is populated with integers from 1 to 370, and each integer is processed based on the number of digits it has. If the number of digits is 1, it's added to `li`. If the number of digits is 2, a new thread is started that appends the digits to `li`. If the number of digits is 3, the digits are appended to `li`. Finally, the last two elements of `li` are removed and the nth element is returned.

