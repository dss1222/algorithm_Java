package 기초연습.단계별로풀기.기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소인수분해_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                sb.append(i).append('\n');
                n /= i;
            }
        }
        if (n != 1) {
            sb.append(n);
        }
        System.out.println(sb);
    }
}
