package Day_2;

public class Recursion2 {
    private static final String RED = "\033[0;31m";

    public static void main(String[] args) {
        int result = sum(5 , 10);
        System.out.println(RED + result);
    }

    private static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, --end);
        } else {
            return end;
        }

    }
}
