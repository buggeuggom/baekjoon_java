package org.first.dataStructure.day_1.sol1439;

import java.io.*;

public class Main2 {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {

        String request = br.readLine();

        String[] req = request.split("");

        String now = req[0];
        int ans = 1;

        for (String a : req){
            if (!now.equals(a)){
                ans += 1;
                now = a;
            }
        }

        System.out.println((ans/2));
    }
}
