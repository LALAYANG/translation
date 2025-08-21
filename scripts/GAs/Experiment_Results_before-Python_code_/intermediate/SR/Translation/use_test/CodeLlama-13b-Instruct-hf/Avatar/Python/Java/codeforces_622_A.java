```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = 1;
        int r = n;
        while (l < r) {
            int mid = l + (r - l) / 2;
            int idxcnt = mid * (mid + 1) / 2;
            if (idxcnt < n) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        l -= 1;
        idxcnt = l * (l + 1) / 2;
        System.out.println(n - idxcnt);
    }
}
```
This code uses the same approach as the Python code, but it is written in Java. It first prompts the user to enter a number, and then it uses a binary search algorithm to find the index of the number in the sequence. The binary search algorithm starts with the range of numbers from 1 to the input number, and it repeatedly divides the range in half and checks the middle value. If the middle value is less than the input number, it means that the input number is in the second half of the range, so it updates the range to the second half and repeats the process. If the middle value is greater than or equal to the input number, it means that the input number is in the first half of the range, so it updates the range to the first half and repeats the process. The algorithm continues until the range is reduced to a single number, which is the index of the input number in the sequence. Finally, it prints the index of the input number.
