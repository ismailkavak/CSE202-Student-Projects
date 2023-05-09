import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.BiFunction;

public class Test {
    public static void main(String[] args) {
        // Test the map method
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        Function<Integer, Integer> square = x -> x * x;
        List<Integer> output = Main.map(square, input);
        System.out.println(output);


        // Test filter function

        List<String> words = Arrays.asList("GTR R35", "SUPRA", "R34", "SPIDER 458", "R8");
        List<String> filteredWords = Main.filter(word -> word.length() > 4, words);
        System.out.println(filteredWords);

        // Test reduce function
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        int sum = Main.reduce(Integer::sum, nums, 0);
        System.out.println(sum);

        // Test compose function
        Function<Integer, Integer> addOne = x -> x + 1;
        Function<Integer, Integer> multiplyByTwo = x -> x * 2;
        Function<Integer, Integer> composed = Main.compose(multiplyByTwo, addOne);
        int result = composed.apply(5);
        System.out.println(result);

        // Test partition function
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,13,14,15);
        List<List<Integer>> partitioned = Main.partition(integers, n -> n % 2 == 0);
        System.out.println(partitioned);
    }

}




