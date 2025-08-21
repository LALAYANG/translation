import java.util.*;
import java.time.*;
import java.net.*;
import java.io.*;

public class codeforces_469_A {
    public static void main(String[] args) throws IOException {
        int target_size = new Scanner(System.in).nextInt();
        Scanner scanner = new Scanner(System.in);
        Set<Integer> combined_set = new HashSet<>();
        Set<Integer> second_set = new HashSet<>();
        while (scanner.hasNextInt()) {
            combined_set.add(scanner.nextInt());
            second_set.add(scanner.nextInt());
        }
        combined_set.remove(0);
        second_set.remove(0);
        Set<Integer> union_set = new HashSet<>(combined_set);
        union_set.addAll(second_set);
        if (union_set.size() != target_size) {
            System.out.println("Oh, my keyboard!");
        } else {
            System.out.println("I become the guy.");
        }
    }
}