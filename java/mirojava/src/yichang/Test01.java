package yichang;

public class Test01 {
    public void print() {
        System.out.println("捕捉空指针异常");
    }
    public static void main(String[] args) {
       /* int x = 1;
        int j = 0;
        try {
            int m = x /j;
        }catch (ArithmeticException e) {
            System.out.println("能够捕捉");
        }*/

        Test01 test01 = null;
        try{
            test01.print();
        }catch (NullPointerException e) {
            System.out.println("------------");
        }

    }
}
