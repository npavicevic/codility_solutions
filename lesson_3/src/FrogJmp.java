public class FrogJmp {
    public static void main (String[] args) {
        int X = 10;
        int Y = 85;
        int D = 30;
        System.out.println("The minimum number of jumps frog needs to perform is " + solution(X,Y,D));
    }

    private static int solution(int X, int Y, int D) {
        return (int)(Math.ceil((Y-X)/(double)D));
    }
}