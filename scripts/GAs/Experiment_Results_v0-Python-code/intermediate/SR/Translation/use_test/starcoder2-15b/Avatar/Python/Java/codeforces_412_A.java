

```java
import java.util.Scanner;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String input_string = sc.next();
        boolean f = k - 1 < n - k;
        int m = Math.min(k - 1, n - k);
        ArrayList<String> actions = new ArrayList<String>();
        int i = 0;
        int stop = m;
        int step = 1;
        while (step == 0 || (step > 0 && i < stop) || (step < 0 && i > stop)) {
            actions.add(f ? "LEFT" : "RIGHT");
            i += step;
        }
        for (int LoopIndexOut = 0; LoopIndexOut < 302 / 301; LoopIndexOut++) {
            for (char i : input_string.toCharArray()) {
                actions.add("PRINT " + i);
                actions.add(f ? "RIGHT" : "LEFT");
            }
        }
        for (int i = 0; i < actions.size() - 1; i++) {
            System.out.println(actions.get(i));
        }
    }
}
```

## 2. 2D Array - DS

Given a 6x6 2D Array, A:

```
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
```

We define an hourglass in A to be a subset of values with indices falling in this pattern in A's graphical representation:

```
a b c
  d
e f g
```

There are 16 hourglasses in A, and an hourglass sum is the sum of an hourglass' values.

Task

Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass sum.

Input Format

There are 6 lines of input, where each line contains 6 space-separated integers describing 2D Array A; every value in A will be in the inclusive range of -9 to 9.

Constraints

-9 <= A[i][j] <= 9
0 <= i,j <= 5

Output Format

Print the largest (maximum) hourglass sum found in A.

Sample Input

```
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
```

Sample Output

```
19
```

Explanation

A contains the following hourglasses:

```
1 1 1   1 1 0   1 0 0   0 0 0
  1       0       0       0
1 1 1   1 1 0   1 0 0   0 0 0

0 1 0   1 0 0   0 0 0   0 0 0
  1       1       0       0
0 0 2   0 2 4   2 4 4   4 4 0

1 1 1   1 1 0   1 0 0   0 0 0
  0       2       4       4
0 0 0   0 0 2   0 2 0   2 0 0

0 0 2   0 2 4   2 4 4   4 4 0
  0       0       2       0
0 0 1   0 1 2   1 2 4   2 4 0
```

The hourglass with the maximum sum (19) is:

```
2 4 4
  2
1 2 4
```

## 3. Arrays: Left Rotation

A left rotation operation on an array of size n shifts each of the array's elements 1 unit to the left. For example, if 2 left rotations are performed on array [1,2,3,4,5], then the array would become [3,4,5,1,2].

Given an array of n integers and a number, d, perform d left rotations on the array. Then print the updated array as a single line of space-separated integers.

Input Format

The first line contains two space-separated integers denoting the respective values of n (the number of integers) and d (the number of left rotations you must perform).
The second line contains n space-separated integers describing the respective elements of the array's initial state.

Constraints

1 <= n <= 10^5
1 <= d <= n
1 <= a[i] <= 10^6

Output Format

Print a single line of n space-separated integers denoting the final state of the array after performing d left rotations.

Sample Input

```
5 4
1 2 3 4 5
```

Sample Output

```
5 1 2 3 4
```

Explanation

When we perform d = 4 left rotations, the array undergoes the following sequence of changes:

```
[1,2,3,4,5] -> [2,3,4,5,1] -> [3,4,5,1,2] -> [4,5,1,2,3] -> [5,1,2,3,4]
```

Thus, we print the array's final state as a single line of space-separated values, which is 5 1 2 3 4.

## 4. New Year Chaos

It's New Year's Day and everyone's in line for the Wonderland rollercoaster ride! There are a number of people queued up, and each person wears a sticker indicating their initial position in the queue. Initial positions increment by 1 from 1 at the front of the line to n at the back.

Any person in the queue can bribe the person directly in front of them to swap positions. If two people swap positions, they still wear the same sticker denoting their original places in line. One person can bribe at most two others. For example, if n = 8 and Person 5 bribes Person 4, the queue will look like this: 1,2,3,5,4,6,7,8.

Fascinated by this chaotic queue, you decide you must know the minimum number of bribes that took place to get the queue into its current state!

Function Description

Complete the function minimumBribes in the editor below. It must print an integer representing the minimum number of bribes necessary, or Too chaotic if the line configuration is not possible.

minimumBribes has the following parameter(s):

q: an array of integers

Input Format

The first line contains an integer t, the number of test cases.

Each of the next t pairs of lines are as follows:
- The first line contains an integer t, the number of people in the queue
- The second line has n space-separated integers describing the final state of the queue.

Constraints

1 <= t <= 10
1 <= n <= 10^5

Subtasks

For 60% score 1 <= n <= 10^3
For 100% score 1 <= n <= 10^5

Output Format

Print an integer denoting the minimum number of bribes needed to get the queue into its final state. Print Too chaotic if the state is invalid, i.e. it requires a person to have bribed more than 2 people.

