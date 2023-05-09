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
}











