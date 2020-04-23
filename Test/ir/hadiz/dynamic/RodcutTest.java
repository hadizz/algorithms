package ir.hadiz.dynamic;

import org.junit.Assert;
import org.junit.Test;

public class RodcutTest {

    private int[] arr;

    @Test
    public void rodcutShouldWork() {
        Rodcut rodcut;

        arr = new int[]{1, 5, 8, 9, 10, 17, 17, 20};
        rodcut = new Rodcut(arr);
        Assert.assertEquals("test 1",22, rodcut.rodcut_dp(arr.length));

        arr = new int[]{1, 3, 4, 5};
        rodcut = new Rodcut(arr);
        Assert.assertEquals("test 2",6, rodcut.rodcut_dp(arr.length));
    }

    @Test
    public void printShouldWork() {
    }
}