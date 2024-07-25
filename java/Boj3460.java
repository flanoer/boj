import java.util.Scanner;

public class Boj3460 {

    /**
     * 양의 정수 n이 주어졌을 때, 이를 이진수로 나타냈을 때 1의 위치를 모두 찾는 프로그램을 작성하시오. 최하위 비트(least significant bit, lsb)의 위치는 0이다.
     *
     * 입력
     * 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, n이 주어진다. (1 ≤ T ≤ 10, 1 ≤ n ≤ 10^6)
     *
     * 출력
     * 각 테스트 케이스에 대해서, 1의 위치를 공백으로 구분해서 줄 하나에 출력한다. 위치가 낮은 것부터 출력한다.
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ts = in.nextInt();
        int loop = 0;
        int [] t = new int[ts];
        while(loop < ts) {
            t[loop] = in.nextInt();
            loop++;
        }

        for(int n : t) {
            String binaryString = Integer.toBinaryString(n);

            StringBuilder binaryPoint = new StringBuilder(binaryString);
            binaryPoint.reverse();

            char[] chars = binaryPoint.toString().toCharArray();

            binaryPoint = new StringBuilder();
            for(int j = 0 ; j < chars.length ; j++) {
                if(chars[j] == '1') {
                    binaryPoint.append(j);
                    if(j != chars.length - 1) binaryPoint.append(" ");
                }
            }

            System.out.println(binaryPoint);
        }

        in.close();
    }
}
