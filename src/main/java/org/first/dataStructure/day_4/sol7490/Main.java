package org.first.dataStructure.day_4.sol7490;

import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static List<String> ans;
    static String[] op = {"+", "-", " "};
    public static void main(String[] args) throws Exception {

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            N = Integer.parseInt(br.readLine());
            ans = new ArrayList<>();

            dfs(1, "1");
            Collections.sort(ans);
            for(String s: ans){
                System.out.println(s);
            }
            System.out.println();
        }
    }

    private static void dfs(int num, String s) {
        if (num == N) {
            String expression = s.replaceAll(" ", "");
            if (cal(expression)) ans.add(s);

            return;
        }

        for(int i = 0;  i<3; i++){
            dfs(num+1, s+op[i]+(num+1));
        }
    }

    private static boolean cal(String expression) {
        StringTokenizer st = new StringTokenizer(expression, "-|+", true);
        int sum = Integer.parseInt(st.nextToken());
        while (st.hasMoreElements()) {
            String s = st.nextToken();
            sum = (s.equals("+")) ? sum+Integer.parseInt(st.nextToken()) : sum - Integer.parseInt(st.nextToken());
        }

        return (sum==0)? true : false;
    }
}
