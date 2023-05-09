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

        


    }

}




