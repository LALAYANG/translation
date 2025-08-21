import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeforces_397_B {

    private static class CodeforcesTask397DSolution {
        private int n;
        private int[] a;
        private String result;

        public CodeforcesTask397DSolution() {
            this.n = 0;
            this.a = new int[0];
            this.result = "";
        }

        public void readInput() {
            FastInputReader in = new FastInputReader();
            this.n = in.readInt();
            this.a = new int[this.n];
            for (int i = 0; i < this.n; i++) {
                this.a[i] = in.readInt();
            }
        }

        public void processTask() {
            int aSum = 0;
            for (int i = 0; i < this.n; i++) {
                aSum += this.a[i];
            }
            if (aSum % 3 == 0) {
                this.result = String.valueOf(this.n * (this.n - 1) / 2);
            } else {
                int aSumMod3 = aSum % 3;
                if (aSumMod3 == 1) {
                    aSumMod3 = 2;
                } else {
                    aSumMod3 = 1;
                }
                int count = 0;
                for (int i = 0; i < this.n; i++) {
                    if (this.a[i] % 3 == aSumMod3) {
                        count++;
                    }
                }
                this.result = String.valueOf(count * (count - 1) / 2);
            }
        }

        public String getResult() {
            return this.result;
        }
    }

    private static class FastInputReader {
        BufferedReader br;
        StringTokenizer st;

        public FastInputReader() {
            this.br = new BufferedReader(new InputStreamReader(System.in));
            this.st = new StringTokenizer("");
        }

        public String read() {
            while (!this.st.hasMoreTokens()) {
                try {
                    this.st = new StringTokenizer(this.br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return this.st.nextToken();
        }

        public int readInt() {
            return Integer.parseInt(this.read());
        }
    }

    public static void main(String[] args) {
        CodeforcesTask397DSolution solution = new CodeforcesTask397DSolution();
        solution.readInput();
        solution.processTask();
        System.out.println(solution.getResult());
    }
}