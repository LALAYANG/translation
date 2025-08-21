import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class atcoder_ABC167_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        ArrayList<Integer> L = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            L.add(sc.nextInt());
        }
        int x = 1;
        int t = -1;
        boolean flag = false;
        HashMap<Integer, Integer> Hash = new HashMap<>();
        ArrayList<Integer> path = new ArrayList<>();
        path.add(1);
        int ind = 0;
        int count = 0;
        while (x != -1) {
            int ne = L.get(x);
            if (Hash.containsKey(ne)) {
                flag = true;
                t = Hash.get(ne);
                break;
            }
            path.add(ne);
            ind++;
            Hash.put(ne, ind);
            x = ne;
        }
        if (flag) {
            ArrayList<Integer> loop = path.subList(t, path.size());
            if (K < path.size()) {
                System.out.println(path.get(K));
            } else {
                K = K - path.size();
                K = K % loop.size();
                System.out.println(loop.get(K));
            }
        } else {
            System.out.println(path.get(K - 1));
        }
    }
}