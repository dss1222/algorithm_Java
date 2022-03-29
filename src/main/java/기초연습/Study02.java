package 기초연습;

import java.util.Scanner;

public class Study02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int temp = in.nextInt();
            sum += temp*temp;
        }
        int result = sum%10;
        System.out.println(result);
    }
}
