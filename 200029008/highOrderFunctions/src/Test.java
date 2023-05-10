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
//REPORT

/*

map
The map method takes a function that maps a value of type T to a value of type R, and applies that function to every element in a list of type T. The resulting list contains the mapped values of type R. This is a common functional programming technique called mapping.

filter
The filter method takes a predicate that tests whether a given element of type T should be included in the resulting list. The method applies the predicate to every element in a list of type T, and returns a new list containing only the elements that satisfy the predicate. This is a common functional programming technique called filtering.

reduce
The reduce method takes a binary function, a list of elements of type T, and an optional initial value of type T. The method applies the binary function to the elements in the list, starting with the initial value (or the first element in the list if no initial value is provided), and returns a single result of type T. This is a common functional programming technique called reducing.

compose
The compose method takes two functions, f and g, and returns their composition as a new function. The resulting function applies f to its input, and then applies g to the result of f. This is a common functional programming technique called function composition.

partition
The partition method takes a list of type T and a predicate that tests whether a given element of type T should be included in the resulting list. The method returns a list of two sub-lists: one containing the elements that satisfy the predicate, and the other containing the elements that do not satisfy the predicate. This is a common functional programming technique called partitioning.

Challenges and Difficulties
One challenge with functional programming in Java is that the language is not purely functional, and so it may be more difficult to use some functional programming techniques. For example, the syntax for defining anonymous functions (lambdas) in Java can be verbose and less intuitive than in other functional languages. Additionally, some of the functional programming techniques used in these methods (such as function composition) may be unfamiliar to developers who are used to imperative programming styles.

Overall, these methods demonstrate how functional programming techniques can be used to write concise, expressive, and reusable code in Java.
 */



