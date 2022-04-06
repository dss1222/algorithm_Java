package 기초연습.단계별로풀기.기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 소수찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();    // N 은 쓰지 않음.
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {

            // 소수인경우 true, 아닌경우 false
            boolean isPrime = true;

            int num = Integer.parseInt(st.nextToken());

            if (num == 1) {
                continue;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }
        }
        System.out.println(count);
    }

    boolean is_Prime(int Number) {
        // 1 은 소수가 아니다.
        if(Number == 1){
            return false;
        }
        // 2 ~ Number의 제곱근까지 중 나누어 떨어지는 약수가 있는지 판별
        // Number = 2 의 경우는 자연스럽게 for문을 검사하지 않게 됨
        for(int i = 2; i <= Math.sqrt(Number); i++) {

            if(Number % i == 0) return false;
        }
        // 위 두 조건에 걸리지 않으면 소수다.
        return true;
    }
}

