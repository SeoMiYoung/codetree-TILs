import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int get_sum = a+b+c;
        int get_avg = (a+b+c)/3;

        System.out.println(get_sum);
        System.out.println(get_avg);
        System.out.println(get_sum - get_avg);
    }
}