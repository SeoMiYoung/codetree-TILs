import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N >= 80) {
            System.out.print("pass");
        }
        else {
            System.out.printf("%d more score", 80-N);
        }
    }
}