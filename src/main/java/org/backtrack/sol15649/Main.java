package org.backtrack.sol15649;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    static StringTokenizer st;
    static int N, M;

    static boolean[] visit;
    static int[] arr;

    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());


        visit = new boolean[N];
        arr = new int[M];

        dfs(0);
        System.out.println(sb);
    }

    private static void dfs(int depth) {
        if (depth == M){
            for(int val: arr){
                sb.append(val).append(" ");
            }
            sb.append("\n");

            return;
        }

        for(int i = 0; i < N; i++){
            if(!visit[i]){
                visit[i] = true;
                arr[depth] = i+1;
                dfs(depth+1);
                visit[i] = false;
            }
        }
    }
}
