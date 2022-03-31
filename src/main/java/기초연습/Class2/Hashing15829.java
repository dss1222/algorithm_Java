package 기초연습.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hashing15829 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final int R = 31;
    static final int M = 1234567891;
    public static void main(String[] args) throws IOException {
        int plainStrSize = Integer.parseInt(br.readLine());
        String plainStr = br.readLine();

        Long hashVal = 0L;
        int cnt = 0;
        for (char ch : plainStr.toCharArray()) {
            hashVal = (hashVal + (ch - 'a' +1)* rPow(cnt))%M;
        }
        System.out.println(hashVal);
    }

    private static long rPow(int cnt) {
        long retVal = 1;
        while (cnt > 0) {
            retVal = (retVal * R) % M;
            cnt--;
        }
        return retVal;
    }
}
