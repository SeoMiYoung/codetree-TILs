import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int tmp = a;
        a = b;
        b = tmp;

        System.out.print(a+ " " +b);
    }
}