package 기초연습.단계별로풀기.one차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OX퀴즈_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        String arr[] = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = bf.readLine();
        }

        for (int i = 0; i < N; i++) {
            int cnt = 0; //연속 점수
            int sum = 0;

            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'O') {
                    cnt++;
                } else {
                    cnt = 0;
                }
                sum += cnt;
            }
            System.out.println(sum);
        }

    }
}
