package yichang;

import com.sun.codemodel.internal.JCatchBlock;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test01 {
    public void print() {
        System.out.println("捕捉空指针异常");
    }
    public static void main(String[] args) throws IOException {
       /* int x = 1;
        int j = 0;
        try {
            int m = x /j;
        }catch (ArithmeticException e) {
            System.out.println("能够捕捉");
        }*/

        Test01 test01 = null;
        /*try{
            test01.print();
        }catch (NullPointerException e) {
            System.out.println("------------");
        }*/
        test01.print();

    }
    public String get() throws IOException {
        String path = null;
        String str = null;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            System.out.println(str.length());
            return br.readLine();
            
        }catch (IOException |NullPointerException e) {
            System.out.println("111111");
        }
    }
}
