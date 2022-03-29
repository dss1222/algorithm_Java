package 기초연습;

import java.util.Scanner;

public class Study2920 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputs = new int[8];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = scanner.nextInt();
        }
        String output = "";
        for (int i = 0; i < inputs.length - 1; i++) {
            if (inputs[i] == inputs[i + 1] - 1) {
                output = "ascending";
            } else if (inputs[i] == inputs[i + 1] + 1) {
                output = "descending";
            } else {
                output = "mixed";
                break;
            }
        }
        System.out.println(output);
    }
}
