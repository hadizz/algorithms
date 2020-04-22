package ir.hadiz.dynamic;

import java.util.Arrays;

public class Rodcut {
    int[] p, x;
    int length;

    public Rodcut(int[] p) {
        this.p = p;
        this.length = p.length;
        this.x = new int[p.length];
    }

    public void start() {
        System.out.println(Arrays.toString(p));
        int result = rodcut(length);
        System.out.println("result is : " + result);
    }

    private int rodcut(int n) {
        if (n <= 0)
            return 0;

        int max_val = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++)
            max_val = Math.max( max_val, p[i] + rodcut(n - i - 1) );

        return max_val;
    }

}
