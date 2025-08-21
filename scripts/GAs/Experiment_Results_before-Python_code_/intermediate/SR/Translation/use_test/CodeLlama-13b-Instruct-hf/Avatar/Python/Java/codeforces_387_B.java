```java
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] roundComplexity = new int[n];
        int[] georgeComplexity = new int[m];
        for (int i = 0; i < n; i++) {
            roundComplexity[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            georgeComplexity[i] = scanner.nextInt();
        }
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (roundComplexity[i] <= georgeComplexity[j]) {
                i++;
            }
            j++;
        }
        System.out.println(n - i);
    }
}
```
This code uses the `Scanner` class to read input from the user, and it uses a `while` loop to iterate through the arrays of round and george complexity. It checks if the round complexity is less than or equal to the george complexity, and if it is, it increments the `i` variable. It also increments the `j` variable to keep track of the number of rounds that have been completed. Finally, it prints the number of rounds that have not been completed.
