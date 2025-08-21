import numpy as np

public class codeforces_544_B {
    public static void main(String[] args) {
        int condition_one = 207;
        int condition_two = 790;
        int row_count = 34;
        int k = 621;

        if ((condition_one & condition_two) != 0) {
            if (k <= Math.max(row_count * row_count / 2, row_count * row_count - row_count * row_count / 2)) {
                System.out.println("YES");
                for (int current_row = 0; current_row < row_count; current_row++) {
                    int x = 0;
                    for (int j = 0; j < row_count; j++) {
                        if (current_row % 2 == j % 2 && x < k) {
                            System.out.print("L");
                            x++;
                        } else {
                            System.out.print("S");
                        }
                    }
                    System.out.println();
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}