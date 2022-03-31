package 기초연습.단계별로풀기.반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 합_8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int sum=0;
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
