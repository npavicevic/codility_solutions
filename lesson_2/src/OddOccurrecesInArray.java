import java.util.HashMap;
import java.util.Map;

public class OddOccurrecesInArray {
    public static void main (String[] args) {
        int[] array = {9,3,9,3,9,7,9};
        System.out.println("The unpaired array element is " + solution(array));
    }
    private static int solution(int[] A) {
        Map<Integer, Integer> mapOfPairs = new HashMap<>();
        for (int i : A) {
            if(mapOfPairs.containsKey(i)) {
                mapOfPairs.put(i, mapOfPairs.get(i) + 1);
            } else {
                mapOfPairs.put(i,1);
            }
        }
        for (int i : mapOfPairs.keySet()) {
            if (mapOfPairs.get(i)%2 > 0) {
                return i;
            }
        }
        return 0;
    }
}
