import java.util.Scanner;

public class Boj2501 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int min = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0 && k == i) {
                min = i;
            }
        }

        System.out.println(min);
    }
}
