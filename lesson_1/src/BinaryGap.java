public class BinaryGap {
    public static void main (String[] args) {
        int decimalNumber = 1041;
        System.out.println("The largest binary gap in the given integer is " + solution(decimalNumber));
    }

    private static int solution(int N) {
        String binary = Integer.toBinaryString(N);
        int maxGap = 0;
        int currentGap = 0;
        for(int i = 0; i < binary.length(); i++) {
            if(Character.getNumericValue(binary.charAt(i)) == 0) {
                currentGap++;
            } else {
                if(currentGap > maxGap) {
                    maxGap = currentGap;
                }
                currentGap = 0;
            }
        }
        return maxGap;
    }
}
