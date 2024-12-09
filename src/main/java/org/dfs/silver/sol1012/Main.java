package org.dfs.silver.sol1012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    private static int T, M, N, K; //가 세 위

    private static int[][] arr;
    private static boolean[][] check;

    private static int[] dx = { 0, -1, 0, 1 };
    private static int[] dy = { 1, 0, -1, 0 };

    public static void main(String[] args) throws IOException {

        T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int ans = 0;
            st = new StringTokenizer(br.readLine(), " ");
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            arr = new int[M][N];
            check = new boolean[M][N];

            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                arr[a][b] = 1;
            }

            for(int i = 0; i<M; i++) {
                for(int j = 0; j<N; j++) {
                    if(arr[i][j] == 1 && !check[i][j]) {
                        dfs(i, j);
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        }
    }

    private static void dfs(int y, int x) {
        check[y][x] = true;
        for(int i = 0; i<4; i++){
            int ny = y+dy[i];
            int nx = x+dx[i];
            if(0 > ny || ny >= M || 0> nx || nx >= N)  continue;
            if (check[ny][nx] || arr[ny][nx] == 0) continue;
            dfs(ny, nx);
        }
    }
}
