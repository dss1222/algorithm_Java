package 기초연습.단계별로풀기.one차원배열;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class 나머지_3052 {
    public static void main(String[] args) throws IOException {

        boolean[] arr = new boolean[42];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0 ; i < 10 ; i++) {
            arr[Integer.parseInt(br.readLine()) % 42] = true;
        }

        int count = 0;
        for(boolean value : arr) {
            if(value){    // value 가 true 라면
                count++;
            }
        }
        System.out.println(count);
    }
}