

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(a);
        int ans = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] % ans != 0) {
                ans = -1;
                break;
            }
        }
        System.out.println(ans);
    }
}

```


```

Java code:

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(arr[i]);
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}

```
/src/main/java/com/codechef/solutions/beginner/COPS.md
# [COPS](https://www.codechef.com/problems/COPS)

Chef has N houses in a row (numbered 1 through N) and wants to keep watch over them. For each valid i, the i-th of these houses contains Ai people.

There are M cops (numbered 1 through M). For each valid i, the i-th cop is at house Xi and can cover houses in the range [Xi−D,Xi+D] (both ends of the range are inclusive).

What is the minimum number of cops Chef needs to hire?

### Input
- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains three space-separated integers N, M and D.
- The second line contains N space-separated integers A1,A2,…,AN.
- The third line contains M space-separated integers X1,X2,…,XM.

### Output
For each test case, print a single line containing one integer ― the minimum required number of cops.

### Constraints
- 1≤T≤100
- 1≤N,M≤100
- 1≤D≤100
- 1≤Ai≤100 for each valid i
- 1≤Xi≤N for each valid i

### Example Input
```
2
5 3 1
1 2 3 4 5
1 2 3
5 3 2
1 2 3 4 5
1 2 3
```

### Example Output
```
3
2
```

### Explanation
Example case 1: Chef needs to hire at least three cops. For example, if he hires cops at houses 1, 3 and 5, each of them will cover exactly one house.

Example case 2: Chef needs to hire at least two cops. For example, if he hires cops at houses 1 and 3, each of them will cover exactly two houses.

Python code:

```
num_inp = lambda : int ( input ( ) )
arr_inp = lambda : list ( map ( int , input ( ).split ( ) ) )
sp_inp = lambda : map ( int , input ( ).split ( ) )
for _ in range ( num_inp ( ) ) :
    n , m , d = sp_inp ( )
    a = arr_inp ( )
    x = arr_inp ( )
    ans = 0
    for i in range ( 1 , n + 1 ) :
        if all ( abs ( i - j ) > d for j in x ) :
            ans += 1
    print ( ans )
/src/main/java/com/codechef/solutions/beginner/FLOW006.md
# [FLOW006](https://www.codechef.com/problems/FLOW006)

If Ankit is at (x, y) and the cookie is at (u, v), he can get the cookie if and only if x+y≥u and x+y≥v. Find out if he can get the cookie.

### Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains four space-separated integers x, y, u and v.

### Output
For each test case, print a single line containing the string "YES" if Ankit can get the cookie or "NO" if he cannot.

You may print each character of each string in uppercase or lowercase (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).

### Constraints
- 1≤T≤100
- 1≤x,y,u,v≤100

### Example Input
```
3
1 1 2 1
1 1 1 2
2 2 2 2
```

### Example Output
```
YES
NO
YES
```

### Explanation
Example case 1: Ankit is at (1,1) and the cookie is at (2,1). He can reach the cookie by moving right thrice.

Example case 2: Ankit is at (1,1) and the cookie is at (1,2). He cannot reach the cookie.

Example case 3: Ankit is at (2,2) and the cookie is at (2,2). He can reach the cookie by not moving.

Python code:

```
num_inp = lambda : int ( input ( ) )
arr_inp = lambda : list ( map ( int , input ( ).split ( ) ) )
sp_inp = lambda : map ( int , input ( ).split ( ) )
for _ in range ( num_inp ( ) ) :
    x , y , u , v = sp_inp ( )
    print ( [ "NO" , "YES" ] [ x + y >= u and x + y >= v ] )

```

Java code:

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] arr = br.readLine().split(" ");
            int x = Integer.parseInt(arr[0]);
            int y = Integer.parseInt(arr[1]);
            int u = Integer.parseInt(arr[2]);
            int v = Integer.parseInt(arr[3]);
            if (x + y >= u && x + y >= v) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

```
/src/main/java/com/codechef/solutions/beginner/FLOW004.md
# [FLOW004](https://www.codechef.com/problems/FLOW004)

Write a program to find the sum of the first and last digit of this number.

### Input
The first line contains an integer T, total number of testcases. Then follow T lines, each line contains an integer N.

### Output
Display the sum of first and last digit of N.

### Constraints
1 ≤ T ≤ 1000
1 ≤ N ≤ 1000000

### Example
#### Input
```
3 
1234
124894
242323
```

#### Output
```
5
5
5
```

Python code:

```
num_inp = lambda : int ( input ( ) )
arr_inp = lambda : list ( map ( int , input ( ).split ( ) ) )
sp_inp = lambda : map ( int , input ( ).split ( ) )
for _ in range ( num_inp ( ) ) :
    n = input ( )
    print ( int ( n [ 0 ] ) + int ( n [ - 1 ] ) )

```

Java code:

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String n = br.readLine();
            System.out.println(n.charAt(0) - '0' + n.charAt(n.length() - 1) - '0');
        }
    }
}

```

### Explanation
Example case 1. 5 is the sum of first and last digits of the number 1234.

Example case 2. 5 is the sum of first and last digits of the number 124894.

