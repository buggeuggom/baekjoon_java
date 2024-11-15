package org.dataStructure.day_7.sol14725;

import java.io.*;
import java.util.*;

public class Main {
    public static BufferedReader br;
    public static StringTokenizer st;
    public static String BLANK = "--";

    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int K;
        String[] tmp;

        List<String[]> arr = new ArrayList<>();
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            K = Integer.parseInt(st.nextToken());
            tmp = new String[K];

            arr.add(tmp);
        }

        arr.sort((a1, a2) -> {
            int len = Math.min(a1.length, a2.length);
            for (int i = 0; i < len; i++) {
                int cmp = a1[i].compareTo(a2[i]);
                if (cmp != 0) {
                    return cmp;
                }
            }
            return Integer.compare(a1.length, a2.length);
        });
        
        for(String[] ar : arr){
            int length = ar.length;

        }

    }
}
