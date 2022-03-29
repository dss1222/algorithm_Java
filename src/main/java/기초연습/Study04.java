package 기초연습;

import java.util.Scanner;

public class Study04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        int h=0, m=0;
        if (M < 45) {
            if (H == 0) {
                h = 23;
            } else {
                h = H - 1;
            }
            m = 60 + (M - 45);
        } else {
            h = H;
            m = M-45;
        }
        System.out.println(h);
        System.out.println(m);
    }

}
