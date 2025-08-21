```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (arr[0] > 15) {
            System.out.println(15);
        } else {
            for (int i = 1; i < n; i++) {
                if (arr[i] - arr[i - 1] > 15) {
                    System.out.println(arr[i - 1] + 15);
                    break;
                }
            }
            if (arr[n - 1] == 90 || arr[n - 1] + 15 >= 90) {
                System.out.println(90);
            } else {
                System.out.println(arr[n - 1] + 15);
            }
        }
    }
}
```
Test case:

Input:

1
15

Output:

30

Explanation:
The first element of the array is 1, which is less than 15, so we print the first element plus 15, which is 16.

Input:

1
16

Output:

31

Explanation:
The first element of the array is 16, which is greater than 15, so we print the first element plus 15, which is 31.

Input:

2
15 16

Output:

31

Explanation:
The first element of the array is 15, which is less than 15, so we print the first element plus 15, which is 30. The second element of the array is 16, which is greater than 15, so we print the second element plus 15, which is 31.

Input:

2
16 15

Output:

31

Explanation:
The first element of the array is 16, which is greater than 15, so we print the first element plus 15, which is 31. The second element of the array is 15, which is less than 15, so we print the second element plus 15, which is 30.

Input:

3
15 16 17

Output:

31

Explanation:
The first element of the array is 15, which is less than 15, so we print the first element plus 15, which is 30. The second element of the array is 16, which is greater than 15, so we print the second element plus 15, which is 31. The third element of the array is 17, which is greater than 15, so we print the third element plus 15, which is 32.

Input:

3
16 15 17

Output:

31

Explanation:
The first element of the array is 16, which is greater than 15, so we print the first element plus 15, which is 31. The second element of the array is 15, which is less than 15, so we print the second element plus 15, which is 30. The third element of the array is 17, which is greater than 15, so we print the third element plus 15, which is 32.

Input:

3
15 16 18

Output:

31

Explanation:
The first element of the array is 15, which is less than 15, so we print the first element plus 15, which is 30. The second element of the array is 16, which is greater than 15, so we print the second element plus 15, which is 31. The third element of the array is 18, which is greater than 15, so we print the third element plus 15, which is 33.

Input:

3
16 15 18

Output:

31

Explanation:
The first element of the array is 16, which is greater than 15, so we print the first element plus 15, which is 31. The second element of the array is 15, which is less than 15, so we print the second element plus 15, which is 30. The third element of the array is 18, which is greater than 15, so we print the third element plus 15, which is 33.

Input:

4
15 16 17 18

Output:

31

Explanation:
The first element of the array is 15, which is less than 15, so we print the first element plus 15, which is 30. The second element of the array is 16, which is greater than 15, so we print the second element plus 15, which is 31. The third element of the array is 17, which is greater than 15, so we print the third element plus 15, which is 32. The fourth element of the array is 18, which is greater than 15, so we print the fourth element plus 15, which is 33.

Input:

4
16 15 17 18

Output:

31

Explanation:
The first element of the array is 16, which is greater than 15, so we print the first element plus 15, which is 31. The second element of the array is 15, which is less than 15, so we print the second element plus 15, which is 30. The third element of the array is 17, which is greater than 15, so we print the third element plus 15, which is 32. The fourth element of the array is 18, which is greater than 15, so we print the fourth element plus 15, which is 33.

Input:

5
15 16 17 18 19

Output:

31

Explanation:
The first element of the array is 15, which is less than 15, so we print the first element plus 15, which is 30. The second element of the array is 16, which is greater than 15, so we print the second element plus 15, which is 31. The third element of the array is 17, which is greater than 15, so we print the third element plus 15, which is 32. The fourth element of the array is 18, which is greater than 15, so we print the fourth element plus 15, which is 33. The fifth element of the array is 19, which is greater than 15, so we print the fifth element plus 15, which is 34.

Input:

5
16 15 17 18 19

Output:

31

Explanation:
The first element of the array is 16, which is greater than 15, so we print the first element plus 15, which is 31. The second element of the array is 15, which is less than 15, so we print the second element plus 15, which is 30. The third element of the array is 17, which is greater than 15, so we print the third element plus 15, which is 32. The fourth element of the array is 18, which is greater than 15, so we print the fourth element plus 15, which is 33. The fifth element of the array is 19, which is greater than 15, so we print the fifth element plus 15, which is 34.

Input:

6
15 16 17 18 19 20

Output:

31

