import java.util.Scanner;

public class removeAnyDup {
    String removeAnyDup(String str) {
        int len = str.length();
        if (len == 1) {
            return str;
        }
        char c = str.charAt(len - 1);
        String s = str.substring(0, len - 1);
        int ch = s.indexOf(c);
        if (ch == -1) {
            return removeAnyDup(s) + c;
        }
        return removeAnyDup(s);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        removeAnyDup remover = new removeAnyDup();
        String result = remover.removeAnyDup(str);
        System.out.print(result);
    }
}