package core_exp;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SocketTest {
    public static void main(String[] args) {
        //try的用法-可以不与catch绑定，可以抛出去
        //try 加一个小括号

        //打开我们这边的socket，就是和他通信
        try {
            //所有的别人的响应信息都会放到socket的输入流
            //解析拿到别人给我们的信息
            Socket s = new Socket("www.baidu.com", 8080);
            s.setSoTimeout(20000);
            Scanner in = new Scanner(s.getInputStream(), "utf-8");
            while (in.hasNextLine()) {
                String line = in.nextLine();
                System.out.println(line);
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
            System.out.println(1111);
        }catch (InterruptedIOException e) {
            System.out.println(33333);
        }catch (IOException e) {
            e.printStackTrace();
            System.out.println(22222);
        }
    }
}