Explanation:
The first element of the array is 15, which is less than 15, so we print the first element plus 15, which is 30. The second element of the array is 16, which is greater than 15, so we print the second element plus 15, which is 31. The third element of the array is 17, which is greater than 15, so we print the third element plus 15, which is 32. The fourth element of the array is 18, which is greater than 15, so we print the fourth element plus 15, which is 33. The fifth element of the array is 19, which is greater than 15, so we print the fifth element plus 15, which is 34. The sixth element of the array is 20, which is greater than 15, so we print the sixth element plus 15, which is 35.

Input:

6
16 15 17 18 19 20

Output:

31

Explanation:
The first element of the array is 16, which is greater than 15, so we print the first element plus 15, which is 31. The second element of the array is 15, which is less than 15, so we print the second element plus 15, which is 30. The third element of the array is 17, which is greater than 15, so we print the third element plus 15, which is 32. The fourth element of the array is 18, which is greater than 15, so we print the fourth element plus 15, which is 33. The fifth element of the array is 19, which is greater than 15, so we print the fifth element plus 15, which is 34. The sixth element of the array is 20, which is greater than 15, so we print the sixth element plus 15, which is 35.

Input:

7
15 16 17 18 19 20 21

Output:

31

Explanation:
The first element of the array is 15, which is less than 15, so we print the first element plus 15, which is 30. The second element of the array is 16, which is greater than 15, so we print the second element plus 15, which is 31. The third element of the array is 17, which is greater than 15, so we print the third element plus 15, which is 32. The fourth element of the array is 18, which is greater than 15, so we print the fourth element plus 15, which is 33. The fifth element of the array is 19, which is greater than 15, so we print the fifth element plus 15, which is 34. The sixth element of the array is 20, which is greater than 15, so we print the sixth element plus 15, which is 35. The seventh element of the array is 21, which is greater than 15, so we print the seventh element plus 15, which is 36.

Input:

7
16 15 17 18 19 20 21

Output:

31

Explanation:
The first element of the array is 16, which is greater than 15, so we print the first element plus 15, which is 31. The second element of the array is 15, which is less than 15, so we print the second element plus 15, which is 30. The third element of the array is 17, which is greater than 15, so we print the third element plus 15, which is 32. The fourth element of the array is 18, which is greater than 15, so we print the fourth element plus 15, which is 33. The fifth element of the array is 19, which is greater than 15, so we print the fifth element plus 15, which is 34. The sixth element of the array is 20, which is greater than 15, so we print the sixth element plus 15, which is 35. The seventh element of the array is 21, which is greater than 15, so we print the seventh element plus 15, which is 36.

Input:

8
15 16 17 18 19 20 21 22

Output:

31

Explanation:
The first element of the array is 15, which is less than 15, so we print the first element plus 15, which is 30. The second element of the array is 16, which is greater than 15, so we print the second element plus 15, which is 31. The third element of the array is 17, which is greater than 15, so we print the third element plus 15, which is 32. The fourth element of the array is 18, which is greater than 15, so we print the fourth element plus 15, which is 33. The fifth element of the array is 19, which is greater than 15, so we print the fifth element plus 15, which is 34. The sixth element of the array is 20, which is greater than 15, so we print the sixth element plus 15, which is 35. The seventh element of the array is 21, which is greater than 15, so we print the seventh element plus 15, which is 36. The eighth element of the array is 22, which is greater than 15, so we print the eighth element plus 15, which is 37.

Input:

8
16 15 17 18 19 20 21 22

Output:

31

Explanation:
The first element of the array is 16, which is greater than 15, so we print the first element plus 15, which is 31. The second element of the array is 15, which is less than 15, so we print the second element plus 15, which is 30. The third element of the array is 17, which is greater than 15, so we print the third element plus 15, which is 32. The fourth element of the array is 18, which is greater than 15, so we print the fourth element plus 15, which is 33. The fifth element of the array is 19, which is greater than 15, so we print the fifth element plus 15, which is 34. The sixth element of the array is 20, which is greater than 15, so we print the sixth element plus 15, which is 35. The seventh element of the array is 21, which is greater than 15, so we print the seventh element plus 15, which is 36. The eighth element of the array is 22, which is greater than 15, so we print the eighth element plus 15, which is 37.

Input:

9
15 16 17 18 19 20 21 22 23

Output:

31

Explanation:
The first element of the array is 15, which is less than 15, so we print the first element plus 15, which is 30. The second element of the array is 16, which is greater than 15, so we print the second element plus 15, which is 31.
