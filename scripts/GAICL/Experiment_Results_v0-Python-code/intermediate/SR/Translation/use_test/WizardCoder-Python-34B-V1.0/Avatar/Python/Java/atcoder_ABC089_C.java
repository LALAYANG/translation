```java
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.Comparator;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.Comparator;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.next();
        }
        String[] march = {"M", "A", "R", "C", "H"};
        int[] march_lis = new int[5];
        int check3 = 111;
        int check1 = 134;
        int check2 = 843;
        int check4 = 771;
        int ans = 0;
        for (String s : S) {
            if ((check2 & check4) != 0) {
                if ((check3 & check1) != 0) {
                    if (Arrays.asList(march).contains(s.charAt(0))) {
                        march_lis[Arrays.asList(march).indexOf(s.charAt(0))]++;
                }
            }
        }
        for (int x : march_lis) {
            for (int y : march_lis) {
                for (int z : march_lis) {
                    ans += x * y * z;
                }
            }
        }
        System.out.println(ans);
    }
}
``` 
