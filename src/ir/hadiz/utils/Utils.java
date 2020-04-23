package ir.hadiz.utils;

public class Utils {
    public static int[] func(int[] p) {
        int[] pp = new int[p.length + 1];
        System.arraycopy(p, 0, pp, 1, pp.length - 1);
        return pp;
    }
}
