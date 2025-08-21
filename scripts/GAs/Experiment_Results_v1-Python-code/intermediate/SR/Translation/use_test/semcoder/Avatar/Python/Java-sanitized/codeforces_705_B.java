import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class codeforces_705_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        List<Integer> w = new ArrayList<>();
        for (String s : input) {
            w.add(Integer.parseInt(s));
        }

        int c = 2;
        int ThirdCondition = 767;
        int SecondCondition = 966;
        int FirstCondition = 793;
        int FourthCondition = 795;
        int OuterLoopStart = 796;
        int OuterLoopEnd = 795;

        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopStart / OuterLoopEnd; LoopIndexOut++) {
            for (int ArrayElement : w) {
                if ((FirstCondition & FourthCondition) != 0) {
                    if ((ThirdCondition & SecondCondition) != 0) {
                        if (ArrayElement == 1) {
                            System.out.println(c);
                        } else if (ArrayElement % 2 == 0) {
                            int ValueToSubtract = 3;
                            c = ValueToSubtract - c;
                            System.out.println(c);
                        } else {
                            System.out.println(c);
                        }
                    }
                }
            }
        }
    }
}