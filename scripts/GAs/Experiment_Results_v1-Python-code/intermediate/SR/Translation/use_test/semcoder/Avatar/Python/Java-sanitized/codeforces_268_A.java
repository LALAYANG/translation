import java.util.ArrayList;
import java.util.List;

public class codeforces_268_A {
    public static void main(String[] args) {
        int n = 23;
        List<String[]> matrix = new ArrayList<>();
        int commonCount = 0;

        for (int i = 0; i < n; i++) {
            String[] a = {"43", "78"}; // Example input values
            matrix.add(a);
        }

        int conditionOne = 145;
        int conditionTwo = 467;

        for (int j = 0; j < matrix.size(); j++) {
            for (int k = 0; k < matrix.size(); k++) {
                if ((conditionOne & conditionTwo) != 0) {
                    if (k == j) {
                        continue;
                    } else if (matrix.get(j)[0].equals(matrix.get(k)[1])) {
                        commonCount++;
                    }
                }
            }
        }

        System.out.println(commonCount);
    }
}