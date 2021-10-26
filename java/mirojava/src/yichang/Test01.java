package yichang;

public class Test01 {
    public static void main(String[] args) {
        int x = 1;
        int j = 0;
        try {
            int m = x /j;
        }catch (ArithmeticException e) {
            System.out.println("能够捕捉");
        }
    }
}
