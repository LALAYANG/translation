

```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int MOD = (int)Math.pow(10, 9) + 7;
		int input_number = sc.nextInt();
		int[] A = new int[input_number];
		for(int i = 0; i < input_number; i++) {
			A[i] = sc.nextInt();
		}
		int M = (int)Math.pow(10, 6);
		int Nsq = (int)Math.pow(10, 3);
		int[][] fact = new int[Nsq][Nsq];
		fact[0][0] = 1;
		for(int n = 1; n < Nsq; n++) {
			for(int m = 0; m < Nsq; m++) {
				fact[n][m] = (int)((long)fact[n - 1][m] * fact[n][m] % MOD);
			}
		}
		for(int n = 1; n < Nsq; n++) {
			fact[n][Nsq - 1] = (int)((long)fact[n - 1][Nsq - 1] * fact[n][Nsq - 1] % MOD);
		}
		int[] j = new int[input_number];
		for(int i = 0; i < input_number; i++) {
			j[i] = i;
		}
		int[] inv = new int[input_number];
		inv[0] = 1;
		for(int i = 1; i < input_number; i++) {
			inv[i] = (int)((long)inv[i - 1] * (i + 1) % MOD);
		}
		int[] temp = new int[input_number];
		for(int i = 0; i < input_number; i++) {
			temp[i] = (inv[j[i]] + inv[input_number - 1 - j[i]] - 1) % MOD;
		}
		int ans = 0;
		for(int i = 0; i < input_number; i++) {
			ans = (ans + (int)((long)A[i] * temp[i] % MOD)) % MOD;
		}
		ans = (int)((long)ans * fact[input_number][Nsq - 1] % MOD);
		System.out.println(ans);
	}
}
```

## 2.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10
1 2 3 4 5 6 7 8 9 10
Expected output:
10

