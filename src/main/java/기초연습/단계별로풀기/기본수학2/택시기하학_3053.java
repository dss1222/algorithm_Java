package 기초연습.단계별로풀기.기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 택시기하학_3053 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double R = Double.parseDouble(br.readLine()); // 반지름 R

        System.out.println(R * R * Math.PI);	// 유클리드 원의 넓이
        System.out.println(2 * R * R);		// 택시기하학 원의 넓이

    }
}
