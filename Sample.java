public class sample {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = addNumbers(a, b);
        System.out.println("Result: " + c);
        int d = addNumbers(a, b);
        System.out.println("Again: " + d);
    }

    public static int addNumbers(int x, int y) {
        return x + y;
    }
} 