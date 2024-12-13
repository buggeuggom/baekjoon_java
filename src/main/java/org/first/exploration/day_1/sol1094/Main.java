package org.first.exploration.day_1.sol1094;

import java.util.*;
import java.io.*;

public class Main {
    public static  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringTokenizer st;


    public static void main(String[] args) throws Exception{
        st = new StringTokenizer(br.readLine());

        
        int X = Integer.parseInt(st.nextToken());

        Stack<Integer> arr = new Stack<>();
        arr.push(64);

        int total = 64;

        while (total > X){

            int now = arr.pop();
            now /= 2;

            arr.add(now);
            if (total - now >=X){
                total -= now;
            } else {
                arr.add(now);
            }

        }

        System.out.println(arr.size());

    }
}
