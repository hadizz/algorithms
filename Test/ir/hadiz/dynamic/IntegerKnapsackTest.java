package ir.hadiz.dynamic;

import org.junit.Assert;
import org.junit.Test;

public class IntegerKnapsackTest {

    private int[] w, p;
    private int limit;


    @Test
    public void knapsack_dp() {
        IntegerKnapsack knapsack;

        w = new int[]{5, 20, 30};
        p = new int[]{10, 100, 120};
        limit = 50;
        knapsack = new IntegerKnapsack(w,p,limit);
        Assert.assertEquals("test 1",220, knapsack.knapsack_dp(w.length));

        w = new int[]{5, 20, 30};
        p = new int[]{10, 100, 120};
        limit = 40;
        knapsack = new IntegerKnapsack(w,p,limit);
        Assert.assertEquals("test 2",200, knapsack.knapsack_dp(w.length));


    }

    @Test
    public void print() {
    }
}