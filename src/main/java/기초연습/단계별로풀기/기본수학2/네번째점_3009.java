package 기초연습.단계별로풀기.기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 네번째점_3009 {
    public static void main(String[] args) throws IOException {
        int[] A = new int[2];
        int[] B = new int[2];
        int[] C = new int[2];
        int[] D = new int[2];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 2; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 2; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 2; i++) {
            C[i] = Integer.parseInt(st.nextToken());
        }
        if (A[0] == B[0]) {
            D[0] = C[0];
        } else if (B[0] == C[0]) {
            D[0] = A[0];
        } else {
            D[0] = B[0];
        }
        if (A[1] == B[1]) {
            D[1] = C[1];
        } else if (B[1] == C[1]) {
            D[1] = A[1];
        } else {
            D[1] = B[1];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            sb.append(D[i]).append(" ");
        }
        System.out.println(sb);
    }
}
