import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
    }

    //Maps each element of a list to a new value using the provided function.
    public static <T, R> List<R> map(Function<T, R> func, List<T> lst) {

        // Create a new list to hold the mapped values
        List<R> result = new ArrayList<R>();

        // Iterate over each element in the input list and apply the provided function
        // to map the element to a new value of type R
        for (T x : lst) {
            R mappedValue = func.apply(x);
            result.add(mappedValue);
        }

        // Return the new list of mapped values
        return result;
    }

    //Filters the elements of a list using the provided predicate.
    public static <T> List<T> filter(Predicate<T> pred, List<T> lst) {

        // Create a new list to hold the filtered elements
        List<T> filteredList = new ArrayList<T>();

        // Iterate over each element in the input list and apply the provided predicate
        // to determine if the element should be included in the filtered list
        for (T item : lst) {
            if (pred.test(item)) {
                filteredList.add(item);
            }
        }

        // Return the new list of filtered elements
        return filteredList;
    }

    // Define a generic method named reduce that takes a binary function, a list of elements, and an optional initial value
    public static <T> T reduce(BiFunction<T, T, T> function, List<T> list, T initialValue) {

        // Initialize an accumulator variable to the initial value (or the first element of the list if no initial value is provided)
        T accumulator = initialValue != null ? initialValue : list.get(0);

        // Iterate over the remaining elements of the list and apply the binary function to the accumulator and the current element
        for (int i = 1; i < list.size(); i++) {
            T element = list.get(i);
            accumulator = function.apply(accumulator, element);
        }

        // Return the accumulated result
        return accumulator;
    }

    // Define a method named compose that takes two Function objects and returns their composition
    public static <T, U, V> Function<T, V> compose(Function<U, V> g, Function<T, U> f) {
        return x -> g.apply(f.apply(x));
    }
}











