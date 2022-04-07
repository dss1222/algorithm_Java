package 기초연습.단계별로풀기.기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 골드바흐의추축_9020 {

    static boolean[] prime=new boolean[10001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        sosu();

        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            int max = m/2;
            int small = m/2;
            while (m == max + small) {
                if (!prime[small] && !prime[max]) {
                    sb.append(small).append(" ").append(max).append('\n');
                    break;
                }
                max++;
                small--;
            }
        }
        System.out.println(sb);
    }

    public static void sosu() {
        prime[0] = prime[1] = true;
        for (int i = 2; i < Math.sqrt(prime.length); i++) {
            if (prime[i]) {
                continue;
            }
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}
