// Translated code snippet to Java

// Define the remainder_division function
public static int remainder_division(int dividend, int divisor, int n) {
    return (n - dividend) / divisor;
}

// Define the my_decorator function
public static Object my_decorator(Object func) {
    return func;
}

// Define the combination_calculation function
public static long combination_calculation(int n, int r, int mod) {
    if (r < 0 || r > n) {
        return 0;
    }
    r = Math.min(r, n - r);
    return g1[n] * g2[r] * g2[n - r] % mod;
}

// Define the another_combination_calc function
public static long another_combination_calc(int p, int q) {
    return combination_calculation(p + q - 1, q - 1, mod);
}

// Define the solve function
public static long solve(int n) {
    assert n <= K + 1;
    long ans = 0;
    int divisor = 2;
    int dividend = 1;

    int remainder_div_result = remainder_division(dividend, divisor, n);
    int kumi = remainder_div_result;

    for (int p = 0; p <= kumi; p++) {
        if (p > N) {
            break;
        }
        ans += 2L << p * combination_calculation(kumi, p, mod) * another_combination_calc(N - p, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0)));
        if (n % 2 == 0 && N - p - 1 >= 0) {
            ans += 2L << p * combination_calculation(kumi, p, mod) * another_combination_calc(N - p - 1, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0)));
        }
    }
    return ans;
}

// Main function to execute the solution
public static void main(String[] args) {
    // Initialize variables and arrays
    int K = 1;
    int N = 1;
    int mod = 998244353;
    int __N = 8000;
    long[] g1 = new long[__N + 1];
    long[] g2 = new long[__N + 1];
    long[] inverse = new long[__N + 1];

    // Calculate values for g1, g2, and inverse
    for (int i = 2; i <= __N; i++) {
        g1[i] = g1[i - 1] * i % mod;
        inverse[i] = -inverse[mod % i] * (mod / i) % mod;
        g2[i] = g2[i - 1] * inverse[i] % mod;
    }

    // Perform the solution
    long[] ans = new long[2 * K];
    for (int i = 2; i <= 2 * K; i++) {
        if (i <= K + 1) {
            ans[i - 2] = solve(i) % mod;
            System.out.println(ans[i - 2]);
        } else {
            System.out.println(ans[2 * K - i]);
        }
    }
}