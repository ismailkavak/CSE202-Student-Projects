import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        // Test the map method
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        Function<Integer, Integer> square = x -> x * x;
        List<Integer> output = Main.map(square, input);
        System.out.println(output);
    }

}
