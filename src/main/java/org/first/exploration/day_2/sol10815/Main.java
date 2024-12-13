package org.first.exploration.day_2.sol10815;

import java.io.*;
import java.util.*;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {

        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int now = Integer.parseInt(st.nextToken());
            map.put(now, map.getOrDefault(now, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            sb.append(map.getOrDefault(Integer.parseInt(st.nextToken()), 0) + " ");
        }

        System.out.println(sb.toString().trim());
    }

    public static void main2(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] Ns = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            Ns[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(Ns);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            int s = 0;
            int e = M;
            int m, now;
            int ans = 0;

            while (s<= e){
                m = (s + e)/2;
                now = Ns[m];
                if (tmp == now){
                    ans = 1;
                    break;
                } else if (now < tmp) {
                    s = m + 1;
                } else {
                    e = m - 1;
                }
            }
            sb.append(ans).append(" ");
        }
        System.out.println(sb.toString().trim());
    }


}
