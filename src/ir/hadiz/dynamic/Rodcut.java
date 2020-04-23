package ir.hadiz.dynamic;

import java.util.Arrays;

import static ir.hadiz.utils.Utils.func;

// this solution shows us the maximum price and the way.

public class Rodcut {
    private int[] p, r, x;

    public Rodcut(int[] p) {
        this.p = func(p);
        this.x = new int[p.length+1];
        this.r = new int[p.length+1];
    }

    public void start() {
        System.out.println("prices :" + Arrays.toString(p));
        System.out.println("result is : " + rodcut_dp(p.length - 1));
        System.out.println("result of i :" + Arrays.toString(r));
        System.out.println("selected items :" + Arrays.toString(x));
        System.out.println("selected items are -> "+print(p.length - 1));
    }

    public int rodcut_dp(int n) {
        int max, index;
        for (int i = 1; i <= n; i++) {
            max = Integer.MIN_VALUE;
            index = 0;
            for (int j = 1; j <= i; j++) {
                int result = p[j] + r[i - j];
                if (result > max) {
                    max = result;
                    index = j;
                }

            }
            r[i] = max;
            x[i] = index;
        }

        return r[n];
    }

    public String print(int n) {
        if (n <= 0)
            return "";
        return x[n] + ":" + print(n - x[n]);
    }

}

// this solution only shows us the maximum price

//package ir.hadiz.dynamic;
//
//        import java.util.Arrays;
//
//public class Rodcut {
//    int[] p, x;
//    int length;
//
//    public Rodcut(int[] p) {
//        this.p = p;
//        this.length = p.length;
//        this.x = new int[p.length];
//    }
//
//    public void start() {
//        System.out.println(Arrays.toString(p));
//        int result = rodcut_dp(length);
//        System.out.println("result is : " + result);
//    }
//
//    private int rodcut_dp(int n) {
//        if (n <= 0)
//            return 0;
//
//        int max_val = Integer.MIN_VALUE;
//
//        for (int i = 0; i < n; i++)
//            max_val = Math.max( max_val, p[i] + rodcut_dp(n - i - 1) );
//
//        return max_val;
//    }
//
//}