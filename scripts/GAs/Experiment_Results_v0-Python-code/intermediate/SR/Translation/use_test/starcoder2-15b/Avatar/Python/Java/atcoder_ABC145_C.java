

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            indices.add(i);
        }
        Collections.shuffle(indices);
        List<List<Integer>> permutations = new ArrayList<>();
        do {
            permutations.add(new ArrayList<>(indices));
        } while (Collections.nextPermutation(indices));
        List<Double> permutationDistances = new ArrayList<>();
        for (List<Integer> permutation : permutations) {
            double totalDistance = 0;
            for (int i = 0; i < N - 1; i++) {
                int f = permutation.get(i);
                int t = permutation.get(i + 1);
                double distance = Math.sqrt(Math.pow(x[t] - x[f], 2) + Math.pow(y[t] - y[f], 2));
                totalDistance += distance;
            }
            permutationDistances.add(totalDistance);
        }
        double result = 0;
        for (double permutationDistance : permutationDistances) {
            result += permutationDistance;
        }
        result /= permutationDistances.size();
        System.out.println(result);
    }
}
```

## 2.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 3.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 4.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 5.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 6.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 7.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 8.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 9.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 10.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 11.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 12.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 13.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 14.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 15.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 16.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 17.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 18.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 19.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 20.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 21.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 22.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 23.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 24.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 25.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 26.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 27.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 28.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 29.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 30.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 31.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 32.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 33.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 34.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 35.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 36.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 37.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 38.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 39.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 40.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 41.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 42.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 43.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 44.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 45.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 46.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 47.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 48.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 49.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 50.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 51.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 52.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 53.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 54.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 55.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 56.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 57.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```

## 58.

Write a function that takes a list of integers and returns the sum of the integers.

```
def sum_of_integers(numbers):
    return sum(numbers)
```


