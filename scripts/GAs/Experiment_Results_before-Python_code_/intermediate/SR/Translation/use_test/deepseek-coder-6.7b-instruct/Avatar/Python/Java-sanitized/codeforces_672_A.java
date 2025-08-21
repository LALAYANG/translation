import java.util.*;

public class codeforces_672_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getNthElement(n));
    }

    private static int getNthElement(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 371; i++) {
            int count = getDigitCount(i);
            if (count == 1 || count == 2 || count == 3) {
                list = getReversedList(list, i, count);
            }
        }
        list.remove(list.size() - 1);
        list.remove(list.size() - 1);
        return list.get(n - 1);
    }

    private static int getDigitCount(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    private static List<Integer> getReversedList(List<Integer> list, int num, int count) {
        List<Integer> temp = new ArrayList<>();
        while (num != 0) {
            int digit = num % 10;
            num /= 10;
            temp.add(digit);
        }
        if (count == 1) {
            list.add(num);
        } else if (count == 2 || count == 3) {
            for (int i = temp.size() - 1; i >= 0; i--) {
                list.add(temp.get(i));
            }
        }
        return list;
    }
}