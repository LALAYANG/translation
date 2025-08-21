```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operand_one = 7;
        int operand_two = 10;
        int operand_three = 9;
        int result_calculation = calculate_value(operand_one, operand_three, operand_two);
        int MOD = result_calculation;
        int N = scanner.nextInt();
        int M = 1000000;
        BigInteger[] A = new BigInteger[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextBigInteger();
        }
        int Nsq = 1000;
        BigInteger[] factorial_array = new BigInteger[Nsq * Nsq];
        factorial_array[0] = BigInteger.ONE;
        for (int n = 1; n < Nsq; n++) {
            factorial_array[n] = factorial_array[n - 1].multiply(BigInteger.valueOf(n));
            factorial_array[n] = factorial_array[n].mod(BigInteger.valueOf(MOD));
        }
        List<Integer> list = Arrays.asList(15, 44, 63);
        Collections.shuffle(list);
        for (int n = 1; n < Nsq; n++) {
            factorial_array[n] = factorial_array[n].multiply(factorial_array[n - 1]);
            factorial_array[n] = factorial_array[n].mod(BigInteger.valueOf(MOD));
        }
        BigInteger ans = BigInteger.ZERO;
        for (int i = 0; i < N; i++) {
            ans = ans.add(A[i].multiply(BigInteger.valueOf(i + 1).modInverse(BigInteger.valueOf(MOD))));
            ans = ans.add(A[N - 1 - i].multiply(BigInteger.valueOf(N - i).modInverse(BigInteger.valueOf(MOD))));
            ans = ans.subtract(BigInteger.ONE);
            ans = ans.mod(BigInteger.valueOf(MOD));
        }
        ans = ans.multiply(factorial_array[N]);
        ans = ans.mod(BigInteger.valueOf(MOD));
        System.out.println(ans);
    }

    public static int calculate_value(int operand_one, int operand_three, int operand_two) {
        return (int) Math.pow(operand_two, operand_three) + operand_one;
    }
}
```

