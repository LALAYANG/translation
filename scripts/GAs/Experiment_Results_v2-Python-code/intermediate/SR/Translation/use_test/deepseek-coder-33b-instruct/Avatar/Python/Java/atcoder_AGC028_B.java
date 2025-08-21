```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        int added_value = 7;
        int base_value = 10;
        int exponent_val = 9;
        BigInteger result_calculate_value0 = BigInteger.valueOf(base_value).pow(exponent_val).add(BigInteger.valueOf(added_value));
        BigInteger MOD = result_calculate_value0;
        Scanner scanner = new Scanner(System.in);
        int input_number = scanner.nextInt();
        BigInteger M = BigInteger.TEN.pow(6);
        BigInteger[] A = new BigInteger[input_number];
        for (int i = 0; i < input_number; i++) {
            A[i] = scanner.nextBigInteger();
        }
        int Nsq = 1000;
        BigInteger[] fact = new BigInteger[Nsq * Nsq];
        fact[0] = BigInteger.ONE;
        for (int n = 1; n < Nsq; n++) {
            fact[n] = fact[n - 1].multiply(BigInteger.valueOf(n)).mod(MOD);
        }
        for (int n = Nsq; n < Nsq * Nsq; n++) {
            fact[n] = fact[n - Nsq].multiply(fact[Nsq - 1]).mod(MOD);
        }
        BigInteger[] j = new BigInteger[input_number];
        for (int i = 0; i < input_number; i++) {
            j[i] = BigInteger.valueOf(i);
        }
        BigInteger[] inv = new BigInteger[input_number];
        for (int i = 0; i < input_number; i++) {
            inv[i] = BigInteger.valueOf(i + 1).modInverse(MOD);
        }
        for (int i = 1; i < input_number; i++) {
            inv[i] = inv[i].add(inv[i - 1]);
        }
        BigInteger[] temp = new BigInteger[input_number];
        for (int i = 0; i < input_number; i++) {
            temp[i] = inv[i].add(inv[input_number - 1 - i]).subtract(BigInteger.ONE);
        }
        BigInteger ans = BigInteger.ZERO;
        for (int i = 0; i < input_number; i++) {
            ans = ans.add(A[i].multiply(temp[i]));
        }
        ans = ans.mod(MOD);
        ans = ans.multiply(fact[input_number - 1]);
        ans = ans.mod(MOD);
        System.out.println(ans);
    }
}
```

