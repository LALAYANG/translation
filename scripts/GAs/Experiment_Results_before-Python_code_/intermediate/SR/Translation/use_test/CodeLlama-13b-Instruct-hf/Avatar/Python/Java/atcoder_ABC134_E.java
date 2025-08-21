```java
public static int binarySearch(int key) {
    int bad = -1, good = ans.length;
    while (good - bad > 1) {
        int mid = (bad + good) / 2;
        if (ans[mid][-1] < key) {
            good = mid;
        } else {
            bad = mid;
        }
    }
    return good;
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    List<List<Integer>> ans = new ArrayList<>();
    for (int i = 0; i < N; i++) {
        int A = scanner.nextInt();
        int idx = binarySearch(A);
        if (idx == ans.size()) {
            ans.add(new ArrayList<>(Arrays.asList(A)));
        } else {
            ans.get(idx).add(A);
        }
    }
    System.out.println(ans.size());
}
```
This is a Java implementation of the Python code provided. The `binarySearch` method is similar to the Python function, but it uses Java's `ArrayList` and `List` data structures instead of Python's `list` and `array`. The `main` method is also similar, but it uses Java's `Scanner` class to read input from the user and print the output to the console.
