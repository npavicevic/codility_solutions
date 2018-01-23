public class TapeEquilibrium {
    public static void main(String[] args) {
        int[] array = {-10, -20, -30, -40, 100};
        System.out.println("The minimal difference that can be achieved is " + solution(array));
    }

    private static int solution(int[] A) {
        int minDif = 2000;
        int tempSum = 0;
        int sum = 0;

        for (int i : A) {
            sum += i;
        }

        for (int i = 0; i < A.length - 1; i++) {
            tempSum += A[i];
            sum -= A[i];
            minDif = Math.min(minDif, Math.abs(tempSum - sum));
        }

        return minDif;
    }
}
