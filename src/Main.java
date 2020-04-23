import ir.hadiz.dynamic.IntegerKnapsack;

public class Main {
    public static void main(String[] args) {
        int[] w = {5, 20, 30};
        int[] p = {10, 100, 120};

        new IntegerKnapsack(w, p, 50).start();
    }
}
