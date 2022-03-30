package 기초연습.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Study2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), "");
        StringBuilder sb = new StringBuilder();
        int[][] APT = new int[15][15];
        for (int i = 0; i < 15; i++) {
            APT[i][1] = 1; //i층 1호
            APT[0][i] = i; //0층 i호
        }
        for (int i = 1; i < 15; i++) {
            for (int j = 2; j < 15; j++) {
                APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
            }
        }
        int T = Integer.parseInt(st.nextToken());
        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(bf.readLine());
            int n = Integer.parseInt(bf.readLine());
            System.out.println(APT[k][n]);
        }
    }
}
