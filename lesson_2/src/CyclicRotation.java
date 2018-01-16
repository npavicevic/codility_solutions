public class CyclicRotation {
    public static void main (String[] args) {
        int[] array = {3, 8, 9, 7, 6};
        int rotation = 3;
        int[] rotatedArray = solution(array, rotation);
        System.out.print("The rotated array is: {");
        for (int i = 0; i < rotatedArray.length; i++) {
            if (i == rotatedArray.length - 1) {
                System.out.print(rotatedArray[i]);
            } else {
                System.out.print(rotatedArray[i] + ", ");
            }
        }
        System.out.println("}");
    }

    private static int[] solution(int[] A, int K) {
        if(K == 0) {
            return A;
        }
        int[] rotatedArray = new int[A.length];
        int counter = 0;
        while (counter < K) {
            for (int i = 0; i < A.length; i++) {
                if(i == A.length - 1) {
                    rotatedArray[0] = A[i];
                } else {
                    rotatedArray[i+1] = A[i];
                }
            }
            A = rotatedArray.clone();
            counter++;
        }
        return rotatedArray;
    }
}
