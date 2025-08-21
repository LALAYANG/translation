import java.util.*;
import java.io.*;
import org.apache.commons.math3.stat.inference.*;

public class codeforces_632_B {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] pieces = br.readLine().split(" ");
        String[] colors = br.readLine().split(" ");
        int[][] pieces_arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            pieces_arr[i][0] = Integer.parseInt(pieces[i]);
            pieces_arr[i][1] = colors[i].charAt(0) == 'B' ? 1 : 0;
        }
        int result = Bob_sMaxStrength(pieces_arr);
        System.out.println(result);
    }

    public static int Bob_sMaxStrength(int[][] pieces) {
        int pScore = 0, sScore = 0, pMaxScore = 0, sMaxScore = 0;
        for (int i = 0; i < pieces.length; i++) {
            if (pieces[i][1] == 1) {
                pScore += pieces[i][0];
                if (pScore > pMaxScore) {
                    pMaxScore = pScore;
                }
            } else {
                sScore += pieces[i][0];
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            }
        }
        if (pMaxScore > sMaxScore) {
            return pMaxScore;
        }
        return sMaxScore;
    }
}