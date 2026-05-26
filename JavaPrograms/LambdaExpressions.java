import java.util.*;

public class LambdaExpressions {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Banana", "Apple", "Mango");

        Collections.sort(list, (a, b) -> a.compareTo(b));

        System.out.println(list);
    }
}