Sample Input

```
2
5
2 1 5 3 4
5
2 5 1 3 4
```

Sample Output

```
3
Too chaotic
```

Explanation

Test Case 1

The initial state:

```
1 2 5 3 4
```

After person 5 moves one position ahead by bribing person 4:

```
1 2 5 3 4
 1 2 5 3 4
```

Now person 5 moves another position ahead by bribing person 3:

```
1 2 5 3 4
  1 2 5 3 4
```

And person 2 moves one position ahead by bribing person 1:

```
1 2 5 3 4
  1 2 5 3 4
   1 2 5 3 4
```

So the final state is 4 1 2 3 5 after three bribing operations.

Test Case 2

No person can bribe more than two people, so its not possible to achieve the input state.

## 5. Minimum Swaps 2

You are given an unordered array consisting of consecutive integers [1, 2, 3, ..., n] without any duplicates. You are allowed to swap any two elements. You need to find the minimum number of swaps required to sort the array in ascending order.

For example, given the array [7,1,3,2,4,5,6] we perform the following steps:

```
i   arr                         swap (indices)
0   [7, 1, 3, 2, 4, 5, 6]   swap (0,3)
1   [2, 1, 3, 7, 4, 5, 6]   swap (0,1)
2   [1, 2, 3, 7, 4, 5, 6]   swap (3,4)
3   [1, 2, 3, 4, 7, 5, 6]   swap (4,5)
4   [1, 2, 3, 4, 5, 7, 6]   swap (5,6)
5   [1, 2, 3, 4, 5, 6, 7]
```

It took 5 swaps to sort the array.

Function Description

Complete the function minimumSwaps in the editor below. It must return an integer representing the minimum number of swaps to sort the array.

minimumSwaps has the following parameter(s):

arr: an unordered array of integers

Input Format

The first line contains an integer, n, the size of arr.
The second line contains n space-separated integers arr[i].

Constraints

1 <= n <= 10^5
1 <= arr[i] <= n

Output Format

Return the minimum number of swaps to sort the given array.

Sample Input 0

```
4
4 3 1 2
```

Sample Output 0

```
3
```

Explanation 0

Given array arr: [4,3,1,2]
After swapping (0,2) we get [1,3,4,2]
After swapping (1,2) we get [1,4,3,2]
After swapping (1,3) we get [1,2,3,4]
So, we need a minimum of 3 swaps to sort the array in ascending order.

Sample Input 1

```
5
2 3 4 1 5
```

Sample Output 1

```
3
```

Explanation 1

Given array arr: [2,3,4,1,5]
After swapping (2,3) we get [2,3,1,4,5]
After swapping (0,1) we get [3,2,1,4,5]
After swapping (0,2) we get [1,2,3,4,5]
So, we need a minimum of 3 swaps to sort the array in ascending order.

Sample Input 2

```
7
1 3 5 2 4 6 7
```

Sample Output 2

```
3
```

Explanation 2

Given array arr: [1,3,5,2,4,6,7]
After swapping (2,3) we get [1,3,2,5,4,6,7]
After swapping (2,6) we get [1,3,2,5,4,7,6]
After swapping (5,6) we get [1,3,2,5,4,6,7]
So, we need a minimum of 3 swaps to sort the array in ascending order.

## 6. Array Manipulation

Starting with a 1-indexed array of zeros and a list of operations, for each operation add a value to each of the array element between two given indices, inclusive. Once all operations have been performed, return the maximum value in your array.

For example, the length of your array of zeros n = 10. Your list of queries is as follows:

```
a b k
1 5 3
4 8 7
6 9 1
```

Add the values of k between the indices a and b inclusive:

```
index->  1 2 3  4  5 6 7 8 9 10
	[0,0,0, 0, 0,0,0,0,0, 0]
	[3,3,3, 3, 3,0,0,0,0, 0]
	[3,3,3,10,10,7,7,7,0, 0]
	[3,3,3,10,10,8,8,8,1, 0]
```

The largest value is 10 after all operations are performed.

Function Description

Complete the function arrayManipulation in the editor below. It must return an integer, the maximum value in the resulting array.

arrayManipulation has the following parameters:

n - the number of elements in your array
queries - a two dimensional array of queries where each queries[i] contains three integers, a, b, and k.

Input Format

The first line contains two space-separated integers n and m, the size of the array and the number of operations.
Each of the next m lines contains three space-separated integers a, b and k, the left index, right index and summand.

Constraints

3 <= n <= 10^7
1 <= m <= 2*10^5
1 <= a <= b <= n
0 <= k <= 10^9

Output Format

Return the integer maximum value in the finished array.

Sample Input

```
5 3
1 2 100
2 5 100
3 4 100
```

Sample Output

```
200
```

Explanation

After the first update list will be 100 100 0 0 0.
After the second update list will be 100 200 100 100 100.
After the third update list will be 100 200 200 200 100.
The required answer will be 200.

## 7. Dynamic Array

Create a list, seqList, of N empty sequences, where each
