package 기초연습.단계별로풀기.재귀함수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치수5_10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(Fibonacci(n));
    }

    private static int Fibonacci(int N) {
        if(N==0) return 0;
        if(N==1) return 1;

        return Fibonacci(N - 1) + Fibonacci(N - 2);
    }


    private static void list() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n == 0) {
            System.out.println(0);
        } else if (n == 1) {
            System.out.println(1);
        } else {
            int[] list = new int[n];
            list[1] = 1;
            int sum = 1;
            for (int i = 1; i < n - 1; i++) {
                list[i + 1] = list[i] + list[i - 1];
                sum += list[i];
            }
            System.out.println(sum);
        }
    }
}
