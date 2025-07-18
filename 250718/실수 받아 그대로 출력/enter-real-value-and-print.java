import java.util.*;  // Scanner 사용 위해 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();

        // 소수점 까지 출력하게 하려면 print쓰면 ㄴㄴ임 --> System.out.print(N);
        System.out.printf("%.2f", N);
    }
}