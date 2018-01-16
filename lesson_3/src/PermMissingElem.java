import java.util.Arrays;

public class PermMissingElem {
    public static void main (String[] args) {
        int[] array = {};
        System.out.println("The missing element is " + solution(array));
    }

    private static int solution(int[] A) {
        if(A.length == 0) {
            return 1;
        }
        Arrays.sort(A);
        if(A[0] == 2) {
            return 1;
        }
        for (int i = 1; i < A.length; i++) {
            if (!(A[i-1] == A[i] - 1)) {
                return A[i-1] + 1;
            }
        }
        return A[A.length-1] + 1;
    }
}
