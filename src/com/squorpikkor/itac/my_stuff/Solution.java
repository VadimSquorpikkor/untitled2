package com.squorpikkor.itac.my_stuff;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        if (N <= 0) return;
        int maximum, a1, a;
        a1 = Integer.parseInt(reader.readLine());
        for(int i = 1; i < N; i++) {
            a = Integer.parseInt(reader.readLine());
            maximum = max(a1, a);
            a1 = maximum;
        }
        System.out.print(a1);
    }
    public static int max(int a, int b)
    { return a > b ? a : b; }

}
