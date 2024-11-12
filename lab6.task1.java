package lab6;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int z = x;
        x = y;
        y = z;
        System.out.println(x);
        System.out.println(y);
    }
}
