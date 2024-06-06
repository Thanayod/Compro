import java.util.Scanner;

public class ConsecDupRemoval {
    String dupRemove(String str) {
        // Your work here
        int len = str.length();
        if (len == 1) {
            return str;
        }
        String keep = "";
        if (str.charAt(0) != str.charAt(1)) {
            keep += str.charAt(0);
        }
        String next = str.substring(1);
        return keep + dupRemove(next);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String result = (new ConsecDupRemoval()).dupRemove(str);
        System.out.print(result);
    }
}