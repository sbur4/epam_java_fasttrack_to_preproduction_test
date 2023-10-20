import java.util.function.Function;
import java.util.function.UnaryOperator;

public class App5 {
    public static void main(String[] args) {
        // UnaryOperator<Integer> u = x -> x * x; ?

        UnaryOperator<Integer> u = x -> x * x;
        Integer result1 = u.apply(2);
        System.out.println(result1); // 4

        Function<Integer, Integer> f = x -> x * x;
        Integer result2 = f.apply(2);
        System.out.println(result2); // 4
    }
}

// Answer - /-/ Function<Integer, Integer> f = x -> x * x; /+/ -> +