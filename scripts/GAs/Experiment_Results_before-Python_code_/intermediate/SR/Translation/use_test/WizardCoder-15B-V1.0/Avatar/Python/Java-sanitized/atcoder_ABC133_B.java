import java.util.*;
public class atcoder_ABC133_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        List<List<Integer>> points = new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> point = new ArrayList<>();
            for(int j=0;j<d;j++){
                point.add(sc.nextInt());
            }
            points.add(point);
        }
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(isInteger(distance(points.get(i),points.get(j)))){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static double distance(List<Integer> p1, List<Integer> p2){
        double dist = 0.0;
        for(int i=0;i<p1.size();i++){
            dist += Math.pow(p1.get(i)-p2.get(i),2);
        }
        return Math.sqrt(dist);
    }
    public static boolean isInteger(double num){
        return Math.floor(num) == num;
    }
}