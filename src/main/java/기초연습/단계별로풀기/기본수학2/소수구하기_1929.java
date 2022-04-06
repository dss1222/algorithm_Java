package 기초연습.단계별로풀기.기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 소수구하기_1929 {
    public static boolean prime[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        prime = new boolean[n + 1];
        sosu();
        StringBuilder sb = new StringBuilder();
        for (int i = m; i <= n; i++) {
            if (!prime[i]) {
                sb.append(i).append('\n');
            } else continue;
        }
        System.out.println(sb);
    }

    public static void sosu() {
        prime[0]=prime[1]=true;

        for (int i = 2; i < Math.sqrt(prime.length); i++) {
            if (prime[i] == true) {
                continue;
            }
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}
