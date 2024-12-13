package org.backtrack.sol15650;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;
    private static StringBuilder sb = new StringBuilder();

    private static int[] arr;
    private static int N,M;

    public static void main(String[] args) throws Exception {

      st = new StringTokenizer(br.readLine());

      N = Integer.parseInt(st.nextToken());
      M = Integer.parseInt(st.nextToken());

      arr = new int[M];

      dfs(1, 0);
      System.out.println(sb);
    }

    private static void dfs(int now, int depth) {
        if (depth == M) {
            for(int val: arr){
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = now; i<=N;i++){
          arr[depth] = i;
          dfs(now+1, depth+1);
        }
    }
}
