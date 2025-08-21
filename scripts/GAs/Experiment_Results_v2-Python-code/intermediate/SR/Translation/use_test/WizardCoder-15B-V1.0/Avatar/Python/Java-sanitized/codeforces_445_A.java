import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_445_A {
    public static void main(String[] args) {
        int n, m;
        String[] chessboard = new String[n];
        TTest tTest = new TTest();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] input = br.readLine().split(" ");
            n = Integer.parseInt(input[0]);
            m = Integer.parseInt(input[1]);
            for (int i = 0; i < n; i++) {
                String[] current_row = br.readLine().split("");
                chessboard[i] = current_row;
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < n; i++) {
            String[] current_row = chessboard[i];
            for (int j = 0; j < m; j++) {
                if (current_row[j].equals(".")) {
                    if (i + j % 2 == 0) {
                        current_row[j] = "W";
                    } else {
                        current_row[j] = "B";
                    }
                }
            }
        }

        for (String[] row : chessboard) {
            for (String cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }
}