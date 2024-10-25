import java.util.*;

public class atcoder_AGC029_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        A = Arrays.copyOfRange(A, 1, A.length);
        n = A.length;
        ArrayList<Pair> dp = new ArrayList<>();
        dp.add(new Pair(A[0], 0));
        for (int a : Arrays.copyOfRange(A, 1, A.length)) {
            if (a <= dp.get(dp.size() - 1).first) {
                dp = cut(dp, a);
            } else {
                dp.add(new Pair(a, 0));
            }
            boolean isAdded = false;
            for (int j = dp.size() - 1; j >= 0; j--) {
                if (dp.get(j).second < n - 1) {
                    dp = cut(dp, dp.get(j).first - 1);
                    dp.add(new Pair(dp.get(j).first, dp.get(j).second + 1));
                    if (dp.get(dp.size() - 1).first < a) {
                        dp.add(new Pair(a, 0));
                    }
                    isAdded = true;
                    break;
                }
            }
            if (!isAdded) {
                System.out.println(0);
                return;
            }
        }
        System.out.println(n);
    }

    public static ArrayList<Pair> cut(ArrayList<Pair> array, int index) {
        if (index < 1) {
            return new ArrayList<>();
        }
        if (index <= array.get(0).first) {
            ArrayList<Pair> result = new ArrayList<>();
            result.add(new Pair(index, array.get(0).second));
            return result;
        }
        for (int i = array.size() - 1; i > 0; i--) {
            if (array.get(i - 1).first < index) {
                ArrayList<Pair> result = new ArrayList<>(array.subList(0, i));
                result.add(new Pair(index, array.get(i).second));
                return result;
            }
        }
        return array;
    }

    static class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}