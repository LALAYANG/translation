```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] indexedInput = new int[N];
        for (int i = 0; i < N; i++) {
            indexedInput[i] = scanner.nextInt();
        }
        Arrays.sort(indexedInput);
        int[] A_ = new int[N];
        for (int i = 0; i < N; i++) {
            A_[i] = i + 1;
        }
        int loopStop = 225;
        int checkStop = 224;
        recursivePrint(0, loopStop / checkStop, 1, A_, N);
        System.out.print(A_[N - 1] + " ");
    }

    public static void recursivePrint(int currentIndex, int stop, int step, int[] A_, int N) {
        if (step == 0 || (step > 0 && currentIndex >= stop) || (step < 0 && currentIndex <= stop)) {
            return;
        }
        for (int i = 0; i < N - 1; i++) {
            System.out.print(A_[i] + " ");
        }
        recursivePrint(currentIndex + step, stop, step, A_, N);
    }
}
```

Test input:
66478
20281 61427 40941 28426 39031 24247 34246 31977 39903 50563 40294 29670 10313 62283 9108 20606 31755 36187 64657 43867 28211 3435 18061 36990 61924 18064 65540 63970 13225 52154 32430 8511 10415 58733 6909 51401 64241 56863 22565 35170 22854 43978 21524 33673 66470 25003 42712 25833 21764 60066 15809 39202 8285 51375 62621 44810 36749 18124 18694 54416 9428 48544 63147 61199 13968 34693 9149 46871 61890 6710 55572 37056 51065 1146 3110 51213 29063 19118 59643 52655 17341 11804 12509 33825

Expected output:
66037 50134 47767 59587 9281 26013 16716 5844 59052 13309 46599 20582 54033 1957 26620 48962 5076 43536 336 32085 62614 21694 29655 62897 43788 62833 53633 44278 34705 16978 246 21412 43419 34110 273 29872 31329 18581 49162 63867 60531 22951 19101 17527 61811 5932 44787 47405 42339 43048 49942 20361 52630 36478 4395 35949 64714 23873 13249 45190 36961 3895 39572 16633 60485 63336 63379 27232 46879 18748 43599 10413 51917 7760 3246 2148 26389 40315 35970 3759 49561 59897 20468 50853 63639 32574 1
``` 
