package org.bfs.silver.sol2178;

import java.io.*;
import java.util.*;

public class Main {

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {


        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //Y
        int M = Integer.parseInt(st.nextToken()); //X
        int[][] map = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine().replace("", " "));
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Queue<int[]> q = new LinkedList<int[]>();

        q.add(new int[]{0, 0});
        while (!q.isEmpty()) {
            int[] now = q.poll();
            for (int i = 0; i < 4; i++) {

                int ny = now[0] + dy[i];
                int nx = now[1] + dx[i];
                if (nx < 0 || nx >= M || ny < 0 || ny >= N) continue;

                if (map[ny][nx] == 1) {
                    map[ny][nx] += map[now[0]][now[1]];
                    if (ny == N - 1 && nx == M - 1) {
                        System.out.println(map[ny][nx]);
                        return;
                    }
                    q.add(new int[]{ny, nx});
                }

            }
        }
    }
}
