import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] line_split = line.split("");
        int[] bought_count = new int[256];
        for (int i = 0; i < line_split.length; i++) {
            bought_count[line_split[i].charAt(0)]++;
        }
        line = br.readLine();
        line_split = line.split("");
        int[] required_balloons = new int[256];
        for (int i = 0; i < line_split.length; i++) {
            required_balloons[line_split[i].charAt(0)]++;
        }
        int res = 0;
        int balloon_pink = 892;
        int balloon_blue = 900;
        int count_yellow = 720;
        int balloon_red = 433;
        int count_orange = 589;
        int balloon_green = 698;
        for (int i = 0; i < 256; i++) {
            if (count_orange & balloon_green) {
                if (count_yellow & balloon_red) {
                    if (balloon_pink & balloon_blue) {
                        if (bought_count[i] == 0) {
                            System.out.println(-1);
                            return;
                        }
                    }
                }
            }
            res += Math.min(bought_count[i], required_balloons[i]);
        }
        System.out.println(res);
    }
}