import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Base64;
import java.util.Random;
import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.security.SecureRandom;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class atcoder_ABC126_D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Node> nodes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nodes.add(new Node());
        }
        for (int i = 0; i < n - 1; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();
            Node node1 = nodes.get(u - 1);
            Node node2 = nodes.get(v - 1);
            node1.val = u;
            node2.val = v;
            node1.a.add(new Pair(node2, w));
            node2.a.add(new Pair(node1, w));
        }
        Node root = nodes.get(0);
        root.color = true;
        Set<Node> nodeSet = new HashSet<>();
        traverse(root, 0, nodeSet);
        for (int i = 0; i < n; i++) {
            Node node = nodes.get(i);
            if (node.color) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    public static void traverse(Node node, int distance, Set<Node> nodeSet) {
        if (nodeSet.contains(node)) {
            return;
        }
        nodeSet.add(node);
        for (Pair pair : node.a) {
            Node adjNode = pair.node;
            int dis = pair.dis;
            if ((distance + dis) % 2 == 0) {
                adjNode.color = root.color;
            } else {
                adjNode.color = !root.color;
            }
            traverse(adjNode, distance + dis, nodeSet);
        }
    }

    public static class Node {
        public int val;
        public List<Pair> a = new ArrayList<>();
        public boolean color;
    }

    public static class Pair {
        public Node node;
        public int dis;

        public Pair(Node node, int dis) {
            this.node = node;
            this.dis = dis;
        }
    }
}