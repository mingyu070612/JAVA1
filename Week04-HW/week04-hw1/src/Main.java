public class Main {
    public static void main(String[] args) {
        int a = 3, b = 4, c;
        c = --a + b--;
        System.out.printf("a = %d, b = %d, c = %d\n", a, b, c);
    }
}