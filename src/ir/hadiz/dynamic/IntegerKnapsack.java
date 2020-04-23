package ir.hadiz.dynamic;

import java.util.Arrays;

import static ir.hadiz.utils.Utils.func;

public class IntegerKnapsack {

    private int[] w, p, m, x;
    private int limit;

    public IntegerKnapsack(int[] w, int[] p, int limit) {
        this.w = func(w);
        this.p = func(p);
        this.m = new int[limit + 1];
        this.x = new int[limit + 1];
        this.limit = limit;
    }

    public void start() {
        System.out.println("limit : " + limit);
        System.out.println("prices :" + Arrays.toString(w));
        System.out.println("weights :" + Arrays.toString(p));
        System.out.println("result is : " + knapsack_dp(w.length - 1));
//        System.out.println("m :" + Arrays.toString(m));
        for (int i = 0; i < m.length; i++) {
            if (m[i] >0)
                System.out.print(String.format("{%d:%d}, ",i,m[i]));
        }

//        System.out.println("\nx :" + Arrays.toString(x));
        System.out.println("choices : " + print(limit));
    }

    public int knapsack_dp(int n) {
        int max, index, result;

        for (int i = 1; i <= limit; i++) {
            max = Integer.MIN_VALUE;
            index = 0;
            for (int j = 1; j <= n; j++) {
                if (i >= w[j]) {
                    result = p[j] + m[i - w[j]];
                    if (result > max) {
                        max = result;
                        index = j;
                    }
                }
            }
            m[i] = max;
            x[i] = index;
        }

        return m[limit];
    }

    public String print(int W) {
        if (W <= 0)
            return "";
        int weight = W - w[x[W]];
        return x[W] + ":" + print(weight);
    }

}
