import java.util.Scanner;
class Route1 {
    String location[];
    int dis[];

    public Route1(String[] location, int[] dis) {
        this.location = location;
        this.dis = dis;
    }

    public void getStopInfo(int seq) {
        // ไม่มีการคืนค่า
        seq = seq - 1;
        if (seq >= 0 && seq <= location.length - 1) {
            System.out.print(location[seq] + " ");
            System.out.println(dis[seq]);
        } else {
            System.out.println("invalid number");
        }
    }
}
public class BusRoute1{
    public static void main(String [] seq) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] location = new String[n];
        int[] dis = new int[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int num = sc.nextInt();
            location[i] = name;
            dis[i] = num;
        }
        Route1 r = new Route1(location, dis);

        int k = sc.nextInt();
        for(int i=0; i<k; i++){
            int x = sc.nextInt();
            r.getStopInfo(x);
        }
    }
}