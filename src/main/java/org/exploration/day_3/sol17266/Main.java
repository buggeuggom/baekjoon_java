package org.exploration.day_3.sol17266;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static InputStreamReader isr = new InputStreamReader(System.in);
    public static BufferedReader br = new BufferedReader(isr);
    public static void main(String[] args)  throws Exception {

        int sticks  = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int ans = Math.max(arr[0], sticks - arr[N-1]);

        for(int i = 1; i<N; i++){
            int tmp = (arr[i] - arr[i - 1] + 1) / 2;

            ans = Math.max(ans, tmp);
        }

        System.out.println(ans);
    }
}
