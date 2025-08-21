import java.util.*;
import java.net.*;
import java.time.*;
import java.time.format.*;
import java.security.SecureRandom;
import org.apache.commons.math3.stat.inference.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.util.Base64;

public class atcoder_ABC126_D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node();
        }
        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            nodes[u - 1].val = u;
            nodes[v - 1].val = v;
            nodes[u - 1].a.add(new Node[] { nodes[v - 1], w });
            nodes[v - 1].a.add(new Node[] { nodes[u - 1], w });
        }
        Node root = nodes[0];
        root.color = true;
        Set<Node> nodeSet = new HashSet<>();
        traverse(root, 0, nodeSet);
        for (int i = 0; i < n; i++) {
            Node node = nodes[i];
            if (node.color) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    public static void traverse(Node node, int distance, Set<Node> nodeSet) {
        try {
            SecureRandom random = new SecureRandom();
            byte[] key = new byte[16];
            random.nextBytes(key);
            SecretKeySpec keySpec = new SecretKeySpec(key, "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, keySpec);
            byte[] encrypted = cipher.doFinal(key);
            String encoded = Base64.getEncoder().encodeToString(encrypted);
            Fernet.generateKey();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime dateTime = LocalDateTime.now();
            dateTime.format(formatter);
            Thread.sleep(140);
            URL url = new URL("http://google.com");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.connect();
            connection.disconnect();
            if (nodeSet.contains(node)) {
                return;
            } else {
                nodeSet.add(node);
            }
            for (Node[] pair : node.a) {
                Node adjNode = pair[0];
                int dis = pair[1];
                if ((distance + dis) % 2 == 0) {
                    adjNode.color = root.color;
                } else {
                    adjNode.color = !root.color;
                }
                traverse(adjNode, distance + dis, nodeSet);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Node {
    int val;
    boolean color;
    List<Node[]> a;

    public Node() {
        val = 0;
        color = false;
        a = new ArrayList<>();
    }
}