Example case 3. 5 is the sum of first and last digits of the number 242323.

### Test Generation
The test data is generated by a program. The program uses a pseudo-random number generator. The seed of the generator is set to a fixed value just before generating a test case. This ensures that the test data is always the same, and your program will get the same output as the jury's program.

The pseudo-random number generator used is a linear congruential generator. It starts with a seed x0, and generates the sequence x0,x1,x2,… using the recurrence relation xi=(a⋅xi−1+b)modm.

The test data is generated as follows:

- The seed of the generator is set to the value of the test number.
- The first integer in the test is T=1000.
- The next integer in the test is N=xi, where xi is the 1000-th number generated by the generator.

### Solution
The problem can be solved by finding the first and last digits of the number N.

The first digit of N is the first digit of the decimal representation of N. The last digit of N is the last digit of the decimal representation of N.

The first digit of the decimal representation of N can be found by repeatedly dividing N by 10 until N becomes less than 10. The last digit of the decimal representation of N is the remainder of N divided by 10.

The following pseudocode shows how to find the first and last digits of the decimal representation of N:

```
first_digit = N
while first_digit >= 10:
    first_digit = first_digit / 10
last_digit = N % 10
```

The sum of the first and last digits of the decimal representation of N is then first_digit + last_digit.

### Complexity Analysis
The time complexity of the solution is O(logN), where N is the input number. This is because the while loop in the pseudocode is executed at most log10(N) times, and the modulo operation is O(1).

The space complexity of the solution is O(1), as no additional memory is required.

### Alternative Solution
An alternative solution to the problem is to convert the number N to a string and then find the first and last characters of the string. This solution is more straightforward and easier to implement, but it may be less efficient than the solution described above.

The following pseudocode shows how to find the first and last digits of the decimal representation of N using a string:

```
string_representation = str(N)
first_digit = string_representation[0]
last_digit = string_representation[-1]
```

The sum of the first and last digits of the decimal representation of N is then int(first_digit) + int(last_digit).

### Complexity Analysis
The time complexity of the solution is O(logN), where N is the input number. This is because the string conversion and indexing operations are O(logN) and the addition operation is O(1).

The space complexity of the solution is O(logN), as the string representation of N may require O(logN) memory.

### Comparison of Solutions
The two solutions described above have different time and space complexities. The solution using division and modulo operations has a time complexity of O(logN) and a space complexity of O(1), while the solution using string conversion and indexing has a time complexity of O(logN) and a space complexity of O(logN).

In general, the solution using division and modulo operations is more efficient than the solution using string conversion and indexing, as it does not require the creation of a string representation of N. However, the solution using string conversion and indexing may be more straightforward and easier to implement, especially for beginners.

### Test Generation
The test data is generated by a program. The program uses a pseudo-random number generator. The seed of the generator is set to a fixed value just before generating a test case. This ensures that the test data is always the same, and your program will get the same output as the jury's program.

The pseudo-random number generator used is a linear congruential generator. It starts with a seed x0, and generates the sequence x0,x1,x2,… using the recurrence relation xi=(a⋅xi−1+b)modm.

The test data is generated as follows:

- The seed of the generator is set to the value of the test number.
- The first integer in the test is T=1000.
- The next integer in the test is N=xi, where xi is the 1000-th number generated by the generator.

### Solution
The problem can be solved by finding the first and last digits of the number N.

The first digit of N is the first digit of the decimal representation of N. The last digit of N is the last digit of the decimal representation of N.

The first digit of the decimal representation of N can be found by repeatedly dividing N by 10 until N becomes less than 10. The last digit of the decimal representation of N is the remainder of N divided by 10.

The following pseudocode shows how to find the first and last digits of the decimal representation of N:

```
first_digit = N
while first_digit >= 10:
    first_digit = first_digit / 10
last_digit = N % 10
```

The sum of the first and last digits of the decimal representation of N is then first_digit + last_digit.

### Complexity Analysis
The time complexity of the solution is O(logN), where N is the input number. This is because the while loop in the pseudocode is executed at most log10(N) times, and the modulo operation is O(1).

The space complexity of the solution is O(1), as no additional memory is required.

### Alternative Solution
An alternative solution to the problem is to convert the number N to a string and then find the first and last characters of the string. This solution is more straightforward and easier to implement, but it may be less efficient than the solution described above.

The following pseudocode shows how to find the first and last digits of the decimal representation of N using a string:

```
string_representation = str(N)
first_digit = string_representation[0]
last_digit = string_representation[-1]
```

The sum of the first and last digits of the decimal representation of N is then int(first_digit) + int(last_digit).

### Complexity Analysis
The time complexity of the solution is O(logN), where N is the input number. This is because the string conversion and indexing operations are O(logN) and the addition operation is O(1).

The space complexity of the solution is O(logN), as the string representation of N may require O(logN) memory.

### Comparison of Solutions
The two solutions described above have different time and space complexities. The solution using division and modulo operations has a time complexity of O(logN) and a space complexity of O(1), while the solution using string conversion and indexing has a time complexity of O(logN) and a space complexity of O(logN).

In general,
