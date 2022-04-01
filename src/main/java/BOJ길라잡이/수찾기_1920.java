package BOJ길라잡이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 수찾기_1920 {

    public static int[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            if (binarySearch(Integer.parseInt(st.nextToken())) >= 0) {
                sb.append(1).append('\n');
            } else {
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static int binarySearch(int key) {
        int lo=0;               //탐색 범위의 왼쪽 끝 인덱스
        int hi=arr.length-1;    //탐색 범위의 오른쪽 끄 인덱스

        while (lo <= hi) {
            int mid = (lo+hi)/2; //중간 위치

            //key값이 중간 위치의 값보다 작을 경우
            if (key < arr[mid]) {
                hi = mid - 1;
            } else if (key > arr[mid]) { //key값이 중간위치 값보다 클 경우
                lo = mid + 1;
            } else {
                return mid; //key값이 중간 위치의 값이 같을 경우
            }
        }
        return -1; //찾고자 하는 값이 존재하지 않을 경우

    }
}
