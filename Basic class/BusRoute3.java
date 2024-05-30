import java.util.Scanner;
class Route3 {
    String location[];
    int dis[];

    public Route3(String[] location, int[] dis) {
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
    void summarizeRoute(){
        int sum = 0;
        for(int i=0; i<dis.length; i++){
            sum += dis[i];
        }
        System.out.print(location[0] + " "+ location[location.length-1] + " " + sum);
    }
    void getTripInfo(int x, int y){
        boolean check = x>0 && y<=location.length;
        boolean check2 = x<y;
        int sum_dis = 0;
        if(check && check2){
            for(int i=x; i<y; i++){
                sum_dis+=dis[i];
            }
            System.out.print(location[x-1] + " "+ location[y-1] + " ");
            System.out.println(sum_dis);
        }
        else {
            System.out.println("invalid number");
        }
    }
}

public class BusRoute3{
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
        Route3 r = new Route3(location, dis);
        //r.summarizeRoute();
        

        int k = sc.nextInt();
        for(int i=0; i<k; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            r.getTripInfo(x,y);
        }
    }
}