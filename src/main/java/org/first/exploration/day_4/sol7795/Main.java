package org.first.exploration.day_4.sol7795;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringTokenizer st;

    public static void main(String[] args) throws Exception {

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int[] A = new int[N];
            for(int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            int[] B = new int[M];
            for(int i = 0; i < M; i++) {
                B[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(B);

            int ans = 0;
            int s;
            int e;
            int m;
            for(int now : A){
                s =0;
                e =M-1;

                while(s<=e){
                    m = (s+e)/2;
                    if (B[m] < now) {
                        s = m+1;
                    } else {
                        e = m-1;
                    }
                }

                ans += s;
            }

            System.out.println(ans);
        }
    }
}
