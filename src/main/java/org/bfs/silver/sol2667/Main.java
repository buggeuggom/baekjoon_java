package org.bfs.silver.sol2667;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int[][] map;
    static boolean[][] visited;


    public static void main(String[] args) throws Exception {

        int N = Integer.parseInt(br.readLine());
        List<Integer> ans = new ArrayList<>();
        map = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine().replace("", " "));
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Queue<int[]> q = new LinkedList<>();
        int tmp;
        int[] now;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (visited[i][j] == false && map[i][j] == 1) {

                    tmp = 1;
                    q.add(new int[]{i, j});
                    visited[i][j] = true;

                    while (!q.isEmpty()) {
                        now = q.poll();
                        for (int k = 0; k < 4; k++) {
                            int ny = now[0] + dy[k];
                            int nx = now[1] + dx[k];
                            if (nx < 0 || ny < 0 || nx >= N || ny >= N) continue;

                            if (map[ny][nx] == 1 && visited[ny][nx] == false) {
                                visited[ny][nx] = true;
                                tmp++;
                                q.add(new int[]{ny, nx});
                            }
                        }
                    }
                    ans.add(tmp);
                }
            }
        }

        ans.sort(Comparator.naturalOrder());

        System.out.println(ans.size());
        for(int i : ans){
            System.out.println(i);
        }
    }
}
