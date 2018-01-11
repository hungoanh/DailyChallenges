import java.util.Hashtable;

/**
 * Created by hle on 12/9/17.
 */
public class LearnHashTable {
    public static void main(String [] args) {
        Hashtable<String, int []> numbers = new Hashtable<>();
        int [] arrayOne = {1, 2};
        int [] arrayTwo = {3, 4};
        int [] arrayThree = {5, 6};
        numbers.put("one", arrayOne);
        numbers.put("two", arrayTwo);
        numbers.put("three", arrayThree);



        System.out.println(numbers.get("one").hashCode());
        System.out.println(numbers.get("three").equals(numbers.get("one")));
    }
}
