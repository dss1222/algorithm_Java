package 기초연습.단계별로풀기.기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 기본수학1_1193 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int cross_count = 1,  //해당 범위의 대각선 칸 개수
                prev_count_sum = 0;  //해당 대각선 직선 대각선 까지의 칸의 누적 합


        while (true) {
            // 직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
            if (X <= prev_count_sum + cross_count) {
                if (cross_count % 2 == 1) {
                    // 분모가 큰 수부터 시작
                    // 분모는 대각선 개수 - (X 번째 - 직전 대각선까지의 누적합 - 1)
                    // 분자는 X 번째 - 직전 대각선까지의 누적합
                    System.out.println((cross_count - (X - prev_count_sum - 1)) + "/" + (X - prev_count_sum));
                    break;
                } else {
                    // 홀수일 때의 출력을 반대로
                    System.out.println((X - prev_count_sum) + "/" + (cross_count - (X - prev_count_sum - 1)));
                    break;
                }
            } else {
                prev_count_sum += cross_count;
                cross_count++;
            }
        }
    }
}