```
import sys
input = sys.stdin.readline

def get_max_value(array):
    max_value = array[0]
    for i in range(1, len(array)):
        if array[i] > max_value:
            max_value = array[i]
    return max_value

def get_min_value(array):
    min_value = array[0]
    for i in range(1, len(array)):
        if array[i] < min_value:
            min_value = array[i]
    return min_value

def get_sum(array):
    sum = 0
    for i in range(len(array)):
        sum += array[i]
    return sum

def get_average(array):
    return get_sum(array) / len(array)

def get_median(array):
    array.sort()
    if len(array) % 2 == 0:
        return (array[len(array) // 2 - 1] + array[len(array) // 2]) / 2
    else:
        return array[len(array) // 2]

def get_mode(array):
    count = {}
    for i in range(len(array)):
        if array[i] in count:
            count[array[i]] += 1
        else:
            count[array[i]] = 1
    max_count = 0
    for key in count:
        if count[key] > max_count:
            max_count = count[key]
    mode = []
    for key in count:
        if count[key] == max_count:
            mode.append(key)
    return mode

def get_range(array):
    return get_max_value(array) - get_min_value(array)

def get_variance(array):
    average = get_average(array)
    variance = 0
    for i in range(len(array)):
        variance += (array[i] - average) ** 2
    return variance / len(array)

def get_standard_deviation(array):
    return get_variance(array) ** 0.5

def get_coefficient_of_variation(array):
    return get_standard_deviation(array) / get_average(array)

def get_quartile(array):
    array.sort()
    if len(array) % 2 == 0:
        return (array[len(array) // 4 - 1] + array[len(array) // 4]) / 2, (array[len(array) // 2 - 1] + array[len(array) // 2]) / 2, (array[len(array) // 4 * 3 - 1] + array[len(array) // 4 * 3]) / 2
    else:
        return array[len(array) // 4], array[len(array) // 2], array[len(array) // 4 * 3]

def get_interquartile_range(array):
    q1, q2, q3 = get_quartile(array)
    return q3 - q1

def get_skewness(array):
    average = get_average(array)
    variance = get_variance(array)
    skewness = 0
    for i in range(len(array)):
        skewness += (array[i] - average) ** 3
    return skewness / (len(array) * variance ** 1.5)

def get_kurtosis(array):
    average = get_average(array)
    variance = get_variance(array)
    kurtosis = 0
    for i in range(len(array)):
        kurtosis += (array[i] - average) ** 4
    return kurtosis / (len(array) * variance ** 2) - 3

def get_pearson_correlation_coefficient(array1, array2):
    average1 = get_average(array1)
    average2 = get_average(array2)
    variance1 = get_variance(array1)
    variance2 = get_variance(array2)
    covariance = 0
    for i in range(len(array1)):
        covariance += (array1[i] - average1) * (array2[i] - average2)
    return covariance / (len(array1) * variance1 * variance2) ** 0.5

def get_spearman_correlation_coefficient(array1, array2):
    array1.sort()
    array2.sort()
    rank1 = [0] * len(array1)
    rank2 = [0] * len(array2)
    for i in range(len(array1)):
        rank1[i] = i + 1
    for i in range(len(array2)):
        rank2[i] = i + 1
    return get_pearson_correlation_coefficient(rank1, rank2)

def get_covariance(array1, array2):
    average1 = get_average(array1)
    average2 = get_average(array2)
    covariance = 0
    for i in range(len(array1)):
        covariance += (array1[i] - average1) * (array2[i] - average2)
    return covariance / len(array1)

def get_correlation_coefficient(array1, array2):
    covariance = get_covariance(array1, array2)
    return covariance / (get_standard_deviation(array1) * get_standard_deviation(array2))

def get_linear_regression(array1, array2):
    average1 = get_average(array1)
    average2 = get_average(array2)
    covariance = get_covariance(array1, array2)
    variance1 = get_variance(array1)
    return covariance / variance1, average2 - covariance / variance1 * average1

def get_least_squares_method(array1, array2):
    average1 = get_average(array1)
    average2 = get_average(array2)
    covariance = get_covariance(array1, array2)
    variance1 = get_variance(array1)
    return covariance / variance1, average2 - covariance / variance1 * average1

def get_least_squares_method_with_intercept(array1, array2):
    average1 = get_average(array1)
    average2 = get_average(array2)
    covariance = get_covariance(array1, array2)
    variance1 = get_variance(array1)
    return covariance / variance1, average2 - covariance / variance1 * average1

def get_least_squares_method_with_intercept_and_weight(array1, array2, array3):
    average1 = get_average(array1)
    average2 = get_average(array2)
    average3 = get_average(array3)
    covariance12 = get_covariance(array1, array2)
    covariance13 = get_covariance(array1, array3)
    covariance23 = get_covariance(array2, array3)
    variance1 = get_variance(array1)
    variance2 = get_variance(array2)
    return (covariance12 - covariance13 * covariance23 / variance2) / (variance1 - covariance13 ** 2 / variance2), average2 - (covariance12 - covariance13 * covariance23 / variance2) / (variance1 - covariance13 ** 2 / variance2) * average1 - (covariance23 - covariance12 * covariance13 / variance1) / (variance2 - covariance12 ** 2 / variance1) * average3

def get_least_squares_method_with_intercept_and_weight_and_power(array1, array2, array3, array4):
    average1 = get_average(array1)
    average2 = get_average(array2)
    average3 = get_average(array3)
    average4 = get_average(array4)
    covariance12 = get_covariance(array1, array2)
    covariance13 = get_covariance(array1, array3)
    covariance14 = get_covariance(array1, array4)
    covariance23 = get_covariance(array2, array3)
    covariance24 = get_covariance(array2, array4)
    covariance34 = get_covariance(array3, array4)
    variance1 = get_variance(array1)
    variance2 = get_variance(array2)
    variance3 = get_variance(array3)
    return (covariance12 * covariance34 - covariance13 * covariance24) / (variance1 * variance3 - covariance13 ** 2), average2 - (covariance12 * covariance34 - covariance13 * covariance24) / (variance1 * variance3 - covariance13 ** 2) * average1 - (covariance23 * covariance14 - covariance13 * covariance24) / (variance2 * variance3 - covariance23 ** 2) * average3, average4 - (covariance12 * covariance34 - covariance13 * covariance24) / (variance1 * variance3 - covariance13 ** 2) * average1 - (covariance23 * covariance14 - covariance13 * covariance24) / (variance2 * variance3 - covariance23 ** 2) * average3

def get_least_squares_method_with_intercept_and_weight_and_power_and_log(array1, array2, array3, array4, array5):
    average1 = get_average(array1)
    average2 = get_average(array2)
    average3 = get_average(array3)
    average4 = get_average(array4)
    average5 = get_average(array5)
    covariance12 = get_covariance(array1, array2)
    covariance13 = get_covariance(array1, array3)
    covariance14 = get_covariance(array1, array4)
    covariance15 = get_covariance(array1, array5)
    covariance23 = get_covariance(array2, array3)
    covariance24 = get_covariance(array2, array4)
    covariance25 = get_covariance(array2, array5)
    covariance34
