import java.util.*;
import CaUtil.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] test = {1,2,3,4,5,6,7,8,9};
        CaArrays.sort(test, (a,b) -> Integer.compare(a % 3, b % 3));
        int[] test2 = {1,2,3,4,51,6,7,8,9};
        CaArrays.sort(test2, null);
        System.out.println(Arrays.toString(test));
        System.out.println(Arrays.toString(test2));
        Object[] test3 = {new ArrayList<Integer>(), new Object[4], new HashMap<Integer, Integer>()};
        System.out.println(Arrays.deepToString(test3));
    }
}
