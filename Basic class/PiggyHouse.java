import java.util.Scanner;

class House {
    int w;
    int l;
    int num = 0;
    int space = 0;
    int home;

    public House(int w, int l, int num, int home) {
        this.w = w;
        this.l = l;
        this.num = num;
        this.home = home;
    }
    void printPiggies() {
        int P = num;
        int s = space;
        System.out.print("Piggies " + P + ", ");
        System.out.println("Space " + s);
    }
    static void encourage() {
        System.out.println("Piggy Together STRONG!");
    }
}
public class PiggyHouse {
    public static void main(String[] args) {
        House.encourage();
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int l = sc.nextInt();
        int num = 0;
        int space = 0;
        int home = w * l;

        House hs = new House(w, l, num, home);
        while (true) {
            int K = sc.nextInt();
            int pig = 9*(K+hs.num);
            if (pig <= home) {
                hs.num += K;
                hs.space = (9*hs.num);
                hs.printPiggies();
            } 
            else {
                System.out.println("no space, need a new house");
                break;
            }
        }
    }
}