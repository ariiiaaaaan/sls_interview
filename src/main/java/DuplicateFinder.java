import java.util.HashMap;
import java.util.Map;


public class DuplicateFinder {
    private static HashMap<Integer,Integer> duplicateCounter = new HashMap<Integer, Integer>();
    private static void duplicateFinder(int[] n) {
        for (int item : n) {
            if (duplicateCounter.get(item) == null) {
                duplicateCounter.put(item, 1);
            } else {
                duplicateCounter.put(item, (duplicateCounter.get(item)) + 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : duplicateCounter.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if(value!=1) {
                System.out.println(key + " has " + value + " duplicates");
            }
        }
    }
    public static void main(String[] args) {
        int[] input = {1, 2, 1, 3, 3, 1, 5, 2, 6, 1, 3, 5, 6, 6, 12, 11, 10, 12};
        duplicateFinder(input);
    }
}
