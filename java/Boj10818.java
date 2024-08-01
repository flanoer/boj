import java.util.Scanner;

public class Boj10818 {

    /**
     * 문제
     * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
     * 
     * 입력
     * 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
     * 
     * 출력
     * 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
     */
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int loop = 0;
        int[] array = new int[n];

        while(loop < n) {
            array[loop] = Integer.parseInt(in.next());
            loop++;
        }

        int min = 0;
        int max = 0;
        for(int i = 0 ; i < n ; i++) {
            int next = i+1;
            if(i == 0) {
                min = array[i];
                max = array[i];
            }

            if(next == n) break;

            if(array[next] < min) {
                min = array[next];
                continue;
            }

            if(array[next] > max) {
                max = array[next];
            }
        }

        System.out.printf("%d %d", min, max);
    }
}