package DSA;

public class Recursion {
    public static void main(String[] args) {
        // a function calling itself that is recursion
        int result = fact(5);
        System.out.println(result);
    }

    public static int fact(int i) {

        if (i != 0)
            return i * fact(i - 1);
        return 1;

    }
}
